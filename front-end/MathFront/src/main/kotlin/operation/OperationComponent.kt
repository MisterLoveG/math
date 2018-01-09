package operation

import kotlinx.html.InputType
import kotlinx.html.id
import kotlinx.html.js.onClickFunction
import org.w3c.dom.HTMLInputElement
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.button
import react.dom.div
import react.dom.input
import kotlin.browser.document
import kotlin.browser.window


interface OperationProp : RProps {
    var equation: String
    var value: String
}

class OperationComponent(val prop: OperationProp) : RComponent<OperationProp, RState>() {
    override fun RBuilder.render() {
        div {
            div("alert alert-primary") {
                +prop.equation
            }
            div {
                input {
                    attrs.id = "response"
                    attrs.type = InputType.text
                }
            }
            div {
                button {
                    +"Verificar resposta"
                    attrs.onClickFunction ={
                        val elementById = document.getElementById("response")!! as HTMLInputElement
                        if( elementById.value == prop.value){
                            window.alert("Acerto miservi")
                        }
                    }
                }
            }
        }
    }
}

fun RBuilder.equation(equation: String = "0+0", value: Double = 0.0) = child(OperationComponent::class) {
    attrs.equation = equation
    attrs.value = value.toString()
}
