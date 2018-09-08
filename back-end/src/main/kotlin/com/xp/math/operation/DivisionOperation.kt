package com.xp.math.operation

import com.xp.math.extensions.roundWith2Decimal


class DivisionOperation (valuable1:Valuable, valuable2:Valuable) : Operation(valuable1,valuable2) {

    override val operator = "/"

    override val value: Double
        get() =(valuable1.value/valuable2.value).roundWith2Decimal()
}