package com.example.daggerhilt.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\rR\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/daggerhilt/ui/adapter/PagingDataAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/daggerhilt/ui/models/RickAndMortyModelUi;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onClick", "Lcom/example/daggerhilt/ui/adapter/PagingDataAdapter$CallBack;", "(Lcom/example/daggerhilt/ui/adapter/PagingDataAdapter$CallBack;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "Lcom/example/daggerhilt/ui/adapter/PagingDataAdapter$ItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "CallBack", "ItemViewHolder", "app_debug"})
public final class PagingDataAdapter extends androidx.paging.PagingDataAdapter<com.example.daggerhilt.ui.models.RickAndMortyModelUi, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.example.daggerhilt.ui.adapter.PagingDataAdapter.CallBack onClick = null;
    
    public PagingDataAdapter(@org.jetbrains.annotations.NotNull()
    com.example.daggerhilt.ui.adapter.PagingDataAdapter.CallBack onClick) {
        super(null, null, null);
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.daggerhilt.ui.adapter.PagingDataAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/daggerhilt/ui/adapter/PagingDataAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemLayoutBinding", "Lcom/example/daggerhilt/databinding/ItemLayoutBinding;", "(Lcom/example/daggerhilt/ui/adapter/PagingDataAdapter;Lcom/example/daggerhilt/databinding/ItemLayoutBinding;)V", "onBind", "", "rickAndMorty", "Lcom/example/daggerhilt/ui/models/RickAndMortyModelUi;", "app_debug"})
    public final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.daggerhilt.databinding.ItemLayoutBinding itemLayoutBinding = null;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.daggerhilt.databinding.ItemLayoutBinding itemLayoutBinding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull()
        com.example.daggerhilt.ui.models.RickAndMortyModelUi rickAndMorty) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/daggerhilt/ui/adapter/PagingDataAdapter$CallBack;", "", "onClick", "", "rickAndMorty", "Lcom/example/daggerhilt/ui/models/RickAndMortyModelUi;", "app_debug"})
    public static abstract interface CallBack {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        com.example.daggerhilt.ui.models.RickAndMortyModelUi rickAndMorty);
    }
}