package com.xp.math.operation

import com.xp.math.extensions.roundWith2Decimal

/**
 * first number is the index of the root after that they are radix
 */
class RootOperation private constructor(vararg valuables: Valuable) : Operation(*valuables) {
    override val operator = "√"

    override val value: Double
        get() {
            val index = 1 / valuables[0].value
            val baseList = valuables.subList(1, valuables.size)
            return baseList.stream().mapToDouble { it.value }.reduce { all, base -> all + Math.pow(base, index)  }.asDouble.roundWith2Decimal()
        }


    companion object {
        fun powValue(vararg valuables: Valuable): Valuable {
            return if(!valuables.isEmpty()) RootOperation(*valuables) else NumberValuable.ZERO
        }
    }
}