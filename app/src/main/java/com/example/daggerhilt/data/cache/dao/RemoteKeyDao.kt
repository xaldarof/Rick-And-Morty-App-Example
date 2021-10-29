package com.example.daggerhilt.data.cache.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.daggerhilt.data.cache.models.RemoteKeyDb

@Dao
interface RemoteKeyDao {

    @Query("SELECT * FROM remote_keys WHERE characterId=:id")
    fun fetchRemoteKey(id:Int):RemoteKeyDb


    @Insert
    fun insertRemoteKeys(list: List<RemoteKeyDb>)

    @Query("DELETE FROM remote_keys")
    fun clearRemoteKeys()
}