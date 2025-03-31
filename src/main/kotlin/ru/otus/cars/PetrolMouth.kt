package ru.otus.cars

class PetrolMouth(override val tank: Tank): TankMouth() {
    fun fuelPetrol(liters: Int){
        open()
        tank.receiveFuel(liters)
        close()
    }

    override fun close() {
        println("Бак закрыт")
    }

    override fun open() {
        println("Бак открыт")
    }
}