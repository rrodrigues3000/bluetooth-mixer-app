package com.tiagosoutei.misturador.extensions

import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Fragment.showToast(msg: Int, time: Int = Toast.LENGTH_LONG){
        Toast.makeText(context!!, msg, time).show()
    }

    fun Fragment.showToast(msg: String, time: Int = Toast.LENGTH_LONG){
        Toast.makeText(context!!, msg, time).show()
    }

    fun Fragment.closeKeyboard(){
        val imm = activity!!.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view?.windowToken, 0)
    }