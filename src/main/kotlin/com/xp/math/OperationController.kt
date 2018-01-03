package com.xp.math
import br.com.xp.operation.NumberValuable
import br.com.xp.operation.SumOperation
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
class OperationController{

    @RequestMapping(value= "/operation", method = [RequestMethod.GET], produces = ["!text/plain"])
    fun getDescription():String=SumOperation.sumValueFrom(NumberValuable.ZERO,NumberValuable.ZERO).description
}