package apuntes

fun main() {
    for (i in 1..10) {
        print(i)
    }

    println()

    for (i in 10 downTo 1) {
        print(i)
    }

    println()

    val numeros = listOf("1", "2", "3")

    numeros.forEach { numero ->
        print(numero)
    }

    println()

    numeros.forEachIndexed { index, numero ->
        print(index)
        print(numero)
    }

    println()

    val sumaDeNumeros = numeros
        .map { numero -> numero.toInt() }
        .sum()

    println(sumaDeNumeros)
}