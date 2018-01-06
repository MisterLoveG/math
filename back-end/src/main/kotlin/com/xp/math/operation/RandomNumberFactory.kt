package com.xp.math.operation

import java.util.*

object RandomNumberFactory {
    private val random = Random()
    fun generateNumber(min: Int, max: Int): Int {
        return (Math.abs(random.nextInt(max - min))) + min
    }

    fun generateNumber(min: Double, max: Double): Double {
        return (random.nextDouble() * (max - min)) + min
    }
}