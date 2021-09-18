package com.vahid.composeviewmodel.viewmodels

import androidx.lifecycle.ViewModel
import com.vahid.composeviewmodel.data.TestInject
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlin.random.Random

@HiltViewModel
class ChildViewModel @Inject constructor(
    private val testInject: TestInject
) : ViewModel() {
    val random = Random.nextInt(0, 100)
}
