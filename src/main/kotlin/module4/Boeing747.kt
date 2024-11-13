package module4

class Boeing747(
    number: String,
    maxRange: Int,
    tankCapacity: Int,
    yearOfProduction: Int,
    passengerCapacity: Int
) : Aircraft(number, maxRange, tankCapacity, yearOfProduction, "Boeing 747", passengerCapacity) {

    override fun printInfo() {
        super.printInfo()
        println("Вместимость пассажиров: $passengerCapacity")
    }
}
