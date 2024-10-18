package com.example.my.project.paginationmovies.domain.usecase

import com.example.my.project.paginationmovies.data.entities.Movies
import com.example.my.project.paginationmovies.domain.repository.MoviesRepository

class GetAllMovies (
    private val repository: MoviesRepository
) {
    suspend operator fun invoke(): Movies? {
        return repository.getAllMovies()
    }
}