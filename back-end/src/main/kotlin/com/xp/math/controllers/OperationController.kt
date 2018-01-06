package com.xp.math.controllers
import com.xp.math.operation.OperationFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class OperationController{

    @GetMapping(value= "/operation", produces = ["!text/plain"])
    fun getDescription():String=OperationFactory
            .Build(0,10,1)
            .addSubtraction()
            .addSum()
            .build()
            .generateOperations()
            .get(0)
            .description
}