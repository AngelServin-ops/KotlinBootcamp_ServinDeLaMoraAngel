fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nTu fortuna es: $fortune")
        if (fortune.contains("Tómatelo con calma")) break
    }
}

fun getBirthday(): Int {
    print("\nIngresa tu cumpleaños: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    val fortunes = listOf(
        "Tendrás un gran día",
        "Hoy te irá bien.",
        "Disfruta de un maravilloso día de éxito.",
        "Sé humilde y todo saldrá bien.",
        "Hoy es un buen día para ejercer moderación",
        "Tómatelo con calma y disfruta la vida",
        "Atesora a tus amigos porque son tu mayor fortuna"
    )

    return when (birthday) {
        28, 31 -> "Disfruta de un maravilloso día de éxito."
        in 1..7 -> "Tendrás un gran día"
        else -> fortunes[birthday % fortunes.size]
    }
}