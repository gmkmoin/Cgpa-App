package com.example.cgpaapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun HomeScreen() {
    Image(painter = painterResource(id = R.drawable.bg), contentDescription = null,
        contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxSize())
}