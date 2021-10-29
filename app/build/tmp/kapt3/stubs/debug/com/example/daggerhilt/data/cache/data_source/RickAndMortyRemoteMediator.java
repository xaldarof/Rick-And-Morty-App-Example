package com.example.daggerhilt.data.cache.data_source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\fH\u0002J\u001e\u0010\r\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\fH\u0002J\u001e\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\fH\u0002J-\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/daggerhilt/data/cache/data_source/RickAndMortyRemoteMediator;", "Landroidx/paging/RemoteMediator;", "", "Lcom/example/daggerhilt/data/cache/models/RickAndMortyCacheModel;", "appDataBase", "Lcom/example/daggerhilt/data/cache/core/AppDataBase;", "rickAndMortyApiService", "Lcom/example/daggerhilt/data/cloud/data_source/RickAndMortyApiService;", "(Lcom/example/daggerhilt/data/cache/core/AppDataBase;Lcom/example/daggerhilt/data/cloud/data_source/RickAndMortyApiService;)V", "getItemForClosestPosition", "Lcom/example/daggerhilt/data/cache/models/RemoteKeyDb;", "state", "Landroidx/paging/PagingState;", "getItemForFirstPosition", "getItemForLastPosition", "load", "Landroidx/paging/RemoteMediator$MediatorResult;", "loadType", "Landroidx/paging/LoadType;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.paging.ExperimentalPagingApi()
public final class RickAndMortyRemoteMediator extends androidx.paging.RemoteMediator<java.lang.Integer, com.example.daggerhilt.data.cache.models.RickAndMortyCacheModel> {
    private final com.example.daggerhilt.data.cache.core.AppDataBase appDataBase = null;
    private final com.example.daggerhilt.data.cloud.data_source.RickAndMortyApiService rickAndMortyApiService = null;
    
    @javax.inject.Inject()
    public RickAndMortyRemoteMediator(@org.jetbrains.annotations.NotNull()
    com.example.daggerhilt.data.cache.core.AppDataBase appDataBase, @org.jetbrains.annotations.NotNull()
    com.example.daggerhilt.data.cloud.data_source.RickAndMortyApiService rickAndMortyApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.LoadType loadType, @org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, com.example.daggerhilt.data.cache.models.RickAndMortyCacheModel> state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.MediatorResult> continuation) {
        return null;
    }
    
    private final com.example.daggerhilt.data.cache.models.RemoteKeyDb getItemForClosestPosition(androidx.paging.PagingState<java.lang.Integer, com.example.daggerhilt.data.cache.models.RickAndMortyCacheModel> state) {
        return null;
    }
    
    private final com.example.daggerhilt.data.cache.models.RemoteKeyDb getItemForFirstPosition(androidx.paging.PagingState<java.lang.Integer, com.example.daggerhilt.data.cache.models.RickAndMortyCacheModel> state) {
        return null;
    }
    
    private final com.example.daggerhilt.data.cache.models.RemoteKeyDb getItemForLastPosition(androidx.paging.PagingState<java.lang.Integer, com.example.daggerhilt.data.cache.models.RickAndMortyCacheModel> state) {
        return null;
    }
}