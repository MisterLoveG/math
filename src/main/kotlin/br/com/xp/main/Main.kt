package br.com.xp.main

import br.com.xp.operation.DivisionOperation.Companion.divisionValue
import br.com.xp.operation.MultiplierOperation.Companion.multiplerValue
import br.com.xp.operation.NumberValuable.Companion.valueFrom
import br.com.xp.operation.RandomValueFactory
import br.com.xp.operation.SumOperation.Companion.sumValueFrom
import br.com.xp.operation.SubtractionOperation.Companion.subtractionValueFrom as subtraction


object Main {

    @JvmStatic
    fun  main(args: Array<String>) {
        val value = RandomValueFactory.createRandomValue(0.0,100.0)
        val value2 = RandomValueFactory.createRandomValue(0.0,100.0)
        val value21 = RandomValueFactory.createRandomValue(0.0,100.0)
        val value22 = RandomValueFactory.createRandomValue(0.0,100.0)

        val sumOperation1 = sumValueFrom(value, value2)
        val sumOperation2 = sumValueFrom(value21, value22)
        val sumOperation = sumValueFrom(sumOperation1, sumOperation2)
        val operation = subtraction(sumOperation, value)
        val divisionValue = divisionValue(operation, value)
        val multiplierValue = multiplerValue(divisionValue, value)
        println(multiplierValue.description + "=" + multiplierValue.value)
    }

}
