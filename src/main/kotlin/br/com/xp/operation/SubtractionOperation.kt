package br.com.xp.operation

import br.com.xp.operation.NumberValue.Companion.valueFrom

class SubtractionOperation private constructor( vararg values: Value) : Operation(*values) {
    override val operator: String
        get() = "-"

    override val value: Double
        get() = values.stream().mapToDouble { -it.value }.sum() + values[0].value * 2.0

    companion object {

        fun subtractionValueFrom(vararg values: Value): Value {
            return if(!values.isEmpty())SubtractionOperation(*values) else valueFrom(0.0)
        }
    }
}
