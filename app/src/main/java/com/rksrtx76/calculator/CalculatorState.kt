package com.rksrtx76.calculator

data class CalculatorState(
    val number1 : String = "",
    val number2 : String = "",
    val operation: CalculateOperation? = null
)