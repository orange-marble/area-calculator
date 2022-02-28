package com.orange.areacalculator.shared

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map


interface AreaCalculationFloat: AreaCalculation {
    val floatToDouble: (Float) -> Double get() = { value -> value.toDouble() }
    val doubleToFloat: (Double) -> Float get() = { value -> value.toFloat() }

    val widthFlow: MutableStateFlow<Float>
    val heightFlow: MutableStateFlow<Float>

    override val width: Flow<Double>
        get() = widthFlow.map(floatToDouble)

    override val height: Flow<Double>
        get() = heightFlow.map(floatToDouble)

    val areaFlow: Flow<Float>
        get() = area.map(doubleToFloat)
}