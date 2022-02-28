package com.orange.areacalculator.shared

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.filterNotNull


class AreaCalculationNative: AreaCalculation {
    val widthNullable = MutableStateFlow<Double?>(null)
    val heightNullable = MutableStateFlow<Double?>(null)

    fun setWidth(value: Double) { widthNullable.value = value }
    fun setHeight(value: Double) { heightNullable.value = value }

    override val width: Flow<Double> = widthNullable.filterNotNull()
    override val height: Flow<Double> = heightNullable.filterNotNull()

    override val area: Flow<Double> = super.area
}
