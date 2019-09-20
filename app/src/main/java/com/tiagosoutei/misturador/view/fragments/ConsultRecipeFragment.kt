package com.tiagosoutei.misturador.view.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.tiagosoutei.misturador.R
import com.tiagosoutei.misturador.databinding.ConsultRecipeFragmentBinding
import com.tiagosoutei.misturador.viewmodel.ConsultRecipeViewModel

class ConsultRecipeFragment : Fragment() {

    private lateinit var viewModel: ConsultRecipeViewModel
    private lateinit var binding: ConsultRecipeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.consult_recipe_fragment, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ConsultRecipeViewModel::class.java)
    }

}
