package com.xp.math.operation

import com.xp.math.extensions.roundWith2Decimal

/**
 * first number is the index of the root after that they are radix
 */
class RootOperation private constructor(valuable1:Valuable, valuable2:Valuable) : Operation(valuable1,valuable2) {
    override val operator = "√"

    //TODO implementar o root
    override val value=(0.0).roundWith2Decimal()
}