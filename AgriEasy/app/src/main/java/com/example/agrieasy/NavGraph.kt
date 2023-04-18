package com.example.agrieasy

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable



@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController,
            startDestination = Screen.Logo.route){
        composable(
            route = Screen.Logo.route
        ){
            HomeScreen(navController= navController)
        }
        composable(
            route = Screen.LoginPage.route
        ){
            LoginPage(navController = navController)
        }
        composable(
            route=Screen.Home.route
        ){
            MainScreen()
        }
    }

}