package metaprogramming

import kotlin.reflect.full.memberProperties

fun main() {

    val classInfo = Transaction::class

    classInfo.memberProperties.forEach {
        println("${it.name} of type ${it.returnType}")
    }

    classInfo.constructors.forEach {
        println("Constructor ${it.name} - ${it.parameters}")
    }
}
