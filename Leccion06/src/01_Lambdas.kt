package juego.direccion

// Clase de enumeración con las direcciones
enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

// Clase Game
class Game {
    // Lista mutable inicializada con START
    var path: MutableList<Direction> = mutableListOf(Direction.START)

    // Lambdas para agregar cada dirección a la ruta
    val north = { path.add(Direction.NORTH) }
    val south = { path.add(Direction.SOUTH) }
    val east = { path.add(Direction.EAST) }
    val west = { path.add(Direction.WEST) }

    // Lambda de finalización
    val end = {
        path.add(Direction.END)
        println("Game Over: $path")
        path.clear()
        false
    }
}

// Función principal
fun main() {
    val game = Game()

    // Imprimir ruta inicial
    println(game.path)

    // Invocar las lambdas de movimiento y finalización
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()

    // Imprimir la ruta final limpia
    println(game.path)
}