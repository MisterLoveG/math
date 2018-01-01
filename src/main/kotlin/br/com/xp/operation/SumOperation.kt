package br.com.xp.operation

class SumOperation  private constructor(vararg values: Value) : Operation(*values) {
    override val operator: String
        get() = OPERATOR

    override val value: Double
        get() = values.stream().mapToDouble { it.value }.sum()

    companion object {
        val OPERATOR ="+"

        fun sumValueFrom(vararg values: Value): Value {
            return if(!values.isEmpty()) SumOperation(*values) else NumberValue.ZERO
        }
    }
}
