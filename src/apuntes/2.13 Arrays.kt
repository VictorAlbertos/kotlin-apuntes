package apuntes

fun main() {
    val names = arrayOf("Pepe", "Jose")

    var index = 3
    if (names.size > index) {
        println(names[index])
    } else {
        println("no hay suficientes elementos para accaeder al indice $index")
    }

    index = 2
    if (names.size > index) {
        println(names[index])
    } else {
        println("no hay suficientes elementos para accaeder al indice $index")
    }

    index = 3
    try {
        println(names[index])
    } catch (e: Exception) {
        println(e.toString())
    }
}