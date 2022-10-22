package classes

typealias Name = String
typealias EmailData = String

data class Employee(val name: Name, val email: EmailData) {
    fun printName(string: String) {

    }
}

fun main() {
    val employee = Employee("Kaden", "kadensungbincho@gmail.com")
    employee.printName("A string")
}
