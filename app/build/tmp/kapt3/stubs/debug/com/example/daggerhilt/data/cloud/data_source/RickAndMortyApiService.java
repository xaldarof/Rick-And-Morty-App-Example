package com.example.daggerhilt.data.cloud.data_source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/daggerhilt/data/cloud/data_source/RickAndMortyApiService;", "", "fetchCharacterById", "Lcom/example/daggerhilt/data/cloud/models/Result;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCharacters", "Lcom/example/daggerhilt/data/cloud/models/RickAndMortyCloudModel;", "page", "app_debug"})
public abstract interface RickAndMortyApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "character")
    public abstract java.lang.Object fetchCharacters(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.daggerhilt.data.cloud.models.RickAndMortyCloudModel> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "character")
    public abstract java.lang.Object fetchCharacterById(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.daggerhilt.data.cloud.models.Result> continuation);
}