package com.example.daggerhilt.data.cache.data_source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/daggerhilt/data/cache/data_source/RickAndMortyRepository;", "", "fetchCharacterById", "Lcom/example/daggerhilt/data/cloud/models/Result;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchRickAndMorty", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/daggerhilt/data/cache/models/RickAndMortyCacheModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Base", "app_debug"})
public abstract interface RickAndMortyRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchRickAndMorty(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.daggerhilt.data.cache.models.RickAndMortyCacheModel>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchCharacterById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.daggerhilt.data.cloud.models.Result> continuation);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/daggerhilt/data/cache/data_source/RickAndMortyRepository$Base;", "Lcom/example/daggerhilt/data/cache/data_source/RickAndMortyRepository;", "appDataBase", "Lcom/example/daggerhilt/data/cache/core/AppDataBase;", "service", "Lcom/example/daggerhilt/data/cloud/data_source/RickAndMortyApiService;", "(Lcom/example/daggerhilt/data/cache/core/AppDataBase;Lcom/example/daggerhilt/data/cloud/data_source/RickAndMortyApiService;)V", "fetchCharacterById", "Lcom/example/daggerhilt/data/cloud/models/Result;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchRickAndMorty", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/daggerhilt/data/cache/models/RickAndMortyCacheModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static final class Base implements com.example.daggerhilt.data.cache.data_source.RickAndMortyRepository {
        private final com.example.daggerhilt.data.cache.core.AppDataBase appDataBase = null;
        private final com.example.daggerhilt.data.cloud.data_source.RickAndMortyApiService service = null;
        
        @javax.inject.Inject()
        public Base(@org.jetbrains.annotations.NotNull()
        com.example.daggerhilt.data.cache.core.AppDataBase appDataBase, @org.jetbrains.annotations.NotNull()
        com.example.daggerhilt.data.cloud.data_source.RickAndMortyApiService service) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        @androidx.paging.ExperimentalPagingApi()
        public java.lang.Object fetchRickAndMorty(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.daggerhilt.data.cache.models.RickAndMortyCacheModel>>> continuation) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Object fetchCharacterById(int id, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.example.daggerhilt.data.cloud.models.Result> continuation) {
            return null;
        }
    }
}