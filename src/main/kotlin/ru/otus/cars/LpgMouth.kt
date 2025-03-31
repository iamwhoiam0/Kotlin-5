package ru.otus.cars

class LpgMouth(override val tank: Tank): TankMouth() {
    fun fuelLpg(liters: Int){
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