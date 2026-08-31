package leccion06.ordensuperior

// Función de extensión de List<Int> que acepta una lambda como parámetro
fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

    // Se pasa una lambda que calcula el residuo de la división entre 3 (it.rem(3) o it % 3)
    val divisiblesPorTres = numbers.divisibleBy { it.rem(3) }

    println(divisiblesPorTres)
}