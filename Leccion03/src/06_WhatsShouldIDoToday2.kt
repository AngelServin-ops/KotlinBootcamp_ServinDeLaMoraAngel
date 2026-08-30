fun main(args: Array<String>) {
    println(whatShouldIDoToday2("feliz", "soleado"))
    println(whatShouldIDoToday2("triste"))
    print("¿Cómo te sientes?")
    println(whatShouldIDoToday2(readLine()!!))
}

fun haceMuchoCalor(temperatura: Int) = temperatura > 35
fun estaTristeLluviosoFrio(estadoAnimo: String, clima: String, temperatura: Int) =
    estadoAnimo == "triste" && clima == "lluvioso" && temperatura == 0
fun estaFelizSoleado(estadoAnimo: String, clima: String) =
    estadoAnimo == "feliz" && clima == "soleado"

fun whatShouldIDoToday2(
    estadoAnimo: String,
    clima: String = "soleado",
    temperatura: Int = 24
): String {
    return when {
        haceMuchoCalor(temperatura) -> "ir a nadar"
        estaTristeLluviosoFrio(estadoAnimo, clima, temperatura) -> "quedarse en la cama"
        estaFelizSoleado(estadoAnimo, clima) -> "ir a dar un paseo"
        else -> "Quedarse en casa y leer."
    }
}