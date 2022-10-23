package coroutines

import kotlinx.coroutines.async
import java.util.concurrent.CompletableFuture
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking

private fun startingAsyncOperation(v: Int) =
    CompletableFuture.supplyAsync {
        Thread.sleep(1000)
        "Result: $v"
    }

suspend fun main() {
    coroutineScope {
        val future = async<String> {

            (1..5).map {

                startingAsyncOperation(it)

            }.joinToString { "\n" }
        }
        println("this before")
        println(future.await())
        println("this after")
    }
}
