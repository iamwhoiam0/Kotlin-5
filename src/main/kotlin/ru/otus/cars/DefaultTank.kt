package ru.otus.cars

class DefaultTank: Tank {

    private var fuelLevel: Int = 0

    override fun getContents(): Int = fuelLevel

    override fun receiveFuel(liters: Int) {
        fuelLevel += liters
    }
}