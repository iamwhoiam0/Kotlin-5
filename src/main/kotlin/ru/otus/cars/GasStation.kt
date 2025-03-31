package ru.otus.cars

class GasStation{
    fun addFuelToCar(car: Car, fuel: Int){
        try {
            if (car.tankMouth is LpgMouth){
                (car.tankMouth as LpgMouth).fuelLpg(fuel)
            }else{
                (car.tankMouth as PetrolMouth).fuelPetrol(fuel)
            }
        }catch (e: NotImplementedError){
            println(e.message)
        }
    }

    fun addFuelToCar(cars: List<Car>) {
        cars.forEach { println(it.toString()) }
        cars.forEach { this.addFuelToCar(it, 100) }
        cars.forEach { println(it.toString()) }
    }
}