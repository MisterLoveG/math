package com.xp.math.operation

import com.xp.math.extensions.roundWith2Decimal

class PowOperation constructor(valuable1:Valuable, valuable2:Valuable) : Operation(valuable1,valuable2) {

    override val value = (Math.pow(this.valuable1.value, this.valuable2.value)).roundWith2Decimal()

    override val operator = "^"
}