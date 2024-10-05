package com.example.my.project.paginationmovies.ui.AllMovies

import androidx.lifecycle.ViewModel
import com.example.my.project.paginationmovies.domain.usecase.GetAllMovies
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MoviesViewModel @Inject constructor(
    private val movies: GetAllMovies
) : ViewModel() {


    private suspend fun getAllMovies() = movies.invoke()

}