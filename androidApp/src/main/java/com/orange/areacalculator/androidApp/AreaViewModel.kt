package com.orange.areacalculator.androidApp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.*


class AreaViewModel: ViewModel() {
    val areaCalculation = { width: Float, height: Float -> width*height }

    val initialWidth = 2.0f
    val initialHeight = 3.0f

    val widthFlow = MutableStateFlow(initialWidth)
    val heightFlow = MutableStateFlow(initialHeight)

    val setWidth: (Float) -> Unit = { value -> widthFlow.value = value }
    val setHeight: (Float) -> Unit = { value -> heightFlow.value = value }

    val areaFlow = combine(widthFlow, heightFlow, transform = areaCalculation)
}