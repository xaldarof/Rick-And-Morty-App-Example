package com.example.daggerhilt.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.daggerhilt.databinding.LoadingItemLayoutBinding

class HeaderFooterAdapter(private val retry:() ->Unit): LoadStateAdapter<RecyclerView.ViewHolder>() {

    inner class LoadViewHolder(private val loadingItemBinding: LoadingItemLayoutBinding)
        :RecyclerView.ViewHolder(loadingItemBinding.root){

        init {
            loadingItemBinding.retryBtn.setOnClickListener {
                retry.invoke()
            }
        }

        fun onBind(loadState: LoadState){
            loadingItemBinding.progress.isVisible = loadState is LoadState.Loading
            loadingItemBinding.retryBtn.isVisible = loadState is LoadState.Error
            loadingItemBinding.tv.isVisible = loadState is LoadState.Error
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, loadState: LoadState) {
        (holder as LoadViewHolder).onBind(loadState)
    }

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): RecyclerView.ViewHolder {
        return LoadViewHolder(LoadingItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
}