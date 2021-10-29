package com.example.daggerhilt.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.paging.LoadState
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.daggerhilt.R
import com.example.daggerhilt.data.cloud.models.Result
import com.example.daggerhilt.databinding.FragmentCharactersBinding
import com.example.daggerhilt.ui.adapter.HeaderFooterAdapter
import com.example.daggerhilt.ui.adapter.PagingDataAdapter
import com.example.daggerhilt.ui.models.RickAndMortyModelUi
import com.example.daggerhilt.vm.CommonViewModel
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


@AndroidEntryPoint
class CharactersFragment : Fragment(),PagingDataAdapter.CallBack {

    private lateinit var binding: FragmentCharactersBinding
    private val viewModel: CommonViewModel by viewModels({requireParentFragment()})
    private var stateBundle :Bundle?=null

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

        adapter.addLoadStateListener {
            binding.progressView.isVisible = it.refresh is LoadState.Loading

            if (it.refresh is LoadState.Error) {
                Snackbar.make(binding.root, R.string.connection_error,Snackbar.LENGTH_LONG).show()
            }
        }

        lifecycleScope.launch {
            viewModel.fetchCharacters().collectLatest {
                adapter.submitData(it)
            }
        }
    }

    override fun onClick(rickAndMorty: RickAndMortyModelUi) {
        viewModel.selectedCharacter = rickAndMorty.id
        findNavController()
            .navigate(CharactersFragmentDirections
            .actionCharactersFragmentToInformationFragment())
    }

    override fun onPause() {
        super.onPause()
        stateBundle = Bundle()
        val state = binding.rv.layoutManager?.onSaveInstanceState()
        stateBundle!!.putParcelable(BUNDLE_NAME,state)
    }

    override fun onResume() {
        super.onResume()
        val state: Parcelable? = stateBundle?.getParcelable(BUNDLE_NAME)
        binding.rv.layoutManager?.onRestoreInstanceState(state)
    }

    companion object {
        const val BUNDLE_NAME = "STATE"
    }
}