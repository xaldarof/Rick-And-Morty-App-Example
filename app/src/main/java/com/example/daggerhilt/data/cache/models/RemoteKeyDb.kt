package com.example.daggerhilt.data.cache.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "remote_keys")
data class RemoteKeyDb(

    @PrimaryKey(autoGenerate = true)
    val characterId:Int,
    val prevKey:Int?,
    val nextKey:Int?
)