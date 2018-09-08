package com.xp.math.operation

import java.util.function.BiFunction

enum class OperationFunction(val function:BiFunction<Valuable, Valuable, Valuable>) {

    SUM(BiFunction { value1, value2 -> SumOperation.sumValueFrom(value1, value2) }),

    SUBTRACTION(BiFunction { value1, value2 -> SubtractionOperation.subtractionValueFrom(value1, value2) }),

    DIVISION(BiFunction { value1, value2 -> DivisionOperation.divisionValue(value1, value2) }),

    MULTIPLIER(BiFunction { value1, value2 -> MultiplierOperation.multiplierValue(value1, value2) }),

    POW(BiFunction { value1, value2 -> PowOperation.powValue(value1, value2) });
}