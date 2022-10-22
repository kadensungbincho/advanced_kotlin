package functions

inline fun nonOp(x: Int) { // no useful inlining here

}

inline fun operation2(noinline op: () -> Unit) {
    println("Before calling op")
    op()
    println("After calling op")
}

inline fun tryingToInline(op: () -> Unit) {
    // val reference = op // restriction on inline, cannot save the inlined function
    println("test")
    op()
}

inline fun operation(op: () -> Unit) {
    println("Before calling op")
    op()
    // throw Exception()
    println("After calling op")
}

fun anotherFunction() {
    operation { println("This is the actual op function") }
}

fun main() {
    operation { println("This is the actual op function") }
}
