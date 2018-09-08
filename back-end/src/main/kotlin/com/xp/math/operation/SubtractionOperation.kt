package com.xp.math.operation


class SubtractionOperation (valuable1:Valuable, valuable2:Valuable) : Operation(valuable1,valuable2) {
    override val operator = "-"
    override val value=(valuable1.value-valuable2.value)
}
