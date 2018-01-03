package com.xp.math.operation

import br.com.xp.operation.RandomValueFactory
import org.junit.Assert.assertTrue
import org.junit.Test
class RandomValueFactoryTest {

    @Test
    fun createRandomValueShouldRespectBound() {
        val testedMinNumbers = Pair(2.3, 39.1)
        for(i in 1..1000){
            val result = RandomValueFactory.createRandomRealValue(testedMinNumbers.first, testedMinNumbers.second)

            assertTrue(result.value.compareTo(testedMinNumbers.first) != -1)
            assertTrue(result.value.compareTo(testedMinNumbers.second )!= 1)
        }
    }

}