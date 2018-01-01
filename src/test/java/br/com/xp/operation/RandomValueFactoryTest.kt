package br.com.xp.operation

import org.junit.Test

import org.junit.Assert.*

class RandomValueFactoryTest {

    @Test
    fun createRandomValueShouldRespectBound() {
        val testedMinNumbers = Pair(2.3, 39.1)
        for(i in 1..1000){
            val result = RandomValueFactory.createRandomValue(testedMinNumbers.first, testedMinNumbers.second)

            assertTrue(result.value.compareTo(testedMinNumbers.first) != -1)
            assertTrue(result.value.compareTo(testedMinNumbers.second )!= 1)
        }
    }

}