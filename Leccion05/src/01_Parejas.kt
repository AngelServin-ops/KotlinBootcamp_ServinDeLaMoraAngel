class Libro(val titulo: String, val autor: String, val anio: Int) {

    // Devuelve título y autor como un Par (Pair)
    fun obtenerTituloAutor(): Pair<String, String> {
        return titulo to autor
    }

    // Devuelve título, autor y año como una Tríada (Triple)
    fun obtenerTituloAutorAnio(): Triple<String, String, Int> {
        return Triple(titulo, autor, anio)
    }
}

fun main() {
    // Instancia del libro
    val libro = Libro("Romeo y Julieta", "William Shakespeare", 1597)

    // Obtención de los datos mediante Pair y Triple
    val tituloAutor = libro.obtenerTituloAutor()
    val tituloAutorAnio = libro.obtenerTituloAutorAnio()

    println("Aquí está su libro ${tituloAutor.first} escrito por ${tituloAutor.second}")
    println("Aquí está su libro ${tituloAutorAnio.first} escrito por ${tituloAutorAnio.second} en ${tituloAutorAnio.third}")
}