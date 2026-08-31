package buildings.funciones

open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded: Int = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded: Int = 8
}

class Building<out T : BaseBuildingMaterial>(val buildingMaterial: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("Se requieren $actualMaterialsNeeded ${buildingMaterial::class.simpleName}")
    }
}

// Función genérica para determinar el tamaño del edificio
fun <T : BaseBuildingMaterial> esEdificioPequeno(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("Edificio pequeño")
    } else {
        println("Edificio grande")
    }
}

fun main() {
    val edificioMadera = Building(Wood())
    val edificioLadrillo = Building(Brick())

    esEdificioPequeno(edificioMadera)
    esEdificioPequeno(edificioLadrillo)
}