package com.example.fitlifespa.ui.navigation



import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fitlifespa.ui.screens.MainTabsScreen
import com.example.fitlifespa.ui.screens.login.LoginScreen
import com.example.fitlifespa.ui.screens.profile.ProfileScreen
import com.example.fitlifespa.ui.screens.register.RegisterScreen

@Composable
@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(navController = navController)
        }
        composable("login") {
            LoginScreen(navController = navController)
        }
        composable("register") {
            RegisterScreen(navController = navController)
        }
        composable("profile") {
            ProfileScreen(navController = navController)
        }
    }
}