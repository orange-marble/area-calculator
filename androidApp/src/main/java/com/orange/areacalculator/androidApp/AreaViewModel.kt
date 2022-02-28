package com.orange.areacalculator.androidApp

import androidx.lifecycle.ViewModel
import com.orange.areacalculator.shared.AreaCalculationFloat
import kotlinx.coroutines.flow.*


class AreaViewModel: ViewModel(), AreaCalculationFloat {
    val initialWidth = 2.0f
    val initialHeight = 3.0f

    override val widthFlow = MutableStateFlow(initialWidth)
    override val heightFlow = MutableStateFlow(initialHeight)

    val setWidth: (Float) -> Unit = { value -> widthFlow.value = value }
    val setHeight: (Float) -> Unit = { value -> heightFlow.value = value }
}