package leccion05.constantes

// Constante de nivel superior
const val MAXIMOS_LIBROS_PRESTADOS = 20

// Objeto singleton para constantes globales
object Constantes {
    const val URL_BASE = "http://www.biblioteca.com/"
}

class Libro(val titulo: String, val autor: String) {

    // Método para verificar si puede pedir más libros prestados
    fun puedePedirPrestado(librosPrestadosActuales: Int): Boolean {
        return librosPrestadosActuales < MAXIMOS_LIBROS_PRESTADOS
    }

    // Método que imprime la URL usando el companion object
    fun imprimirUrl() {
        println("${URL_BASE_LIBRO}${titulo}.html")
    }

    // Objeto complementario (companion object) para limitar el alcance a la clase
    companion object {
        const val URL_BASE_LIBRO = "http://www.biblioteca.com/libros/"
    }
}

fun main() {
    val libro = Libro("don-quijote", "Miguel de Cervantes")

    // Prueba del método puedePedirPrestado
    println("¿Puede pedir prestado?: ${libro.puedePedirPrestado(10)}") // true
    println("¿Puede pedir prestado?: ${libro.puedePedirPrestado(20)}") // false

    // Prueba del método imprimirUrl
    libro.imprimirUrl()
}