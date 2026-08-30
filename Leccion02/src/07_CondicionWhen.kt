fun main() {

    val fishName = "salmon"

    when(fishName.length){
        0 -> println("Mensaje de error: el nombre no puede estar vacío")
        in 3..12 -> println("Buen nombre del pez")
        else -> println("Aceptar nombre del pez")
    }
}