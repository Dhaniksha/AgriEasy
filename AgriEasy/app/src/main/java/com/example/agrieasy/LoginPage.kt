package com.example.agrieasy

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.agrieasy.ui.theme.AgriEasyTheme

@Composable
fun LoginPage(navController: NavController){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.login),
            contentDescription = null,
            modifier= Modifier.fillMaxSize(),
            Alignment.Center)
        
        Column (modifier=Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

        ){
            Button(onClick = {navController.navigate(Screen.Home.route) }) {
                Text(text = "Register")



            }

            Button(onClick = { navController.navigate(Screen.Home.route) }) {
                Text(text = "Login")

            }
        }





        /*Text("Login Page",
            modifier = Modifier.clickable(onClick = {
            navController.navigate(route = Screen.Home.route)

        }))*/

    }



}

@Preview(showBackground = true)
@Composable
fun DefaultPreview1() {
    AgriEasyTheme {
        LoginPage(navController = rememberNavController())
    }
}