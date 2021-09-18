package com.vahid.composeviewmodel.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.vahid.composeviewmodel.viewmodels.ChildViewModel

@Composable
fun ChildScreen(viewModel: ChildViewModel = hiltViewModel()) {
    Box(modifier = Modifier.fillMaxSize(),contentAlignment = Alignment.Center){
        Text(text = viewModel.random.toString())
    }

}