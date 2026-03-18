package com.ldaniel1505.pantallaprincipal.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Contact(name: String, phone: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Avatar simple: Un círculo con la primera letra del nombre
        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
                .background(Color(0xFFE8EAFF)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = if (name.isNotEmpty()) name.take(1).uppercase() else "?",
                color = Color(0xFF3F3D8B),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }

        Spacer(modifier = Modifier.width(16.dp))

        // Textos directos, sin íconos
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = phone,
                fontSize = 14.sp,
                color = Color.Gray
            )
        }

        // Texto simple en lugar de flecha
        Text(
            text = "Editar",
            fontSize = 12.sp,
            color = Color(0xFF3F3D8B),
            fontWeight = FontWeight.Bold
        )
    }
}