package com.example.daggerhilt.data.cache.core

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.daggerhilt.data.cache.dao.RickAndMortyDao
import com.example.daggerhilt.data.cache.dao.RemoteKeyDao
import com.example.daggerhilt.data.cache.models.RemoteKeyDb
import com.example.daggerhilt.data.cache.models.RickAndMortyCacheModel

@Database(entities = [RickAndMortyCacheModel::class,RemoteKeyDb::class],version = 2)
abstract class AppDataBase : RoomDatabase(){

    abstract fun rickAndMortyDaoProvider(): RickAndMortyDao
    abstract fun remoteKeyDaoProvider(): RemoteKeyDao

    companion object {

        fun getInstance(context: Context): AppDataBase {
            return Room.databaseBuilder(context, AppDataBase::class.java,"DB")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
        }
    }
}