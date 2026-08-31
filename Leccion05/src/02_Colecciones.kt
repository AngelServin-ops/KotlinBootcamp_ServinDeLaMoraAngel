fun main() {
    // Crear un Set con títulos de libros
    val todosLosLibros = setOf("Macbeth", "Romeo y Julieta", "Hamlet", "El sueño de una noche de verano")

    // Crear un Map que asocie el conjunto de libros con el autor
    val biblioteca = mapOf("Shakespeare" to todosLosLibros)

    // Usar any() para comprobar si algún autor tiene el libro "Hamlet"
    val tieneHamlet = biblioteca.any { it.value.contains("Hamlet") }
    println("¿Existe Hamlet en la biblioteca?: $tieneHamlet")

    // Crear un MutableMap (mapa mutable) y agregar un par título/autor
    val masLibros = mutableMapOf<String, String>("Guillermo Tell" to "Schiller")

    // Usar getOrPut() para obtener el valor o agregarlo si no existe
    masLibros.getOrPut("El libro de la selva") { "Kipling" }
    masLibros.getOrPut("Hamlet") { "Shakespeare" }

    println(masLibros)
}