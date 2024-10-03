package com.example.my.project.paginationmovies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.my.project.paginationmovies.Utils.NavigationItems
import com.example.my.project.paginationmovies.screens.HomeScreen
import com.example.my.project.paginationmovies.screens.SplashScreen
import com.example.my.project.paginationmovies.ui.theme.PaginationMoviesTheme


private const val ApiKey = "316b3c13a33e9284cf32bd6272bceb8e"
private const val ApiReadAccessToken =
    "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIzMTZiM2MxM2EzM2U5Mjg0Y2YzMmJkNjI3MmJjZWI4ZSIsIm5iZiI6MTcyNzkzOTM1OS4xNzMyNjEsInN1YiI6IjY2ZmU0MWVkZTg0ZWViMzVhMGY3YzFmMCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.6ELNbot0kvujMYNXGCF9TqI2ve3VjU1heV9t-CRbG0w"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaginationMoviesTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    val navigation = rememberNavController()
                    Greeting(navigation)
                }
            }
        }
    }
}

@Composable
fun Greeting(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationItems.Splash.route) {
        composable(NavigationItems.Splash.route) {
            SplashScreen(navController)
        }

        composable(NavigationItems.Home.route) {
            HomeScreen(navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PaginationMoviesTheme {
        val navigation = rememberNavController()
        Greeting(navigation)
    }
}
