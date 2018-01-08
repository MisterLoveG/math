
import operation.equation
import react.dom.render
import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {
    render(document.getElementById("content")) {
        equation()
    }
    jQuery("h2").hover { window.alert("Tocou em mim hehehe") }
}