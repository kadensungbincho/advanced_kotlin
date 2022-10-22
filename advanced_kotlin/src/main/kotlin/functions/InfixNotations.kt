package functions

infix fun String.shouldBeEqualTo(value: String) = this == value
// applied only to extension function or member function with 1 arg

fun main(args: Array<String>) {
    "Hello".shouldBeEqualTo("Hello")

    val output = "Hello"
    output shouldBeEqualTo "Hello"
}
