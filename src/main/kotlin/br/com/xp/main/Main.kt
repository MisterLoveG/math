package br.com.xp.main

import br.com.xp.operation.DivisionOperation.Companion.divisionValue
import br.com.xp.operation.MultiplerOperation.Companion.multiplerValue
import br.com.xp.operation.NumberValuable.Companion.valueFrom
import br.com.xp.operation.SumOperation.Companion.sumValueFrom
import br.com.xp.operation.SubtractionOperation.Companion.subtractionValueFrom as subtraction


object Main {

    @JvmStatic
    fun  main(args: Array<String>) {
        val value = valueFrom(10.0)
        val value2 = valueFrom(50.0)
        val value21 = valueFrom(43.0)
        val value22 = valueFrom(82.0)

        val sumOperation1 = sumValueFrom(value, value2)
        val sumOperation2 = sumValueFrom(value21, value22)
        val sumOperation = sumValueFrom(sumOperation1, sumOperation2)
        val operation = subtraction(sumOperation, value)
        val divisionValue = divisionValue(operation, value)
        val multiplerValue = multiplerValue(divisionValue, value)
        println(multiplerValue.description + "=" + multiplerValue.value)
    }
}
