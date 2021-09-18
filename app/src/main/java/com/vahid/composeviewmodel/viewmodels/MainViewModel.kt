package com.vahid.composeviewmodel.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    val pages = MutableStateFlow(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))

    private val viewModelStores = mutableMapOf<Int, ViewModelStore>()
    fun getViewModelStoreOwner(page: Int) = ViewModelStoreOwner {
        var viewModelStore = viewModelStores[page]
        if (viewModelStore == null) {
            viewModelStore = ViewModelStore()
            viewModelStores[page] = viewModelStore
        }
        viewModelStore
    }
}