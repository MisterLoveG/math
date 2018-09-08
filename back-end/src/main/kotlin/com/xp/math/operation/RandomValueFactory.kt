package com.xp.math.operation

fun createRandomValue(min: Double, max: Double): Valuable {
    val randomNumber = generateNumber(min, max)
    return NumberValuable.valueFrom(randomNumber)
}

fun createRandomValue(min: Int, max: Int): Valuable {
    val randomNumber = generateNumber(min, max)
    return NumberValuable.valueFrom(randomNumber)
}