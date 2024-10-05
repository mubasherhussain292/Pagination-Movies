package com.example.my.project.paginationmovies.domain.usecase

import com.example.my.project.paginationmovies.domain.repository.MoviesRepository

class GetAllMovies(
    val repository: MoviesRepository
) {
    suspend operator fun invoke() {

    }
}