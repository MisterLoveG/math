package com.xp.math.operation

import com.xp.math.extensions.roundWith2Decimal

class PowOperation private constructor(vararg valuables: Valuable) : Operation(*valuables) {
    override val value: Double
        get() = valuables.stream().mapToDouble { it.value }.reduce { all, value ->  Math.pow(all, value) }.asDouble.roundWith2Decimal()

    override val operator = "^"

    companion object {
        fun powValue(vararg valuables: Valuable): Valuable {
            return if(!valuables.isEmpty()) PowOperation(*valuables) else NumberValuable.ZERO
        }
    }

}