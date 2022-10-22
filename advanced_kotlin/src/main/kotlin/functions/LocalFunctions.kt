package functions

fun foo(fooParam: String) {

    val outerFunction = "value"

    fun bar(barParam: String) {

        println(barParam)
        println(fooParam)
        println(outerFunction)
    }
}

fun main(args: Array<String>) {
    foo("some value")
    // can't access bar
}
