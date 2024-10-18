package com.example.my.project.paginationmovies.di

import com.example.my.project.paginationmovies.data.Api
import com.example.my.project.paginationmovies.data.repository.MoviesRepositoryImp
import com.example.my.project.paginationmovies.domain.repository.MoviesRepository
import com.example.my.project.paginationmovies.domain.usecase.GetAllMovies
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MoviesModule {




    @Provides
    fun providesGetAllMovies(moviesRepository: MoviesRepository): GetAllMovies {
        return GetAllMovies(moviesRepository)
    }

    @Provides
    fun providesMoviesRepository(api: Api): MoviesRepository {
        return MoviesRepositoryImp(api)
    }


}