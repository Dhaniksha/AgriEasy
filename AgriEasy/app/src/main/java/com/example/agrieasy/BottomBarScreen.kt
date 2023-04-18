package com.example.agrieasy


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object MarketPrices : BottomBarScreen(
        route = "profile",
        title = "Market Prices",
        icon = Icons.Default.Search
    )

    object AgriNews : BottomBarScreen(
        route = "settings",
        title = "AgriNews",
        icon = Icons.Default.Info
    )

    object GovtSchemes : BottomBarScreen(
        route = "govtSchemes",
        title= "GovtSchemes",
        icon = Icons.Default.List
    )

}

