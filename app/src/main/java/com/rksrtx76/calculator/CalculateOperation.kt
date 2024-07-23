package com.rksrtx76.calculator

sealed class CalculateOperation(val symbol : String) {
    object Add : CalculateOperation("+")
    object Subtract : CalculateOperation("-")
    object Multiply : CalculateOperation("x")
    object Divide : CalculateOperation("/")
    object Modulo : CalculateOperation("%")
}