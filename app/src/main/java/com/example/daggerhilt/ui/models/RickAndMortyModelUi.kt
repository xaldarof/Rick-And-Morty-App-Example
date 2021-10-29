package com.example.daggerhilt.ui.models

import java.io.Serializable


data class RickAndMortyModelUi(
    val id:Int,
    val name:String,
    val status: String,
    val gender:String,
    val location:String,
    val image:String
):Serializable