package buildings

// Clase base para la jerarquía de materiales
open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}

// Subclases con sus cantidades específicas
class Wood : BaseBuildingMaterial() {
    override val numberNeeded: Int = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded: Int = 8
}

// Clase genérica restringida a tipos de BaseBuildingMaterial
class Building<T : BaseBuildingMaterial>(val buildingMaterial: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("Se requieren $actualMaterialsNeeded ${buildingMaterial::class.simpleName}")
    }
}

// Función principal main
fun main() {
    val maderaBuilding = Building(Wood())
    maderaBuilding.build()

    val ladrilloBuilding = Building(Brick())
    ladrilloBuilding.build()
}