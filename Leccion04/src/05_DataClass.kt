import spices.Curry
import spices.Spice

data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}

val spiceCabinet = listOf(
    SpiceContainer(Curry("Yellow Curry", "mild")),
    SpiceContainer(Curry("Red Curry", "medium")),
    SpiceContainer(Curry("Green Curry", "spicy"))
)

fun main() {
    for (container in spiceCabinet) {
        println(container.label)
    }
}