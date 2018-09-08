package com.xp.math.operation

import com.xp.math.operation.RandomValueFactory.createRandomValue
import java.util.*
import java.util.function.BiFunction

class OperationFactory constructor(val min: Int,
                                   val max: Int,
                                   val equations: Int,
                                   val operationTypes:List<BiFunction<Valuable, Valuable, Valuable>>) {


    fun generateOperations(): ArrayList<Valuable> {
        val operations = ArrayList<Valuable>()
        for (i in 0 until equations) {
            val operation = createOperation()
            operations.add(operation)
        }
        return operations
    }

    private fun createOperation(): Valuable {
        val value1 = createRandomValue(min, max)
        val value2 = createRandomValue(min, max)
        val operationSelector = RandomNumberFactory.generateNumber(0, operationTypes.size)
        return operationTypes.get(operationSelector).apply(value1, value2)
    }
}