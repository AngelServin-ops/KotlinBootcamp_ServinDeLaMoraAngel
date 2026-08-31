class Spice(val name: String, val spiciness: String = "mild") {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extreme" -> 10
                else -> 0
            }
        }

    init {
        println("Creado: $name con picante $spiciness (calor: $heat)")
    }
}

fun makeSalt() = Spice("Salt", "none")

fun main() {
    // Crear una lista de objetos Spice
    val spices = listOf(
        Spice("curry", "medium"),
        Spice("pepper", "spicy"),
        Spice("cayenne", "very spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "spicy"),
        makeSalt() // 7. Uso de la función auxiliar makeSalt()
    )

    // Filtrar especias con un nivel de picante/calor menor o igual a 5
    val spiceList = spices.filter { it.heat <= 5 }

    println("\nEspecias filtradas (calor <= 5):")
    for (spice in spiceList) {
        println("${spice.name}: ${spice.spiciness}")
    }
}