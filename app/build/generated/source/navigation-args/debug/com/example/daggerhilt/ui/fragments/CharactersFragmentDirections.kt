package com.example.daggerhilt.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.daggerhilt.R

public class CharactersFragmentDirections private constructor() {
  public companion object {
    public fun actionCharactersFragmentToInformationFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_charactersFragment_to_informationFragment)
  }
}
