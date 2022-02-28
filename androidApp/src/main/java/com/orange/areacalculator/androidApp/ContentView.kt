package com.orange.areacalculator.androidApp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ContentView() {
    var width by remember { mutableStateOf(2.0f) }
    var height by remember { mutableStateOf(3.0f) }

    val setWidth = { value: Float -> width = value }
    val setHeight = { value: Float -> height = value }

    val area = width*height

    Column {
        LengthView("Width", width, setWidth)
        LengthView("Height", height, setHeight)
        Text(text = "Area: $area", modifier = Modifier.padding(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ContentView()
}
