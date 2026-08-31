package juego.final

import kotlin.math.absoluteValue

enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

// Desafío: Clase Location para gestionar el mapa 4x4
class Location(val width: Int = 4, val height: Int = 4) {
    val map = Array(width) { arrayOfNulls<String>(height) }

    init {
        map[0][0] = "un bosque frondoso y oscuro."
        map[0][1] = "una cueva con ecos misteriosos."
        map[0][2] = "una playa con arena dorada."
        map[0][3] = "un acantilado impresionante."
        map[1][0] = "un prado lleno de flores multicolores."
        map[1][1] = "un antiguo templo en ruinas."
        map[1][2] = "un río de aguas cristalinas."
        map[1][3] = "una montaña cubierta de nieve."
        map[2][0] = "un pueblo abandonado."
        map[2][1] = "un mercado antiguo y bullicioso."
        map[2][2] = "un pantano cubierto de niebla."
        map[2][3] = "un puente de piedra muy antiguo."
        map[3][0] = "un valle verde e infinito."
        map[3][1] = "un desierto abrasador."
        map[3][2] = "un oasis lleno de palmeras."
        map[3][3] = "la entrada al castillo final."
    }
}

class Game {
    var path: MutableList<Direction> = mutableListOf(Direction.START)
    val location = Location()

    // Coordenadas para el mapa
    var x = 0
    var y = 0

    // Lambdas de movimiento
    val north = {
        path.add(Direction.NORTH)
        y = (y + 1).rem(location.height).absoluteValue
        true
    }
    val south = {
        path.add(Direction.SOUTH)
        y = (y - 1 + location.height).rem(location.height).absoluteValue
        true
    }
    val east = {
        path.add(Direction.EAST)
        x = (x + 1).rem(location.width).absoluteValue
        true
    }
    val west = {
        path.add(Direction.WEST)
        x = (x - 1 + location.width).rem(location.width).absoluteValue
        true
    }

    // Lambda de finalización
    val end = {
        path.add(Direction.END)
        println("Fin del juego. Ruta realizada: $path")
        path.clear()
        false
    }

    // Función de orden superior que ejecuta la lambda pasada
    fun move(where: () -> Boolean): Boolean {
        return where.invoke()
    }

    // Selecciona el movimiento según el texto ingresado
    fun makeMove(command: String?) {
        val keepPlaying = when (command?.trim()?.lowercase()) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }

        if (keepPlaying) {
            actualizarUbicacion()
        }
    }

    private fun actualizarUbicacion() {
        val descripcion = location.map[x][y] ?: "un lugar desconocido."
        println("Te encuentras en: $descripcion (Posición: $x, $y)")
    }
}

fun main() {
    val game = Game()

    println("¡Bienvenido al juego de aventuras!")
    println("Te encuentras en: ${game.location.map[0][0]}")

    // Bucle principal del juego
    while (true) {
        print("\nIngresa una dirección (n/s/e/w): ")
        val entrada = readLine()

        game.makeMove(entrada)

        // Finaliza la ejecución si el camino se ha reseteado tras invocarse 'end'
        if (game.path.isEmpty()) {
            break
        }
    }
}