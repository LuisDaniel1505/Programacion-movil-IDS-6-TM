package com.ldaniel1505.pantallaprincipal.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ldaniel1505.pantallaprincipal.screens.LoginScreen
import com.ldaniel1505.pantallaprincipal.screens.MainScreen
import com.ldaniel1505.pantallaprincipal.screens.SignUpScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "main"
    ) {
        composable(route = "main") {
            MainScreen(navController)
        }
        composable(route = "login") {
            LoginScreen(navController)
        }
        composable(route = "signup") {
            SignUpScreen(navController)
        }
    }
}