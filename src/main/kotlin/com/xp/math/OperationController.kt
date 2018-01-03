package com.xp.math
import br.com.xp.operation.NumberValuable
import br.com.xp.operation.SumOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class OperationController{

    @GetMapping(value= "/operation", produces = ["!text/plain"])
    fun getDescription():String=SumOperation.sumValueFrom(NumberValuable.ZERO,NumberValuable.ZERO).description
}