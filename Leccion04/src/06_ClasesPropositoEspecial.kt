package leccion04.especial

// Enum para representar los colores en RGB
enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00)
}

// Interfaz SpiceColor con tipo Color
interface SpiceColor {
    val color: Color
}

// Objeto Singleton YellowSpiceColor
object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

// Interfaz para moler
interface Grinder {
    fun grind()
}

// Spice cambiada a clase sellada (sealed class)
sealed class Spice(
    val name: String,
    val spiciness: String = "mild",
    color: SpiceColor = YellowSpiceColor
) : SpiceColor by color {

    abstract fun prepareSpice()
}

// Subclase Curry que hereda de la clase sellada Spice
class Curry(
    name: String,
    spiciness: String,
    color: SpiceColor = YellowSpiceColor
) : Spice(name, spiciness, color), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Moliendo el curry...")
    }
}

fun main() {
    val curry = Curry("Curry Amarillo", "mild")
    println("Color RGB: ${curry.color.rgb}")
}