package module4

abstract class Aircraft(
    private val number: String,
    private val maxRange: Int,
    private val tankCapacity: Int,
    private val yearOfProduction: Int,
    private val type: String,
    override val passengerCapacity: Int
) : Passenger {

    companion object {
        val flightDuration = 6
    }
    open fun printInfo() {
        println("Номер: $number")
        println("Дальность полета: $maxRange км")
        println("Вместимость бака: $tankCapacity л")
        println("Год выпуска: $yearOfProduction")
        println("Тип: $type")
    }

    val fuelConsumptionPer100km: Double
        get() = tankCapacity.toDouble() / maxRange * 100

    fun flightTime(distance: Int): Double {
        return distance.toDouble() / maxRange * flightDuration
    }

    constructor(number: String, maxRange: Int, tankCapacity: Int) :
            this(number, maxRange, tankCapacity, 2023, "Не указано")

    constructor(number: String, maxRange: Int, tankCapacity: Int, yearOfProduction: Int, s: String) :
            this(number, maxRange, tankCapacity, 2023, "Не указано", 0)

}
