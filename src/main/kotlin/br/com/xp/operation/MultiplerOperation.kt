package br.com.xp.operation

class MultiplerOperation private constructor(vararg valuables: Valuable): Operation(*valuables){

    override val operator: String
        get() = "x"
    override val value: Double
        get() = valuables.stream().mapToDouble { it.value }.reduce { all, value ->  all*value }.asDouble

    companion object {

        fun multiplerValue(vararg valuables: Valuable): Valuable {
            return if(!valuables.isEmpty()) MultiplerOperation(*valuables) else NumberValuable.ZERO
        }

    }
}