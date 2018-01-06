package index

import jQuery
import kotlinext.js.*
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*
import kotlin.browser.*

fun main(args: Array<String>) {
    requireAll(require.context("src", true, js("/\\.css$/")))
    render(document.getElementById("root")) {
        welcome("Rafael")
    }
    
}
