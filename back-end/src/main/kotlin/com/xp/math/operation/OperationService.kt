package com.xp.math.operation

import java.util.stream.Collectors


private val DEFAULT_OPERATIONS_TYPES = OperationFunction.values().toList()
fun createOperation(min: Int,
                    max: Int,
                    counts: Int,
                    equationTypes: List<OperationFunction> = DEFAULT_OPERATIONS_TYPES): ArrayList<Valuable> {

    val equationTypesFunctions = equationTypes
            .stream()
            .map(OperationFunction::function)
            .collect(Collectors.toList())

    val operationFactory = OperationFactory(min, max, counts, equationTypesFunctions)
    return operationFactory.generateOperations()
}
