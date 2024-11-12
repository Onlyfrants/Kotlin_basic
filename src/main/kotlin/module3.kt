fun main(args: Array<String>) {

    //Задание 1

    isLeapYear(2024)

}
    fun isLeapYear(year: Int): Boolean {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)


        //Задание 2

    countEmployees()
    }

        fun countEmployees(vararg names: String): Int {
            return names.size

            //Задание 3

    printEmployeeInfo("Иванов Иван Иванович", "Программист")
    printEmployeeInfo("Петрова Мария Петровна", 30, "Менеджер")
    printEmployeeInfo("Сидоров Алексей Алексеевич", "женат", "Директор")
    printEmployeeInfo("Смирнова Ольга Сергеевна", 25, "Аналитик", "замужем")
        }
            fun printEmployeeInfo(fullName: String, position: String) {
                println("ФИО: $fullName")
                println("Должность: $position")
            }

            fun printEmployeeInfo(fullName: String, age: Int, position: String) {
                println("ФИО: $fullName")
                println("Возраст: $age")
                println("Должность: $position")
            }

            fun printEmployeeInfo(fullName: String, maritalStatus: String, position: String) {
                println("ФИО: $fullName")
                println("Семейное положение: $maritalStatus")
                println("Должность: $position")
            }

            fun printEmployeeInfo(fullName: String, age: Int, maritalStatus: String, position: String) {
                println("ФИО: $fullName")
                println("Возраст: $age")
                println("Семейное положение: $maritalStatus")
                println("Должность: $position")


}
//Задание 4
    val myArray = arrayOf("Строка 1", "Строка 2", "Строка 3")
    fun printArray(array: Array<String>, printFunction: (String) -> Unit) {
        array.forEach(printFunction)}



//Задание 5

fun sqrt(number: Double): Double {
    return kotlin.math.sqrt(number)
}


