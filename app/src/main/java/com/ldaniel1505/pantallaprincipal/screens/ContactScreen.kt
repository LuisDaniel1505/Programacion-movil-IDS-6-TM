package com.ldaniel1505.pantallaprincipal.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ldaniel1505.pantallaprincipal.ui.theme.PantallaPrincipalTheme

@Suppress("DEPRECATION")
@Composable
fun ContactScreen(navController: NavController, modifier: Modifier = Modifier) {
    var name by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }

    val contacts = remember {
        mutableStateListOf(
            Pair("Ana Garcia", "+52 612 345 6789"),
            Pair("Carlos Rodríguez", "+52 699 888 7777")
        )
    }

    val primaryColor = Color(0xFF3F3D8B)

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(24.dp)
    ) {
        Text(
            text = "Mis Contactos",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp, bottom = 24.dp),
            textAlign = TextAlign.Center
        )

        Text(text = "Nombre", color = Color.Gray, fontSize = 14.sp, modifier = Modifier.padding(start = 10.dp))
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
            shape = RoundedCornerShape(20),
            singleLine = true
        )

        Text(text = "Teléfono", color = Color.Gray, fontSize = 14.sp, modifier = Modifier.padding(start = 10.dp, top = 8.dp))
        OutlinedTextField(
            value = phone,
            onValueChange = { phone = it },
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
            shape = RoundedCornerShape(20),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                if (name.isNotBlank() && phone.isNotBlank()) {
                    val existingIndex = contacts.indexOfFirst { it.first == name }

                    if (existingIndex != -1) {
                        contacts[existingIndex] = Pair(name, phone)
                    } else {
                        contacts.add(0, Pair(name, phone))
                    }
                    name = ""
                    phone = ""
                }
            },
            modifier = Modifier.fillMaxWidth().height(55.dp),
            colors = ButtonDefaults.buttonColors(containerColor = primaryColor),
            shape = RoundedCornerShape(20)
        ) {
            Text("Agregar / Guardar", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedButton(
            onClick = {
                name = ""
                phone = ""
            },
            modifier = Modifier.fillMaxWidth().height(55.dp),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.DarkGray),
            border = BorderStroke(1.dp, Color.LightGray),
            shape = RoundedCornerShape(20)
        ) {
            Text("Limpiar Campos", fontWeight = FontWeight.Bold, fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "LISTA DE CONTACTOS",
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Divider(color = Color.LightGray, thickness = 1.dp)

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(top = 8.dp)
        ) {
            items(contacts) { contact ->
                Contact(
                    name = contact.first,
                    phone = contact.second,
                    onClick = {
                        name = contact.first
                        phone = contact.second
                    }
                )
                Divider(color = Color.LightGray, thickness = 0.5.dp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContactScreenPreview() {
    PantallaPrincipalTheme {
        ContactScreen(navController = rememberNavController())
    }
}