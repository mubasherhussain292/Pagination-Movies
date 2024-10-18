package com.example.my.project.paginationmovies.data.repository

import android.util.Log
import com.example.my.project.paginationmovies.data.Api
import com.example.my.project.paginationmovies.data.entities.Movies
import com.example.my.project.paginationmovies.domain.repository.MoviesRepository
import javax.inject.Inject

class MoviesRepositoryImp @Inject constructor(private val api: Api) : MoviesRepository {


    override suspend fun getAllMovies(apikey: String): Movies? {
        return try {
            val response = api.getAllMovies(apikey)
            if (response.isSuccessful) {
                response.body()?.also { movie ->
                    Log.d(TAG, "getMovie: $movie")
                }
            } else {
                Log.e(TAG, "Error: ${response.code()} ${response.message()}")
                null
            }
        } catch (e: Exception) {
            Log.e(TAG, "Exception in getMovie: ${e.message}", e)
            null
        }
    }


}

private const val TAG = "MoviesRepositoryImp"