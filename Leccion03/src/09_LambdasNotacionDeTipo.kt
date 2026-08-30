import java.util.Random

// Lambda con notación de tipo
val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0 else Random().nextInt(sides) + 1
}

// gamePlay recibe la función (operación de lanzar dados) y el número de lados
fun gamePlay(operation: (Int) -> Int, sides: Int = 6) {
    println("Resultado de la tirada: ${operation(sides)}")
}

fun main() {
    // Pasar rollDice2 como argumento para generar la tirada internamente
    gamePlay(rollDice2, 6)
    gamePlay(rollDice2, 20)
}