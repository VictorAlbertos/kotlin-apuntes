package apuntes

class Coche(val marca: String, val modelo: String, val matricula: String, val kms: Int) {
    fun info(): String {
        return "marca: $marca, modelo: $modelo, matricula: $matricula, kms: $kms"
    }
}

class Oferta(val coche: Coche, val precio: Int, val descuento: Double) {
    fun info(): String {
        return "precio: $precio, descuento: $descuento, ${coche.info()}"
    }

    fun precioConDescuento(): Int {
        val precioConDescuento = precio - precio * descuento
        return precioConDescuento.toInt()
    }
}

fun main() {
    val coche = Coche("renault", "clio", "ML1234", 135)
    println(coche.info())

    val oferta = Oferta(coche, 1000, 0.1)
    println(oferta.info())
    println(oferta.precioConDescuento())
}