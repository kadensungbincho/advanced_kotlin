package coroutines

import kotlinx.coroutines.yield

fun main() {
    val sequence = generateSequence {
        for (i in 1..5) {
            yield()
        }
    }
}
