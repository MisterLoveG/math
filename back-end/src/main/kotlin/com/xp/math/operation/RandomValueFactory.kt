package br.com.xp.operation

import com.xp.math.operation.RandomNumberFactory.generateNumber

object RandomValueFactory {

    fun createRandomValue(min: Double, max: Double): Valuable {
        val randomNumber = generateNumber(min,max)
        return NumberValuable.valueFrom(randomNumber)
    }

    fun createRandomValue(min: Int, max: Int): Valuable {
        val randomNumber = generateNumber(min,max)
        return NumberValuable.valueFrom(randomNumber)
    }
}