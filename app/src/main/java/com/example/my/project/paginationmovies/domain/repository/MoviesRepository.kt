package com.example.my.project.paginationmovies.domain.repository

import com.example.my.project.paginationmovies.data.entities.Movies

interface MoviesRepository {
    suspend fun getAllMovies(apikey: String = "316b3c13a33e9284cf32bd6272bceb8e"): Movies?
}