
import react.dom.h2
import react.dom.render
import kotlin.browser.document
import kotlin.browser.window


fun main(args: Array<String>) {
    render(document.getElementById("content")) {
        h2 { +"Hola mundo" }
    }
    jQuery("h2").hover { window.alert("Tocou em mim hehehe") }
}

