package br.com.xp.operation

import br.com.xp.operation.NumberValuable.Companion.valueFrom

class SubtractionOperation private constructor( vararg valuables: Valuable) : Operation(*valuables) {
    override val operator: String
        get() = "-"

    override val value: Double
        get() = valuables.stream().mapToDouble { -it.value }.sum() + valuables[0].value * 2.0

    companion object {
        fun subtractionValueFrom(vararg valuables: Valuable): Valuable {
            return if(!valuables.isEmpty())SubtractionOperation(*valuables) else valueFrom(0.0)
        }
    }
}
