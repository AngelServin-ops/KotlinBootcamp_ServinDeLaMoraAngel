fun main() {
    // 1. Ejemplo básico
    val numbers = intArrayOf(11, 12, 13, 14, 15)
    val numberStrings = mutableListOf<String>()

    for (number in numbers) {
        numberStrings.add(number.toString())
    }
    println("Ejemplo básico: $numberStrings")

    // 2. Ejemplo del desafío
    val list3: MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) list3.add(i)
    println("Desafío: $list3")
}
// Leccion 2