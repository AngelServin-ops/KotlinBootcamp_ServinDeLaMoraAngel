fun main() {
    println(whatShouldIDoToday("feliz"))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "soleado",
    temperature: Int = 24
): String {
    return when {
        mood == "feliz" && weather == "soleado" -> "ir a dar un paseo"
        mood == "triste" && weather == "lluvioso" && temperature == 0 -> "quedarse en la cama"
        temperature > 35 -> "ir a nadar"
        else -> "Quedarse en casa y leer."
    }
}