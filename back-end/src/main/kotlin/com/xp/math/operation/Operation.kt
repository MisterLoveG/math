package com.xp.math.operation


abstract class Operation(vararg valuables: Valuable) : Valuable {
    internal var valuables: List<Valuable>

    internal abstract val operator: String

    init {
        assert(valuables.size >= 2) { "incorrect input" }
        this.valuables = valuables.toList()
    }

    override val description: String by lazy {
        val firstValue = valuables[0]
        var description = "(" + firstValue.description
        for (i in 1 until valuables.size) {
            description+=operator + valuables[i].value
        }
        description+=")"
        description
    }
}
