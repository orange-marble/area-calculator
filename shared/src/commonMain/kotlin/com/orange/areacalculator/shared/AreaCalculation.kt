package com.orange.areacalculator.shared

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine


interface AreaCalculation {
    val width: Flow<Double>
    val height: Flow<Double>

    val calculation: (Double, Double) -> Double
        get() = { width, height -> width*height }

    val area: Flow<Double>
        get() = combine(width, height, transform = calculation)
}
