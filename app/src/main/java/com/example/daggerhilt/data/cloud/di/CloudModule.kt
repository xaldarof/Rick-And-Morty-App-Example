package com.example.daggerhilt.data.cloud.di

import com.example.daggerhilt.data.cloud.CloudConstants
import com.example.daggerhilt.data.cloud.data_source.RickAndMortyApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object CloudModule {


    @Singleton
    @Provides
    fun provideService(retrofit: Retrofit): RickAndMortyApiService = retrofit.create(
        RickAndMortyApiService::class.java)

    @Singleton
    @Provides
    fun provideRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(CloudConstants.BASE_URL).build()
    }
}