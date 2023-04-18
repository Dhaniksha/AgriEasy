package com.example.agrieasy

sealed class Screen(val route:String){
    object Logo: Screen(route= "logo_screen")
    object LoginPage: Screen(route= "login_page")
    object Home: Screen(route="home_screen")
}
