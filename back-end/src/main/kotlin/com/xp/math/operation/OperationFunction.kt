package com.xp.math.operation

enum class OperationFunction(val function: (Valuable, Valuable) -> Valuable) {

    SUM(::SumOperation),

    SUBTRACTION(::SubtractionOperation),

    DIVISION(::DivisionOperation),

    MULTIPLIER(::MultiplierOperation),

    POW(::PowOperation);
}
