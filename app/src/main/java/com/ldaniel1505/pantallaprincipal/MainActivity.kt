package com.ldaniel1505.pantallaprincipal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.ldaniel1505.pantallaprincipal.navigation.AppNavigation
import com.ldaniel1505.pantallaprincipal.ui.theme.PantallaPrincipalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PantallaPrincipalTheme {
                AppNavigation()
            }
        }
    }
}