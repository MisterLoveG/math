package com.xp.math

import org.springframework.beans.factory.getBean
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MathApplication
fun main(args: Array<String>) {
    val context = runApplication<MathApplication>(*args)
    println(context.getBean<OperationController>(OperationController::class))

}