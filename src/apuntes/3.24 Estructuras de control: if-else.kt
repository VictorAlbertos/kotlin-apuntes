package apuntes

fun main() {
    val minEdad = 18
    val maxEdad = 68

    val edad = readLine()!!.toInt()
    if (edad >= minEdad && edad < maxEdad) {
        print("Puede votar")
    } else {
        print("No puede votar")
    }

    val number = readLine()!!.toInt()
    if (number % 2 == 0) {
        print("Par")
    } else {
        print("Impar")
    }
}