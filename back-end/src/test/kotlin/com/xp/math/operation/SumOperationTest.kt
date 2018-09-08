package com.xp.math.operation

import com.xp.math.operation.NumberValuable.Companion.valueFrom
import org.junit.Assert.assertEquals
import org.junit.Test

class SumOperationTest {

    @Test
    fun shouldSum() {
        val summedValue = SumOperation(valueFrom(10), valueFrom(1))
        assertEquals(summedValue.value, 11.0, 0.0)
    }
}
