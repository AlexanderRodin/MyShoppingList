package com.example.myshoppinglist.di

import androidx.lifecycle.ViewModel
import kotlin.reflect.KClass
import dagger.MapKey

@MapKey
@Retention(AnnotationRetention.RUNTIME)
annotation class ViewModelKay(val value: KClass<out ViewModel>)
