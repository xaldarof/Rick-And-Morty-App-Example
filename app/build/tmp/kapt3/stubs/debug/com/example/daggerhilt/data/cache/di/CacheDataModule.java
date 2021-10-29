package com.example.daggerhilt.data.cache.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/example/daggerhilt/data/cache/di/CacheDataModule;", "", "()V", "provideCoreDao", "Lcom/example/daggerhilt/data/cache/dao/RickAndMortyDao;", "appDataBase", "Lcom/example/daggerhilt/data/cache/core/AppDataBase;", "provideDatabase", "context", "Landroid/content/Context;", "provideLogRepository", "Lcom/example/daggerhilt/data/cache/data_source/RickAndMortyRepository;", "rickAndMortyRepository", "Lcom/example/daggerhilt/data/cache/data_source/RickAndMortyRepository$Base;", "provideRemoteDao", "Lcom/example/daggerhilt/data/cache/dao/RemoteKeyDao;", "app_debug"})
@dagger.Module()
public final class CacheDataModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.daggerhilt.data.cache.di.CacheDataModule INSTANCE = null;
    
    private CacheDataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.daggerhilt.data.cache.dao.RickAndMortyDao provideCoreDao(@org.jetbrains.annotations.NotNull()
    com.example.daggerhilt.data.cache.core.AppDataBase appDataBase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.daggerhilt.data.cache.dao.RemoteKeyDao provideRemoteDao(@org.jetbrains.annotations.NotNull()
    com.example.daggerhilt.data.cache.core.AppDataBase appDataBase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.daggerhilt.data.cache.core.AppDataBase provideDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.daggerhilt.data.cache.data_source.RickAndMortyRepository provideLogRepository(@org.jetbrains.annotations.NotNull()
    com.example.daggerhilt.data.cache.data_source.RickAndMortyRepository.Base rickAndMortyRepository) {
        return null;
    }
}