package spices

// Interfaz para el color
interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color: String = "amarillo"
}

// Interfaz Grinder
interface Grinder {
    fun grind()
}

// Clase abstracta Spice que delega la interfaz SpiceColor
abstract class Spice(
    val name: String,
    val spiciness: String = "mild",
    color: SpiceColor = YellowSpiceColor
) : SpiceColor by color {

    abstract fun prepareSpice()
}

// Subclase Curry que implementa Grinder y hereda de Spice
class Curry(
    name: String,
    spiciness: String,
    color: SpiceColor = YellowSpiceColor
) : Spice(name, spiciness, color), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Moliendo el curry hasta convertirlo en polvo...")
    }
}

fun main() {
    val curry = Curry("Curry Rojo", "medium")

    println("Nombre: ${curry.name}")
    println("Color de la especia: ${curry.color}")

    curry.prepareSpice()
}