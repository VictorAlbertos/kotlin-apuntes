package apuntes

fun main() {
    val names = arrayOf("Pepe", "Jose")
    procesarArray(names)

    val lastNames = arrayOf("Esparto", "Piedra")
    procesarArray(lastNames)

    val ages = arrayOf(22, 12)
    procesarArray(ages)
}

private fun procesarArray(array: Array<*>) {
    var index = 1
    if (array.size > index) {
        println(array[index])
    } else {
        println("no hay suficientes elementos para accaeder al indice $index")
    }

    index = 2
    if (array.size > index) {
        println(array[index])
    } else {
        println("no hay suficientes elementos para accaeder al indice $index")
    }

    index = 3
    try {
        println(array[index])
    } catch (e: Exception) {
        println(e.toString())
    }

    println("####")
}