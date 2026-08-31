class SimpleSpice {
    val name = "curry"
    val spiciness = "mild"

    // Captador personalizado (custom getter)
    val heat: Int
        get() {
            return 5
        }
}

fun main() {
    val simpleSpice = SimpleSpice()
    println("Nombre: ${simpleSpice.name}, Nivel de calor: ${simpleSpice.heat}")
}