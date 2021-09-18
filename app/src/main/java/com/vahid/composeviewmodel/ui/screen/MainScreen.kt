package com.vahid.composeviewmodel.ui.screen

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.vahid.composeviewmodel.viewmodels.MainViewModel

@ExperimentalPagerApi
@Composable
fun MainScreen(viewModel: MainViewModel = hiltViewModel()) {
    val pages = viewModel.pages.collectAsState()
    val pagerState = rememberPagerState(pageCount = pages.value.size)

    HorizontalPager(
        state = pagerState,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) { page ->
        CompositionLocalProvider(LocalViewModelStoreOwner provides viewModel.getViewModelStoreOwner(page)) {
            ChildScreen()
        }
    }
}