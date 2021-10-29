package com.example.daggerhilt.data.cache.core;

import java.lang.System;

@androidx.room.Database(entities = {com.example.daggerhilt.data.cache.models.RickAndMortyCacheModel.class, com.example.daggerhilt.data.cache.models.RemoteKeyDb.class}, version = 2)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/daggerhilt/data/cache/core/AppDataBase;", "Landroidx/room/RoomDatabase;", "()V", "remoteKeyDaoProvider", "Lcom/example/daggerhilt/data/cache/dao/RemoteKeyDao;", "rickAndMortyDaoProvider", "Lcom/example/daggerhilt/data/cache/dao/RickAndMortyDao;", "Companion", "app_debug"})
public abstract class AppDataBase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.daggerhilt.data.cache.core.AppDataBase.Companion Companion = null;
    
    public AppDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.daggerhilt.data.cache.dao.RickAndMortyDao rickAndMortyDaoProvider();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.daggerhilt.data.cache.dao.RemoteKeyDao remoteKeyDaoProvider();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/daggerhilt/data/cache/core/AppDataBase$Companion;", "", "()V", "getInstance", "Lcom/example/daggerhilt/data/cache/core/AppDataBase;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.daggerhilt.data.cache.core.AppDataBase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}