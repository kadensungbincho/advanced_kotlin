package functions

fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}

fun containingFunction() {
    val numbers = 1..100
    numbers.forEach myLabel@{
        if (it % 5 == 0) {
            return@myLabel
        }
    }
    println("Hello!")
}

fun containingFunction1() {
    val numbers = 1..100
    numbers.myForEach {
        if (it % 5 == 0) {
            // return // return is not allowed here, it's non-local return because it's not an inline function
        }
    }
    println("Hello!")
}

fun containingFunction2() {
    val numbers = 1..100
    numbers.forEach (fun(element) {
        if (element % 5 == 0) {
            return // this is local return
        }
    })
    println("Hello")
}


fun main() {
    containingFunction2()
}
