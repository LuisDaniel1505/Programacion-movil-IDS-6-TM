package com.ldaniel1505.pantallaprincipal.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ldaniel1505.pantallaprincipal.R
import com.ldaniel1505.pantallaprincipal.ui.theme.PantallaPrincipalTheme
import androidx.navigation.NavController
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen(navController: NavController, modifier: Modifier = Modifier.
    background(color = Color(0xFF3F3D8B)).
    padding(10.dp)) {
    Column(
        modifier = modifier.fillMaxSize().
        background(
            Color.White,
            shape = RoundedCornerShape(10)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(id = R.drawable.imagen_principal),
            contentDescription = "Ilustración principal",
            modifier = Modifier.padding(top = 40.dp).size(300.dp)
        )
        Text(
            text = "Hello",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 50.dp)
        )

        Text(
            text = "Welcome To Little Drop, where\nyou manage your daily tasks",
            fontSize = 16.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 5.dp, start = 28.dp, end = 28.dp)
        )

        Button(
            onClick = { navController.navigate("login") },
            modifier = Modifier
                .padding(top = 40.dp, start = 60.dp, end = 60.dp)
                .fillMaxWidth()
                .height(55.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3F3D8B))
        ) {
            Text(text = "Login", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 16.sp)
        }

        OutlinedButton(
            onClick = { navController.navigate("signup") },
            modifier = Modifier
                .padding(top = 20.dp, start = 60.dp, end = 60.dp)
                .fillMaxWidth()
                .height(55.dp),
            border = androidx.compose.foundation.BorderStroke(2.dp, Color(0xFF3F3D8B))
        ) {
            Text(text = "Sign Up", color = Color(0xFF3F3D8B), fontWeight = FontWeight.Bold, fontSize = 16.sp)
        }

        Text(
            text = "Sign up using",
            color = Color.Gray,
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 30.dp, bottom = 16.dp)
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.facebook_logo),
                contentDescription = "Facebook Login",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )

            Image(
                painter = painterResource(id = R.drawable.google_logo),
                contentDescription = "Google Login",
                modifier = Modifier
                    .size(45.dp)
                    .clip(CircleShape)
            )

            Image(
                painter = painterResource(id = R.drawable.li_logo),
                contentDescription = "LinkedIn Login",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    PantallaPrincipalTheme {
        MainScreen(navController = rememberNavController())
    }
}
