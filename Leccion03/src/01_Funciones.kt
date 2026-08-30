import java.util.Calendar

fun main(args: Array<String>) {
    dayOfWeek()
}

fun dayOfWeek() {
    println("¿Qué día es hoy?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when (day) {
        1 -> "Domingo"
        2 -> "Lunes"
        3 -> "Martes"
        4 -> "Miércoles"
        5 -> "Jueves"
        6 -> "Viernes"
        7 -> "Sábado"
        else -> "El tiempo se ha detenido"
    })
}