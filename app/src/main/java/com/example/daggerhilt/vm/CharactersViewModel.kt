package com.example.daggerhilt.vm

import androidx.lifecycle.ViewModel
import androidx.paging.map
import com.example.daggerhilt.data.cache.data_source.RickAndMortyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel

@Inject constructor(private val rickAndMortyRepository: RickAndMortyRepository) : ViewModel() {


    suspend fun fetchCharacters() = rickAndMortyRepository
        .fetchRickAndMorty()
        .map { it -> it.map { it.mapToUiModel() } }

    suspend fun fetchCharacterById(id:Int) = rickAndMortyRepository.fetchCharacterById(id)

}