package com.example.my.project.paginationmovies.Utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

enum class Screens {
    SplashScreen,
    HomeScreen
}


sealed class NavigationItems(val route: String) {
    data object Splash : NavigationItems(Screens.SplashScreen.name)
    data object Home : NavigationItems(Screens.HomeScreen.name)
}

enum class BottomScreens {
    AllMovies,
    FavMovies
}


sealed class BottomNavigationItems(val route: String, val icon: ImageVector,val title : String) {
    object AllMovies : BottomNavigationItems(BottomScreens.AllMovies.name, Icons.Default.Home, "AllMovies")
    object FavMovies : BottomNavigationItems(BottomScreens.FavMovies.name, Icons.Default.Person,"FavMovies")
}