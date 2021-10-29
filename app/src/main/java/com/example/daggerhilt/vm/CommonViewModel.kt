package com.example.daggerhilt.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import androidx.paging.map
import com.example.daggerhilt.data.cache.data_source.RickAndMortyRepository
import com.example.daggerhilt.ui.models.RickAndMortyModelUi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class CommonViewModel

@Inject constructor(private val rickAndMortyRepository: RickAndMortyRepository) : ViewModel() {

    var selectedCharacter:Int? = null

    suspend fun fetchCharacters() = rickAndMortyRepository
        .fetchRickAndMorty()
        .map { it -> it.map { it.mapToUiModel() } }
        .cachedIn(viewModelScope)

    suspend fun fetchCharacterById(id:Int) = rickAndMortyRepository.fetchCharacterById(id)

}