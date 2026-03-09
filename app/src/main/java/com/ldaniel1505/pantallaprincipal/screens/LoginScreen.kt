package com.ldaniel1505.pantallaprincipal.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ldaniel1505.pantallaprincipal.R
import com.ldaniel1505.pantallaprincipal.ui.theme.PantallaPrincipalTheme
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun LoginScreen(navController: NavController, modifier: Modifier = Modifier) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(24.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .clickable { navController.popBackStack() },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = " Regresar",
                color = Color.Gray,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Image(
            painter = painterResource(id = R.drawable.logo_registro),
            contentDescription = "signUp_logo",
            modifier = Modifier
                .fillMaxWidth()
                .size(260.dp)
                .padding(top = 16.dp)
        )
        Text(
            text = "Login",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 32.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Email",
            color = Color.Gray,
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 10.dp, start = 20.dp)
        )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            shape = RoundedCornerShape(20),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.LightGray,
                focusedBorderColor = Color(0xFF3F3D8B)
            ),
            singleLine = true
        )
        Text(
            text = "Password",
            color = Color.Gray,
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 10.dp, start = 20.dp)
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            shape = RoundedCornerShape(20),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.LightGray,
                focusedBorderColor = Color(0xFF3F3D8B)
            ),
            visualTransformation = PasswordVisualTransformation(),
            singleLine = true
        )
        Text(
            text = "Forgot password?",
            color = Color.Gray,
            fontSize = 10.sp,
            modifier = Modifier.padding(bottom = 5.dp, top = 10.dp, start = 20.dp)
        )
        Button(
            onClick = { },
            modifier = Modifier
                .padding(top = 20.dp, start = 180.dp, end = 20.dp)
                .height(50.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3F3D8B))
        ) {
            Text(text = "Login", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 12.sp)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    PantallaPrincipalTheme {
        LoginScreen(navController = rememberNavController())
    }
}