package delegations


val String.hasAmpersand: Boolean
    get() = this.contains("&")

fun main() {

    println("Hello".hasAmpersand)
}
