import react.dom.h2
import react.dom.render
import kotlin.browser.document

fun main(args: Array<String>) {
    render(document.getElementById("content")) {
        h2 { +"Hola mundo" }
    }
}

