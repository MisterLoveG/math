
import kotlinx.coroutines.experimental.await
import kotlinx.coroutines.experimental.launch
import operation.OperationDto
import operation.equation
import org.w3c.xhr.JSON
import org.w3c.xhr.XMLHttpRequest
import org.w3c.xhr.XMLHttpRequestResponseType
import react.dom.render
import kotlin.browser.document
import kotlin.js.Promise

fun main(args: Array<String>) {
    launch {
        val equation = getOperation().await()
        render(document.getElementById("content")) {
            equation(equation.description, equation.value)
        }
    }
}

private fun getOperation(): Promise<OperationDto> {
    return Promise<OperationDto> { resolve, reject ->
        val xmlHttpRequest = XMLHttpRequest()
        xmlHttpRequest.open("GET", "http://localhost:9000/api/operation")
        xmlHttpRequest.responseType = XMLHttpRequestResponseType.JSON
        xmlHttpRequest.onload = {
            resolve(xmlHttpRequest.response as OperationDto)
        }
        xmlHttpRequest.send()
    }.then { operation: OperationDto -> operation }
}