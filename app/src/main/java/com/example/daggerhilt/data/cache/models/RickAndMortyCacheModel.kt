package com.example.daggerhilt.data.cache.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.daggerhilt.ui.models.RickAndMortyModelUi

@Entity(tableName = "rick_and_morty")
data class RickAndMortyCacheModel(

    @PrimaryKey
    val id:Int,

    val name:String,
    val status: String,
    val gender:String,
    val location:String,
    val image:String

    ) {

    fun mapToUiModel():RickAndMortyModelUi {
        return RickAndMortyModelUi(id, name, status, gender, location, image)
    }
}