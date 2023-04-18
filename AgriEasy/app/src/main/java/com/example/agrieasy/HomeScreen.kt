package com.example.agrieasy

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.agrieasy.ui.theme.AgriEasyTheme

@Composable
fun HomeScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(

            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
                .clickable(onClick = {
                navController.navigate(route = Screen.LoginPage.route)

            }


            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AgriEasyTheme {
        HomeScreen(navController = rememberNavController() )
    }
}