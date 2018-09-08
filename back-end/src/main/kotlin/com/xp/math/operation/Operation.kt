package com.xp.math.operation


abstract class Operation(protected var valuable1: Valuable, protected var valuable2: Valuable) : Valuable {
    protected  abstract val operator: String

    override val description= StringBuilder()
                .append("(")
                .append(valuable1.description)
                .append(operator)
                .append(valuable2.description)
                .append(")")
                .toString()
}
