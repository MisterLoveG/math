package index

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div

interface HelloWordProperties:RProps{
    var name:String
}


class HelloWordComponent(val prop: HelloWordProperties):RComponent<HelloWordProperties,RState>(){
    override fun RBuilder.render() {
        div {
            +"Hello, ${prop.name}"
        }
    }
}


fun RBuilder.welcome(name: String = "Zé") = child(HelloWordComponent::class) {
    attrs.name = name
}