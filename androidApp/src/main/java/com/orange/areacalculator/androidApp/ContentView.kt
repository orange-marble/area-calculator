package com.orange.areacalculator.androidApp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun ContentView(
    viewModel: AreaViewModel
) {
    val width by viewModel.widthFlow.collectAsState(viewModel.initialWidth)
    val height by viewModel.heightFlow.collectAsState(viewModel.initialHeight)
    val area: Float? by viewModel.areaFlow.collectAsState(null)

    Column {
        LengthView("Width", width, viewModel.setWidth)
        LengthView("Height", height, viewModel.setHeight)
        if (area != null) {
            Text(text = "Area: $area", modifier = Modifier.padding(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ContentView(viewModel = viewModel())
}
