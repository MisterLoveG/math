package com.xp.math.operation

import com.xp.math.extensions.roundWith2Decimal

class NumberValuable private constructor(override val value: Double) : Valuable {

    override val description = value.roundWith2Decimal().toString()

    companion object {
        fun valueFrom(value: Double): NumberValuable {
            return NumberValuable(value)
        }
        fun valueFrom(value: Int): NumberValuable {
            return NumberValuable(value.toDouble())
        }
        val ZERO: NumberValuable = valueFrom(0.0)
    }

    override fun toString(): String {
        return description
    }
}
