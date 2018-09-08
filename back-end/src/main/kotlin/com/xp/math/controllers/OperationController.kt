package com.xp.math.controllers

import com.xp.math.operation.OperationFunction
import com.xp.math.operation.Valuable
import com.xp.math.operation.createOperation
import org.springframework.cache.annotation.Cacheable
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.validation.constraints.Max
import javax.validation.constraints.Min


@RestController
class OperationController {

    @GetMapping(value = ["/operation"], produces = [APPLICATION_JSON_VALUE])
    @Cacheable("equation")
    fun getOperationsByType(
            @RequestParam("min") min: Int ,
            @RequestParam("max") max: Int,
            @RequestParam("equations") @Min(1) @Max(100) counts: Int,
            @RequestParam("types") equationsType: List<OperationFunction>
    ): Collection<Valuable> = createOperation(min, max, counts, equationsType)


    @GetMapping(value = ["/operation/allTypes"], produces = [APPLICATION_JSON_VALUE])
    @Cacheable("equation")
    fun getAllOperations(
            @RequestParam("min") min: Int ,
            @RequestParam("max") max: Int,
            @RequestParam("equations") @Min(1) @Max(100) counts: Int
    ): Collection<Valuable> = createOperation(min, max, counts)

}