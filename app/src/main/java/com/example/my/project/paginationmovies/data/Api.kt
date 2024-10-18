package com.example.my.project.paginationmovies.data

import com.example.my.project.paginationmovies.data.entities.Movies
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("3/movie/550")
    suspend fun getAllMovies(
        @Query("api_key") apiKey: String
    ): Response<Movies>


}