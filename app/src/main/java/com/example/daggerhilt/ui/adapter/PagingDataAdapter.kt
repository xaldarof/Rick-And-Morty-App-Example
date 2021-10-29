package com.example.daggerhilt.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.daggerhilt.R
import com.example.daggerhilt.data.cloud.CharacterGender
import com.example.daggerhilt.data.cloud.CharacterStatus
import com.example.daggerhilt.databinding.ItemLayoutBinding
import com.example.daggerhilt.ui.models.RickAndMortyModelUi
import com.example.daggerhilt.utils.animateRvView

class PagingDataAdapter(private val onClick:CallBack): PagingDataAdapter<RickAndMortyModelUi, RecyclerView.ViewHolder>(DiffUtilCallback()) {

    inner class ItemViewHolder(private val itemLayoutBinding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(itemLayoutBinding.root) {

        fun onBind(rickAndMorty:RickAndMortyModelUi) {

            itemLayoutBinding.nameTv.text = rickAndMorty.name
            itemLayoutBinding.locationTv.text = rickAndMorty.location

            Glide.with(itemLayoutBinding.root.context)
                .load(rickAndMorty.image)
                .placeholder(R.drawable.ic_baseline_arrow_downward_24)
                .error(R.drawable.ic_baseline_running_with_errors_24)
                .into(itemLayoutBinding.characterImg)

            itemLayoutBinding.itemLayout.setOnClickListener {
                onClick.onClick(rickAndMorty)
            }

            //define life-status

            if (rickAndMorty.status == CharacterStatus.ALIVE) {
                itemLayoutBinding.statusImg.setImageResource(R.drawable.ic_baseline_favorite_24)

            }
            if (rickAndMorty.status == CharacterStatus.UNKNOWN) {
                itemLayoutBinding.statusImg.setImageResource(R.drawable.ic_questionmark_83826)
            }

            if (rickAndMorty.status == CharacterStatus.DEAD) {
                itemLayoutBinding.statusImg.setImageResource(R.drawable.die)
            }

            //define genders

            if (rickAndMorty.gender == CharacterGender.FEMALE){
                itemLayoutBinding.genderImg.setImageResource(R.drawable.ic_baseline_female_24)
            }else {
                itemLayoutBinding.genderImg.setImageResource(R.drawable.ic_baseline_male_24)
            }
        }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        getItem(position)?.let { (holder as ItemViewHolder).onBind(it) }
        holder.itemView.animateRvView(700,position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent,
            false))
    }
    interface CallBack{
        fun onClick(rickAndMorty: RickAndMortyModelUi)
    }
}