fun main() {
    val especias = listOf("curry", "pimiento", "cayena", "jengibre", "curry rojo", "curry verde", "pimiento rojo")

    // Ordenar los curries por la longitud del texto
    val curriesOrdenados = especias.filter { it.contains("curry") }.sortedBy { it.length }

    // Filtrar los que empiezan con 'c' y terminan con 'e' (Con filtros)
    val cYe1 = especias.filter { it.startsWith('c') }.filter { it.endsWith('e') }

    // Filtrar los que empiezan con 'c' y terminan con 'e' (Con operador lógico &&)
    val cYe2 = especias.filter { it.startsWith('c') && it.endsWith('e') }

    // Filtrar los primeros 3 elementos por la letra 'c'
    val primeros3ConC = especias.take(3).filter { it.startsWith('c') }

    // Resultados
    println(curriesOrdenados)
    println(cYe1)
    println(cYe2)
    println(primeros3ConC)
}