package br.com.xp.operation

class NumberValuable private constructor(override val value: Double) : Valuable {

    override val description: String
        get() = value.toString()

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
