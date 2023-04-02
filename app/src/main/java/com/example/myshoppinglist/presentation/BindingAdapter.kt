package com.example.myshoppinglist.presentation

import androidx.databinding.BindingAdapter
import com.example.myshoppinglist.R
import com.google.android.material.textfield.TextInputLayout

@BindingAdapter("errorInputName")
fun bindingErrorInputName(textInputLayout: TextInputLayout, isError: Boolean){
    val message = if (isError) {
        textInputLayout.context.getString(R.string.error_input_count)
    } else {
        null
    }
    textInputLayout.error = message
}

@BindingAdapter("errorInputCount")
fun bindingErrorInputCount(textInputLayout: TextInputLayout, isError: Boolean){
    val message = if (isError) {
        textInputLayout.context.getString(R.string.error_input_count)
    } else {
        null
    }
    textInputLayout.error = message
}