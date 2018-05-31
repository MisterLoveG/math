package com.xp.math.operation

import com.xp.math.extensions.roundWith2Decimal

class SumOperation  private constructor(vararg valuables: Valuable) : Operation(*valuables) {
    override val operator = "+"

    override val value: Double
        get() = valuables.stream().mapToDouble { it.value }.sum().roundWith2Decimal()

    companion object {
        fun sumValueFrom(vararg valuables: Valuable): Valuable {
            return if(!valuables.isEmpty()) SumOperation(*valuables) else NumberValuable.ZERO
        }
    }
}
