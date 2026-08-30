fun main(args: Array<String>) {
    println("\nTu fortuna es: ${getFortuneCookie()}")
}

fun getFortuneCookie(): String {
    val fortunes = listOf(
        "Tendrás un gran día",
        "Hoy te irá bien.",
        "Disfruta de un maravilloso día de éxito.",
        "Sé humilde y todo saldrá bien.",
        "Hoy es un buen día para ejercer moderación",
        "Tómatelo con calma y disfruta la vida",
        "Atesora a tus amigos porque son tu mayor fortuna"
    )

    print("Ingresa tu cumpleaños: ")
    val birthday = readLine()?.toIntOrNull() ?: 1

    return fortunes[birthday % fortunes.size]
}