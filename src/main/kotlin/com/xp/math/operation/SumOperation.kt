package br.com.xp.operation

class SumOperation  private constructor(vararg valuables: Valuable) : Operation(*valuables) {
    override val operator: String
        get() = OPERATOR

    override val value: Double
        get() = valuables.stream().mapToDouble { it.value }.sum()

    companion object {
        val OPERATOR ="+"

        fun sumValueFrom(vararg valuables: Valuable): Valuable {
            return if(!valuables.isEmpty()) SumOperation(*valuables) else NumberValuable.ZERO
        }
    }
}
