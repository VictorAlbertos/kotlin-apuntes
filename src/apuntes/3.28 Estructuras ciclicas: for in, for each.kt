package apuntes

fun main() {
    for (i in 0..10) {
        print("-$i-")
    }

    println()

    for (i in 10 downTo 0) {
        print("-$i-")
    }

    println()

    val numeros: List<String> = listOf("1", "2", "3")

    numeros.forEach { numero ->
        print("-$numero-")
    }

    println()

    numeros.forEachIndexed { index, numero ->
        print("-$index#$numero-")
    }

    println()


    val sumaDeNumeros = numeros
        .map { numero ->
            numero.toInt()
        }
        .sum()

    println(sumaDeNumeros)
}