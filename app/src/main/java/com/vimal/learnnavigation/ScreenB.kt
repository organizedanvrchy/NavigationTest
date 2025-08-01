package com.vimal.learnnavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ScreenB(navController: NavHostController, name: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Screen B",
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier.height(50.dp)
        )
        Text(
            text = name,
            fontSize = 50.sp,
        )

        Spacer(
            modifier = Modifier.height(50.dp)
        )

        Button(
            onClick = {
                navController.navigate(Routes.screenA)
            }) {
            Text(text = "Return to Screen A")
        }
    }

}