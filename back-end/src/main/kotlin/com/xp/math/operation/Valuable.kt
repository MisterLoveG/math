package com.xp.math.operation

import com.fasterxml.jackson.databind.annotation.JsonSerialize

@JsonSerialize(`as` = Valuable::class)
interface Valuable {
    val description: String
    val value: Double
}
