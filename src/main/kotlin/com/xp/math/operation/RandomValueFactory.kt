package br.com.xp.operation

import java.util.*

object RandomValueFactory {
    private val random = Random()

    fun createRandomRealValue(min: Double, max: Double): Valuable {
        val randomNumber = (random.nextDouble() * (max - min)) + min
        return NumberValuable.valueFrom(randomNumber)
    }

    fun createRandomIntegerValue(min: Int, max: Int): Valuable {
        val randomNumber = (Math.abs(random.nextInt(max-min) )) + min
        return NumberValuable.valueFrom(randomNumber)
    }
}