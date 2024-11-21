package module4

fun main() {
    val boeing = Boeing747("747-8", 15000, 250000, 2020, 416)
    boeing.printInfo()

    val aircraftFleet: MutableList<Any> = mutableListOf(
        PassengerAircraft("Boeing 737", 180),
        CargoAircraftImpl("Antonov An-124", 150))

    while (true) {
        println("Выберите действие:")
        println("1. Показать список всех самолетов")
        println("2. Показать список грузовых самолетов")
        println("3. Выход")

        val choice = readLine()?.toIntOrNull() ?: continue

        when (choice) {
            1 -> showAllAircraft(aircraftFleet)
            2 -> showCargoAircraft(aircraftFleet)
            3 -> break
            else -> println("Неверный выбор")
        }
    }
}

fun showAllAircraft(aircraftFleet: List<Any>) {
    aircraftFleet.forEachIndexed { index, aircraft ->
        println("$index. $aircraft")
    }
}

fun showCargoAircraft(aircraftFleet: List<Any>) {
    aircraftFleet.filterIsInstance<CargoAircraft>().forEachIndexed { index, aircraft ->
        println("$index. $aircraft, грузоподъемность: ${aircraft.cargoCapacity} тонн")
    }
}
