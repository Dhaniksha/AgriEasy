package com.example.agrieasy

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.agrieasy.screens.AgriNewsScreen
import com.example.agrieasy.screens.GovtSchemesScreen
import com.example.agrieasy.screens.HomeScreen
import com.example.agrieasy.screens.MarketPricesScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.MarketPrices.route) {
            MarketPricesScreen()
        }
        composable(route = BottomBarScreen.AgriNews.route) {
            AgriNewsScreen()
        }
        composable(route= BottomBarScreen.GovtSchemes.route){
            GovtSchemesScreen()
        }
    }
}