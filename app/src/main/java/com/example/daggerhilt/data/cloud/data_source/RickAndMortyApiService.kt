package com.example.daggerhilt.data.cloud.data_source

import com.example.daggerhilt.data.cloud.models.Result
import com.example.daggerhilt.data.cloud.models.RickAndMortyCloudModel
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface RickAndMortyApiService {

    @GET("character")
    suspend fun fetchCharacters(@Query("page") page: Int): RickAndMortyCloudModel


    @GET("character/{id}")
    suspend fun fetchCharacterById(
        @Path("id") id:Int):Result

}