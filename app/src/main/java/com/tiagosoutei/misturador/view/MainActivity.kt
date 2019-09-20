package com.tiagosoutei.misturador.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import com.tiagosoutei.misturador.R
import com.tiagosoutei.misturador.databinding.MainFragmentBinding
import com.tiagosoutei.misturador.viewmodel.OnBoardViewModel

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    private lateinit var binding : MainFragmentBinding
    private lateinit var onBoardViewModel: OnBoardViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        onBoardViewModel = ViewModelProviders.of(this).get(OnBoardViewModel::class.java)
    }
}
