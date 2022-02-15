package com.example.demo_di.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.demo_di.di.annotiation.ActivityScope
import javax.inject.Inject
import javax.inject.Provider


@ActivityScope
class ViewModelFactory @Inject constructor(
    private val viewModels: MutableMap<Class<out ViewModel>,
            @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        viewModels[modelClass]?.get() as T
}