package com.example.my.project.paginationmovies.ui.allMovies

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun AllMovies(navController: NavHostController) {
    val moviesViewModel: MoviesViewModel = hiltViewModel()

    LaunchedEffect(key1 = true) {
        Log.d(TAG, "coming: ")
        val size = moviesViewModel.getAllMovies()
        Log.d(TAG, "AllMovies: $size")
    }

    /*LazyVerticalGrid(columns = GridCells.FixedSize(90.dp)) {

    }*/


}


private const val TAG = "AllMovieScreen"