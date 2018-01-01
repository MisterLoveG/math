package br.com.xp.operation

import java.util.*

object RandomValueFactory{
    private val random = Random()

    fun createRandomValue(min:Double,max:Double):Valuable{
        val randomNumber = (random.nextDouble()*(max-min))+min
        return NumberValuable.valueFrom(randomNumber)
    }
}