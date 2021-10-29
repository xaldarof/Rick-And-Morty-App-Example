package com.example.daggerhilt.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\u001a\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lcom/example/daggerhilt/ui/fragments/CharactersFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/daggerhilt/ui/adapter/PagingDataAdapter$CallBack;", "()V", "binding", "Lcom/example/daggerhilt/databinding/FragmentCharactersBinding;", "stateBundle", "Landroid/os/Bundle;", "viewModel", "Lcom/example/daggerhilt/vm/CommonViewModel;", "getViewModel", "()Lcom/example/daggerhilt/vm/CommonViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onClick", "", "rickAndMorty", "Lcom/example/daggerhilt/ui/models/RickAndMortyModelUi;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "onPause", "onResume", "onViewCreated", "view", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CharactersFragment extends androidx.fragment.app.Fragment implements com.example.daggerhilt.ui.adapter.PagingDataAdapter.CallBack {
    private com.example.daggerhilt.databinding.FragmentCharactersBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private android.os.Bundle stateBundle;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.daggerhilt.ui.fragments.CharactersFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BUNDLE_NAME = "STATE";
    
    public CharactersFragment() {
        super();
    }
    
    private final com.example.daggerhilt.vm.CommonViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    com.example.daggerhilt.ui.models.RickAndMortyModelUi rickAndMorty) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/daggerhilt/ui/fragments/CharactersFragment$Companion;", "", "()V", "BUNDLE_NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}