package com.xp.math.operation

import com.xp.math.extensions.roundWith2Decimal

class MultiplierOperation private constructor(vararg valuables: Valuable): Operation(*valuables){

    override val operator = "x"

    override val value: Double
        get() = valuables.stream().mapToDouble { it.value }.reduce { all, value ->  all*value }.asDouble.roundWith2Decimal()

    companion object {

        fun multiplierValue(vararg valuables: Valuable): Valuable {
            return if(!valuables.isEmpty()) MultiplierOperation(*valuables) else NumberValuable.ZERO
        }

    }
}