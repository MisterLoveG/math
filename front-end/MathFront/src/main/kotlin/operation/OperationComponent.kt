package operation

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div


interface OperationProp:RProps{
    var equation:String
}

class OperationComponent(val prop:OperationProp):RComponent<OperationProp, RState>(){
    override fun RBuilder.render() {
        div {
            +"Hello, ${prop.equation}"
        }
    }
}

fun RBuilder.equation(equation: String = "0=0") = child(OperationComponent::class) {
    attrs.equation = equation
}
