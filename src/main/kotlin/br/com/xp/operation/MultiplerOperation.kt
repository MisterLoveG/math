package br.com.xp.operation

class MultiplerOperation private constructor(vararg values:Value): Operation(*values){

    override val operator: String
        get() = "x"
    override val value: Double
        get() = values.stream().mapToDouble { it.value }.reduce { all, value ->  all*value }.asDouble

    companion object {

        fun multiplerValue(vararg values: Value): Value{
            return if(!values.isEmpty()) MultiplerOperation(*values) else NumberValue.ZERO
        }

    }
}