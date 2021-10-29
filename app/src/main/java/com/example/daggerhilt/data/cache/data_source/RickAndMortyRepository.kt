package com.example.daggerhilt.data.cache.data_source

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.daggerhilt.data.cache.core.AppDataBase
import com.example.daggerhilt.data.cache.models.RickAndMortyCacheModel
import com.example.daggerhilt.data.cloud.data_source.RickAndMortyApiService
import com.example.daggerhilt.data.cloud.models.Result
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface RickAndMortyRepository {

    suspend fun fetchRickAndMorty():Flow<PagingData<RickAndMortyCacheModel>>
    suspend fun fetchCharacterById(id:Int):Result

    class Base @Inject constructor(private val appDataBase: AppDataBase,
                                   private val service: RickAndMortyApiService
    ):
        RickAndMortyRepository {

        @ExperimentalPagingApi
        override suspend fun fetchRickAndMorty(): Flow<PagingData<RickAndMortyCacheModel>> {
           return Pager(config = PagingConfig(enablePlaceholders = false,pageSize = 10),
               remoteMediator = RickAndMortyRemoteMediator(appDataBase,service),
               pagingSourceFactory = {appDataBase.rickAndMortyDaoProvider().fetchRickAndMortyData() }
               ).flow
        }

        override suspend fun fetchCharacterById(id: Int): Result = service.fetchCharacterById(id)
    }
}