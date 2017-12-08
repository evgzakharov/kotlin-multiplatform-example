package test

import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {
    Hello("Bankovich").printMessage()

    val dynamicTest: dynamic = {}
    dynamicTest.someFun = { value: String ->
        console.log("log from dynamic type; input: $value")
    }

    console.log("timer task")
    window.setTimeout({
        val elementById = document.getElementById("message")
        elementById?.textContent = "some other name"

        dynamicTest.someFun("Kotlin!")

        console.log("done")
    }, 1000)

}