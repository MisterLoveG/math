package com.xp.math.operation

import com.xp.math.operation.NumberValuable.Companion.valueFrom
import com.xp.math.operation.SumOperation.Companion.sumValueFrom
import org.junit.Assert.assertEquals
import org.junit.Test

class SumOperationTest {

    @Test
    fun shouldSum() {
        val sumedValue = sumValueFrom(valueFrom(10), valueFrom(1))
        assertEquals(sumedValue.value, 11.0, 0.0)
    }
}
