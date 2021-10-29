package com.example.daggerhilt.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.example.daggerhilt.R
import com.example.daggerhilt.databinding.FragmentInformationBinding
import com.example.daggerhilt.vm.CommonViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class InformationFragment : Fragment() {

    private lateinit var binding:FragmentInformationBinding
    private val viewModel:CommonViewModel by viewModels({requireParentFragment()})

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInformationBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view,savedInstanceState)

        viewModel.selectedCharacter?.let {
            lifecycleScope.launch {
                val characterInfo = viewModel.fetchCharacterById(it)
                Log.d("res123","ID = $it")
                binding.createdTimeTv.text = characterInfo.created
                binding.locationTv.text = characterInfo.location.name
                binding.genderTv.text = characterInfo.gender

                Glide.with(requireContext())
                    .load(characterInfo.image)
                    .placeholder(R.drawable.ic_baseline_arrow_downward_24)
                    .error(R.drawable.ic_baseline_running_with_errors_24)
                    .into(binding.characterImg)
            }
        }
    }
}