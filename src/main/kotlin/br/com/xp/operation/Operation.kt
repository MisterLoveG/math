package br.com.xp.operation


abstract class Operation(vararg values: Value) : Value {
    internal var values: List<Value>

    internal abstract val operator: String

    init {
        assert(values.size > 2) { "incorrect input" }
        this.values= values.toList()
    }

    override val description: String by lazy {
        val firstValue = values[0]
        var description = "(" + firstValue.description
        for (i in 1 until values.size) {
            description+=operator + values[i].value
        }
        description+=")"
        description
    }
}
