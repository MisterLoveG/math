package com.xp.math.controllers

import com.xp.math.operation.OperationFactory
import com.xp.math.operation.Valuable
import org.springframework.cache.annotation.Cacheable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*
import javax.validation.constraints.Max
import javax.validation.constraints.Min


@RestController
class OperationController {

    @GetMapping(value = ["/operation"], produces = ["application/json"])
    @Cacheable("equation")
    fun getAllOperations(
            @RequestParam("min") min: Int,
            @RequestParam("max") max: Int,
            @RequestParam("equations") @Min(1) @Max(100) counts: Int
    ): ArrayList<Valuable> = OperationFactory
            .Builder(min, max, counts)
            .addSubtraction()
            .addSum()
            .addDivision()
            .addMultipler()
            .addPow()
            .build()
            .generateOperations()
}