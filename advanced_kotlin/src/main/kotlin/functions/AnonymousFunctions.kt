package functions

fun op(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main(args: Array<String>) {
    op(3, { it * it }) // return type is inferred

    op(2, fun(x): Int { return x * x }) // anon fun. can have multiple return points
}
