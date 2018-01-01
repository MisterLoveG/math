package br.com.xp.operation

class NumberValue private constructor(override val value: Double) : Value {

    override val description: String
        get() = value.toString()

    companion object {
        fun valueFrom(value: Double): NumberValue {
            return NumberValue(value)
        }

        val ZERO:NumberValue = valueFrom(0.0)
    }
}
