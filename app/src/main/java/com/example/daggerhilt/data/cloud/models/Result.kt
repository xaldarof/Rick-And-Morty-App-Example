package com.example.daggerhilt.data.cloud.models

import com.example.daggerhilt.data.cache.models.RickAndMortyCacheModel

data class Result(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: Location,
    val name: String,
    val origin: Origin,
    val species: String,
    val status: String,
    val type: String,
    val url: String
){
    fun mapToCacheModel():RickAndMortyCacheModel{
        return RickAndMortyCacheModel(id,name,status,gender,location.name,image)
    }
}