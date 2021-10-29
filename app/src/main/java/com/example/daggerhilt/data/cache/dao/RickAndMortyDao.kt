package com.example.daggerhilt.data.cache.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.daggerhilt.data.cache.models.RickAndMortyCacheModel
import com.example.daggerhilt.data.cloud.models.Result

@Dao
interface RickAndMortyDao {

    @Query("SELECT * FROM rick_and_morty")
    fun fetchRickAndMortyData():PagingSource<Int,RickAndMortyCacheModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addRickAndMortyData(list: List<RickAndMortyCacheModel>)

    @Query("DELETE FROM rick_and_morty")
    suspend fun clearCache()
}