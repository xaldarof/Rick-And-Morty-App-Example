package com.example.daggerhilt.data.cache.data_source

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import androidx.room.withTransaction
import com.example.daggerhilt.data.cache.core.AppDataBase
import com.example.daggerhilt.data.cache.models.RemoteKeyDb
import com.example.daggerhilt.data.cache.models.RickAndMortyCacheModel
import com.example.daggerhilt.data.cloud.CloudConstants
import com.example.daggerhilt.data.cloud.data_source.RickAndMortyApiService
import retrofit2.HttpException
import java.io.IOException
import java.lang.Exception
import javax.inject.Inject

@ExperimentalPagingApi
class RickAndMortyRemoteMediator
@Inject constructor(
    private val appDataBase: AppDataBase,
    private val rickAndMortyApiService: RickAndMortyApiService

    ) : RemoteMediator<Int, RickAndMortyCacheModel>() {

    override suspend fun load(loadType: LoadType, state: PagingState<Int, RickAndMortyCacheModel>): MediatorResult {

        val page = when (loadType) {

            LoadType.REFRESH -> {
                val remoteKey = getItemForClosestPosition(state)
                remoteKey?.nextKey?.minus(1) ?: CloudConstants.START_PAGE
            }

            LoadType.PREPEND -> {
                val remoteKey = getItemForFirstPosition(state)
                remoteKey?.prevKey
                    ?: return MediatorResult.Success(endOfPaginationReached = remoteKey != null)
            }

            LoadType.APPEND -> {
                val remoteKey = getItemForLastPosition(state)
                remoteKey?.nextKey
                    ?: return MediatorResult.Success(endOfPaginationReached = remoteKey != null)
            }
        }

        try {

            val response = rickAndMortyApiService.fetchCharacters(page)

            val isEndPagingReached = response.results.isEmpty()

            appDataBase.withTransaction {

                if (loadType == LoadType.REFRESH){
                    appDataBase.rickAndMortyDaoProvider().clearCache()
                    appDataBase.remoteKeyDaoProvider().clearRemoteKeys()
                }

                val prevKey = if (page == CloudConstants.START_PAGE) null else page - 1
                val nextKey = if (isEndPagingReached) null else page + 1

                val keys = response.results.map {
                    RemoteKeyDb(it.id,prevKey=prevKey,nextKey=nextKey)
                }

                appDataBase.remoteKeyDaoProvider().insertRemoteKeys(keys)
                appDataBase.rickAndMortyDaoProvider().addRickAndMortyData(
                    response.results.map { it.mapToCacheModel() })

            }

            return MediatorResult.Success(endOfPaginationReached = isEndPagingReached)

        } catch (e: Exception) {
            return MediatorResult.Error(e)
        } catch (e: HttpException) {
            return MediatorResult.Error(e)
        } catch (e: IOException) {
            return MediatorResult.Error(e)
        }
    }

    private fun getItemForClosestPosition(state: PagingState<Int, RickAndMortyCacheModel>): RemoteKeyDb? {
        return state.anchorPosition?.let {
            state.closestItemToPosition(it)?.id?.let {
                appDataBase.remoteKeyDaoProvider().fetchRemoteKey(it)
            }
        }
    }


    private fun getItemForFirstPosition(state: PagingState<Int, RickAndMortyCacheModel>): RemoteKeyDb? {
        return state.pages.firstOrNull { it.data.isNotEmpty() }?.data?.firstOrNull()
            ?.let {
                appDataBase.remoteKeyDaoProvider().fetchRemoteKey(it.id)
            }
    }

    private fun getItemForLastPosition(state: PagingState<Int, RickAndMortyCacheModel>): RemoteKeyDb? {
        return state.pages.lastOrNull { it.data.isNotEmpty() }?.data?.lastOrNull()
            ?.let {
                appDataBase.remoteKeyDaoProvider().fetchRemoteKey(it.id)
            }
    }
}