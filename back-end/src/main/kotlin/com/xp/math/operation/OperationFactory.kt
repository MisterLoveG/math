package com.xp.math.operation

import com.xp.math.operation.RandomValueFactory.createRandomValue
import java.util.*
import java.util.function.BiFunction

class OperationFactory private constructor(val min: Int, val max: Int, val equations: Int) {
    private val operationsCreator = ArrayList<BiFunction<Valuable, Valuable, Valuable>>()

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
        val operationSelector = RandomNumberFactory.generateNumber(0, operationsCreator.size)
        val operation = operationsCreator.get(operationSelector).apply(value1, value2)
        return operation
    }


    class Builder(min: Int, max: Int, equations: Int) {
        private val operationFactory: OperationFactory = OperationFactory(min, max, equations)

        fun addSum(): Builder {
            operationFactory.operationsCreator.add(
                    BiFunction { value1, value2 -> SumOperation.sumValueFrom(value1, value2) })
            return this
        }

        fun addSubtraction(): Builder {
            operationFactory.operationsCreator.add(
                    BiFunction { value1, value2 -> SubtractionOperation.subtractionValueFrom(value1, value2) })
            return this
        }

        fun addMultipler(): Builder {
            operationFactory
                    .operationsCreator
                    .add(BiFunction { value1, value2 -> MultiplierOperation.multiplerValue(value1, value2) })
            return this
        }

        fun addDivision(): Builder {
            operationFactory
                    .operationsCreator
                    .add(BiFunction { value1, value2 -> DivisionOperation.divisionValue(value1, value2) })
            return this
        }

        fun addPow(): Builder {
            operationFactory
                    .operationsCreator
                    .add(BiFunction { value1, value2 -> PowOperation.powValue(value1, value2) })
            return this
        }

        fun build(): OperationFactory {
            return operationFactory
        }
    }
}