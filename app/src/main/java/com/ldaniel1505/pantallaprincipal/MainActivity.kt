package com.ldaniel1505.pantallaprincipal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ldaniel1505.pantallaprincipal.ui.theme.PantallaPrincipalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PantallaPrincipalTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PantallaLogin(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun PantallaLogin(modifier: Modifier = Modifier
    .background(
        color = Color(0xFF3F3D8B))
    .padding(10.dp)) {
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

        Box(
            modifier = Modifier
                .padding(top = 40.dp, start = 60.dp, end = 60.dp)
                .fillMaxWidth()
                .background(
                    color = Color(0xFF3F3D8B),
                    shape = RoundedCornerShape(50)
                )
                .padding(vertical = 16.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Login",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 20.dp, start = 60.dp, end = 60.dp)
                .fillMaxWidth()
                .border(
                    width = 2.dp,
                    color = Color(0xFF3F3D8B),
                    shape = RoundedCornerShape(50)
                )
                .padding(vertical = 16.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Sign Up",
                color = Color(0xFF3F3D8B),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
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

@Composable
fun PantallaRegistro(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(24.dp)
    ) {
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
            text = "Name",
            color = Color.Gray,
            fontSize = 14.sp,
            modifier = Modifier.padding(start = 20.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .border(
                    width = 1.dp,
                    color = Color.LightGray,
                    shape = RoundedCornerShape(20)
                )
        )
        Text(
            text = "Email",
            color = Color.Gray,
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 10.dp, start = 20.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .border(
                    width = 1.dp,
                    color = Color.LightGray,
                    shape = RoundedCornerShape(20)
                )
        )
        Text(
            text = "Password",
            color = Color.Gray,
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 10.dp, start = 20.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .border(
                    width = 1.dp,
                    color = Color.LightGray,
                    shape = RoundedCornerShape(20)
                )
        )
        Text(
            text = "Forgot password?",
            color = Color.Gray,
            fontSize = 10.sp,
            modifier = Modifier.padding(bottom = 5.dp, top = 10.dp, start = 20.dp)
        )
        Box(
            modifier = Modifier
                .padding(top = 20.dp, start = 180.dp)
                .height(50.dp)
                .fillMaxWidth()
                .background(
                    color = Color(0xFF3F3D8B),
                    shape = RoundedCornerShape(50)
                )
                .padding(vertical = 16.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Login",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaLoginPreview() {
    PantallaPrincipalTheme {
        PantallaLogin()
    }
}

@Preview(showBackground = true)
@Composable
fun MiPantallaRegistroPreview() {
    PantallaPrincipalTheme {
        PantallaRegistro()
    }
}