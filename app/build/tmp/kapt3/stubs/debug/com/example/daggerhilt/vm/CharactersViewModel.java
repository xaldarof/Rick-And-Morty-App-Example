package com.example.daggerhilt.vm;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/daggerhilt/vm/CharactersViewModel;", "Landroidx/lifecycle/ViewModel;", "rickAndMortyRepository", "Lcom/example/daggerhilt/data/cache/data_source/RickAndMortyRepository;", "(Lcom/example/daggerhilt/data/cache/data_source/RickAndMortyRepository;)V", "fetchCharacterById", "Lcom/example/daggerhilt/data/cloud/models/Result;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCharacters", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/daggerhilt/ui/models/RickAndMortyModelUi;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CharactersViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.daggerhilt.data.cache.data_source.RickAndMortyRepository rickAndMortyRepository = null;
    
    @javax.inject.Inject()
    public CharactersViewModel(@org.jetbrains.annotations.NotNull()
    com.example.daggerhilt.data.cache.data_source.RickAndMortyRepository rickAndMortyRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchCharacters(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.daggerhilt.ui.models.RickAndMortyModelUi>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchCharacterById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.daggerhilt.data.cloud.models.Result> continuation) {
        return null;
    }
}