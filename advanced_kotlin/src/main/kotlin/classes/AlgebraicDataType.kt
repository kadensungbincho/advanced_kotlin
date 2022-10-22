package classes


class PageResult(val result: String, var isError: Boolean)

fun getURLPage(url: String): PageResult {

    val wasValidCall = false
    return if (wasValidCall) {
        PageResult("The content", false)
    } else {
        PageResult("ERROR", true)
    }
}

sealed class PageResult2 {}
class Success(val content: String): PageResult2()
class Error(val code: Int, val message: String): PageResult2()


fun getURLPage2(url: String): PageResult2 {

    val wasValidCall = false
    return if (wasValidCall) {
        Success("The content")
    } else {
        Error(404, "Not found")
    }
}

fun main() {
    val pageResult = getURLPage("/")
    if (pageResult.isError) {

    }

    val pageResult2 = getURLPage2("/")
    when (pageResult2) {
        is Success -> println(pageResult2.content)
        is Error -> println(pageResult2.message)
    }
}
