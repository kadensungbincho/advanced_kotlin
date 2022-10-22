package delegations

import kotlin.properties.Delegates

typealias Name = String
typealias EmailData = String

data class Employee(val name: Name, val email: EmailData) {

    var department: String by Delegates.observable("") { property, oldValue, newValue ->
        println("Property ${property.name} has changed from $oldValue to $newValue")
    }

    fun printName(string: String) {

    }
}

fun main() {

    val employee = Employee("Kaden", "email")

    employee.department = "IT"
}
