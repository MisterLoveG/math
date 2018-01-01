package br.com.xp.operation

 class DivisionOperation private constructor(vararg values:Value) : Operation(*values){

    override val operator: String
        get() = "\\"

    override val value: Double
        get() {
            var result = values.get(0).value
            for( i in 1 until values.size){
                result/=values[i].value
            }
            return result
        }

    companion object {

        fun divisionValue(vararg values:Value):Value{
           return if(!values.isEmpty()) DivisionOperation(*values) else NumberValue.ZERO
       }
    }
}