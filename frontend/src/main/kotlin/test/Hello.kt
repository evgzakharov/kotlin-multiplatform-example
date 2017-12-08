package test

actual class Hello actual constructor(private val name: String) {
    actual fun printMessage() {
        console.log("Hi $name")
    }
}