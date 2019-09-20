package com.tiagosoutei.misturador.view.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.tiagosoutei.misturador.R
import com.tiagosoutei.misturador.databinding.RecipeInsertionFragmentBinding
import com.tiagosoutei.misturador.viewmodel.RecipeInsertionViewModel

class RecipeInsertion : Fragment() {

    private lateinit var viewModel: RecipeInsertionViewModel
    private lateinit var binding: RecipeInsertionFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.recipe_insertion_fragment, container, false)
        return binding.root
        /*return inflater.inflate(R.layout.recipe_insertion_fragment, container, false)*/
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RecipeInsertionViewModel::class.java)
    }

}
