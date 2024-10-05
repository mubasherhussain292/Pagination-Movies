package com.example.my.project.paginationmovies.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.my.project.paginationmovies.R
import com.example.my.project.paginationmovies.Utils.BottomNavigationItems
import com.example.my.project.paginationmovies.ui.AllMovies.AllMovies

@Composable
fun HomeScreen(navController: NavHostController) {
    val bottomNavigation = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigationBar(bottomNavigation)
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.white))
                .padding(innerPadding)
        ) {
            BottomNavGraph(bottomNavigation)
        }

    }

}


@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(BottomNavigationItems.AllMovies, BottomNavigationItems.FavMovies)

    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()

        val currentDestination = navBackStackEntry?.destination

        items.forEach { item ->

            NavigationBarItem(
                icon = {
                    Icon(item.icon, contentDescription = item.route)
                },
                label = {
                    Text(text = item.title)
                },
                selected = currentDestination?.route == item.route,
                onClick = {

                    navController.navigate(item.route) {
                        launchSingleTop = true
                        restoreState = true
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                    }
                }


            )


        }

    }

}


@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomNavigationItems.AllMovies.route) {
        composable(BottomNavigationItems.AllMovies.route) {
            AllMovies(navController)
        }

        composable(BottomNavigationItems.FavMovies.route) {
            FavMovies(navController)
        }
    }
}