package com.example.my.project.paginationmovies.domain.entities

data class MovieEntity(
    val id: Int,
    val title: String,
    val description: String,
    val image: String,
    val category: String,
    val backgroundUrl: String
)
