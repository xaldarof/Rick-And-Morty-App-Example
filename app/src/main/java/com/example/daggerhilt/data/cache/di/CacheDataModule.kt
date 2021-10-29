package com.example.daggerhilt.data.cache.di

import android.content.Context
import com.example.daggerhilt.data.cache.core.AppDataBase
import com.example.daggerhilt.data.cache.dao.RickAndMortyDao
import com.example.daggerhilt.data.cache.data_source.RickAndMortyRepository
import com.example.daggerhilt.data.cache.dao.RemoteKeyDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object CacheDataModule {

    @Provides
    fun provideCoreDao(appDataBase: AppDataBase): RickAndMortyDao {
        return appDataBase.rickAndMortyDaoProvider()
    }

    @Provides
    fun provideRemoteDao(appDataBase: AppDataBase): RemoteKeyDao {
        return appDataBase.remoteKeyDaoProvider()
    }


    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDataBase {
        return AppDataBase.getInstance(context)
    }


    @Provides
    fun provideLogRepository(rickAndMortyRepository: RickAndMortyRepository.Base): RickAndMortyRepository {
        return rickAndMortyRepository
    }

}