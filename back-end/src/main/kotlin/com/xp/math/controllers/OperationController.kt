package com.xp.math.controllers
import br.com.xp.operation.Valuable
import com.xp.math.operation.OperationFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class OperationController{

    @GetMapping(value= "/operation", produces = ["application/json"])
    fun getDescription(): Valuable =OperationFactory
            .Build(0,10,1)
            .addSubtraction()
            .addSum()
            .build()
            .generateOperations()
            .get(0)
}