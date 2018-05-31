package com.xp.math.extensions

import java.math.BigDecimal
import java.math.RoundingMode

fun Double.roundWith2Decimal(): Double{
    return BigDecimal(this).setScale(2, RoundingMode.HALF_UP).toDouble()
}