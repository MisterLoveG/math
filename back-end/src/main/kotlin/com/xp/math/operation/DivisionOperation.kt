package com.xp.math.operation

import com.xp.math.extensions.roundWith2Decimal

class DivisionOperation private constructor(vararg valuables: Valuable) : Operation(*valuables) {

    override val operator = "\\"

    override val value: Double
        get() {
            var result = valuables.get(0).value
            for (i in 1 until valuables.size) {
                result /= valuables[i].value
            }
            return result.roundWith2Decimal()
        }

    companion object {

        fun divisionValue(vararg valuables: Valuable): Valuable {
            return if (!valuables.isEmpty()) DivisionOperation(*valuables) else NumberValuable.ZERO
        }
    }
}