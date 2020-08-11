package apuntes

fun main() {
    val numeroEncubierto: Any = 10
    //numeroEncubierto + 2 da error porque ya no es Int para el compilador

    val stringEncubierto: Any = "pepe"

    // ¿Por qué ninguna de las dos variables pueden usarse como Int y String respectivamente?
    // Porque hemos enmascarado su tipo real con el mas generico de Any
    // ¿Por qué si miras las propiedades/métodos de esas variables apenas se puede hacer casi nada?
    // Porque para el compilador esas variables son Any, y no su valor subyacente, entonces hay muy poco
    // que se pueda hacer con un objeto de tipo Any.
    // De Any extendiende cualquier objeto en Kotlin


    // con "as" podemos hacer casting de un tipo de variable a otro. En este caso,  numeroEncubierto es
    // Any pero nosotros sabemos que su valor subyacente es un Int, se lo podemos decir al compilador
    // con un cast
    val numeroOriginal = numeroEncubierto as Int
    println(numeroOriginal + 2)

    val stringOriginal = stringEncubierto as String
    println("$stringOriginal esparto")

    //si tratamos de hacer cast a un valor que no procede, como por ejemplo de string a Int,
    //el programa peta
    try {
        stringEncubierto as Int
    } catch (e: ClassCastException) {
        println(e.toString())
    }
}