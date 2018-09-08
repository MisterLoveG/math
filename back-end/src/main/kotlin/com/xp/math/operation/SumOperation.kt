package com.xp.math.operation

class SumOperation  constructor(value1: Valuable, value2: Valuable) : Operation(value1, value2 ) {
    override val operator = "+"

    override val value: Double
        get() = valuable1.value+ valuable2.value

    fun sumValueFrom(value1: Valuable, value2: Valuable): Valuable {
        return SumOperation(value1, value2)
    }
}