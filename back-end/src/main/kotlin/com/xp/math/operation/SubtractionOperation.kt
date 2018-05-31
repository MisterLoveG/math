package com.xp.math.operation

import com.xp.math.extensions.roundWith2Decimal
import com.xp.math.operation.NumberValuable.Companion.valueFrom

class SubtractionOperation private constructor( vararg valuables: Valuable) : Operation(*valuables) {
    override val operator: String
        get() = "-"

    override val value: Double
        get() = (valuables.stream().mapToDouble { -it.value }.sum() + valuables[0].value * 2.0).roundWith2Decimal()

    companion object {

        fun subtractionValueFrom(vararg valuables: Valuable): Valuable {
            return if(!valuables.isEmpty())
                SubtractionOperation(*valuables)
            else
                valueFrom(0.0)
        }
    }
}
