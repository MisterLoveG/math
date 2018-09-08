package com.xp.math.operation

import java.util.function.BiFunction

class OperationFactory constructor(private val min: Int,
                                   private val max: Int,
                                   private val equations: Int,
                                   private val operationTypes:List<BiFunction<Valuable, Valuable, Valuable>>) {


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
        val operationFunction = selectOperationFunction()
        return operationFunction.apply(value1, value2)
    }

    private fun selectOperationFunction(): BiFunction<Valuable, Valuable, Valuable> {
        val operationSelector = generateNumber(0, operationTypes.size)
        return operationTypes[operationSelector]
    }
}