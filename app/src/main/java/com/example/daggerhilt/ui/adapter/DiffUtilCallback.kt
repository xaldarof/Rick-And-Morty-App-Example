package com.example.daggerhilt.ui.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.daggerhilt.ui.models.RickAndMortyModelUi

class DiffUtilCallback  : DiffUtil.ItemCallback<RickAndMortyModelUi>() {
    override fun areItemsTheSame(
        oldItem: RickAndMortyModelUi,
        newItem: RickAndMortyModelUi
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: RickAndMortyModelUi,
        newItem: RickAndMortyModelUi
    ): Boolean {
        return oldItem == newItem
    }
}