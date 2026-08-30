fun main(args: Array<String>) {

    val hora = args.firstOrNull()?.toIntOrNull() ?: 8

    println("Buenas ${if (hora < 12) "días" else "noches"}, Kotlin")
}