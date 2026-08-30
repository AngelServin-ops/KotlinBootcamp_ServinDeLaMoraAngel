import java.util.Random

fun main() {
    // 1. Lambda básica de 1 a 12 caras
    val rollDice1 = { Random().nextInt(12) + 1 }

    // 2. Lambda con argumento para el número de lados
    val rollDice2 = { sides: Int -> Random().nextInt(sides) + 1 }

    // 3. Manejo de caso donde sides es 0
    val rollDice0 = { sides: Int ->
        if (sides == 0) 0 else Random().nextInt(sides) + 1
    }

    // 4. Usando notación de tipo de función explicitamente: (Int) -> Int
    val rollDice2Notacion: (Int) -> Int = { sides ->
        if (sides == 0) 0 else Random().nextInt(sides) + 1
    }

    println("Lanzamiento dado 12 caras: ${rollDice1()}")
    println("Lanzamiento dado 6 caras: ${rollDice2Notacion(6)}")
}