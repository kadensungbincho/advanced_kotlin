package generics

import classes.Customer

// covariance

open class Person
class Employee: Person()

fun operate(person: List<Person>) {

}

interface ReadOnlyRepo<out T> { // respecting the covariance
    fun getId(id: Int): T
    fun getAll(): List<T>
}

interface WriteRepo<in T> { // contravariance
    fun save(obj: T)
    fun saveAll(list: List<T>)
}

fun main() {
    operate(listOf<Employee>())
    operate(listOf<Person>())

    val ro = ReadOnlyRepoImpl<Customer>()

}

// type projections
