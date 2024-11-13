package module4

data class Car(
    val make: String,
    val color: String,
    val number: String
)

fun main() {
    val car1 = Car("Toyota", "синий", "А123БС")
    val car2 = Car("BMW", "черный", "В456МС")

    println(car1)
    println(car2)
}