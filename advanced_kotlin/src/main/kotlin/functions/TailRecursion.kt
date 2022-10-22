package functions

// tail call optimization

fun factorial(number: Int): Int {
    return when (number) {
        0, 1 -> 1
        else -> number * factorial(number - 1)
    }
}

// replacing with a loop
tailrec fun factorialTR(number: Int, accumulator: Int = 1): Int {
    return when (number) {
        0 -> accumulator
        else -> factorialTR(number - 1, accumulator * number)
    }
}

fun main() {
    println(factorial(5))
    println(factorialTR(5))
}
