package generics

import classes.Customer
import java.io.Serializable
import java.lang.invoke.SerializedLambda

// Any? == T
class Repository<T> where T: Entity, T: Serializable { // upper bound restrictionß
    fun save(entity: T) {
        if (entity.id != 0) {

        }
    }
}

fun <T: Serializable> streamObject(obj: T) {

}

open class Entity(val id: Int)

fun main() {

    val repo = Repository<CustomerEntity>()
}

class CustomerEntity(id: Int) : Entity(id) {

}
