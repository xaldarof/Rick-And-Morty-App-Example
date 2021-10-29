package com.example.daggerhilt.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.daggerhilt.databinding.FragmentCharactersBinding
import com.example.daggerhilt.ui.adapter.HeaderFooterAdapter
import com.example.daggerhilt.ui.adapter.PagingDataAdapter
import com.example.daggerhilt.ui.models.RickAndMortyModelUi
import com.example.daggerhilt.vm.CharactersViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


@AndroidEntryPoint
class CharactersFragment : Fragment(),PagingDataAdapter.CallBack {

    private lateinit var binding: FragmentCharactersBinding
    private val viewModel: CharactersViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharactersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val adapter = PagingDataAdapter(this)

        binding.rv.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        binding.rv.adapter = adapter.withLoadStateHeaderAndFooter(
            header = HeaderFooterAdapter { adapter.retry() },
            footer = HeaderFooterAdapter { adapter.retry() })


        CoroutineScope(Dispatchers.Main).launch {
            viewModel.fetchCharacters().collectLatest {
                adapter.submitData(it)
            }
        }
    }

    override fun onClick(rickAndMorty: RickAndMortyModelUi) {
        findNavController().navigate(CharactersFragmentDirections.actionCharactersFragmentToInformationFragment())
    }
}