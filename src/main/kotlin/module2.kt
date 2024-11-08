fun main(args: Array<String>) {

    var correctAnswers = 0

    println("Тест на знание столиц стран мира")

    // Вопрос 1
    println("Какая столица у Франции?")
    println("1. Париж")
    println("2. Лондон")
    println("3. Берлин")
    val answer1 = readln().toInt()
    if (answer1 == 1) correctAnswers++

    // Вопрос 2
    println("Какая столица у Японии?")
    println("1. Токио")
    println("2. Сеул")
    println("3. Пекин")
    val answer2 = readln().toInt()
    if (answer2 == 1) correctAnswers++

    // Вопрос 3
    println("Какая столица у Австралии?")
    println("1. Сидней")
    println("2. Канберра")
    println("3. Мельбурн")
    val answer3 = readln().toInt()
    if (answer3 == 2) correctAnswers++

    // Вопрос 4
    println("Какая столица у Китая?")
    println("1. Шанхай")
    println("2. Пекин")
    println("3. Гонконг")
    val answer4 = readln().toInt()
    if (answer4 == 2) correctAnswers++

    // Вопрос 5
    println("Какая столица у Италии?")
    println("1. Рим")
    println("2. Милан")
    println("3. Венеция")
    val answer5 = readln().toInt()
    if (answer5 == 1) correctAnswers++

    // Вывод результата
    when (correctAnswers) {
        5 -> println("Вы отлично знаете столицы! Пять баллов!")
        4 -> println("Ваши знания столиц на твердую четверку.")
        3 -> println("Так держать, но следует немного подучить.")
        2 -> println("Неплохо, но можно и лучше.")
        1 -> println("Попробуйте еще раз.")
        else -> println("Что-то пошло не так...")
    }
        // Задание 2

    print("Введите сумму вклада: ")
    val initialDeposit = readln().toDouble()

    print("Введите длительность вклада (в месяцах): ")
    val durationInMonths = readln().toInt()

    print("Введите ежемесячный процент по вкладу (%): ")
    val monthlyInterestRate = readln().toDouble() / 100

    var currentDeposit: Double = initialDeposit

    for (month in 1..durationInMonths) {
        val monthlyIncrease = currentDeposit * monthlyInterestRate
        currentDeposit += monthlyIncrease

        println("Месяц $month:")
        println("Увеличение вклада: $monthlyIncrease")
        println("Итоговая сумма вклада: $currentDeposit")
        println()
    }


// Задание 3


    val countriesData = arrayOf(
        arrayOf("Россия", "Москва", "рубль"),
        arrayOf("США", "Вашингтон", "доллар"),
        arrayOf("Япония", "Токио", "йена")
    )

    for (country in countriesData) {
        println("Страна: ${country[0]}, Столица: ${country[1]}, Валюта: ${country[2]}")
    }

    // Задание 4

    val cities = mutableListOf<String>()

    while (true) {
        println("Выберите действие:")
        println("1. Добавить город")
        println("2. Показать все города")
        println("3. Показать уникальные города")
        println("4. Выход")

        val choice = readln().toInt()

        when (choice) {
            1 -> {
                print("Введите название города: ")
                val city = readln()
                cities.add(city)
                println("Город $city добавлен.")
            }
            2 -> {
                println("Список всех городов:")
                cities.forEach { println(it) }
            }
            3 -> {
                println("Список уникальных городов:")
                val uniqueCities = cities.toSet()
                uniqueCities.forEach { println(it) }
            }
            4 -> {
                println("Выход из программы.")
                break
            }
            else -> println("Некорректный выбор.")
        }
    }

    // Задание 5

    val employees = mutableMapOf<Int, String>(
        1 to "Иванов Иван Иванович",
        2 to "Петров Петр Петрович",
        3 to "Сидорова Анна Сергеевна"
    )

    while (true) {
        println("Введите номер рабочего места (0 для выхода):")
        val workplaceNumber = readln().toInt()

        if (workplaceNumber == 0) {
            break
        }

        val employee = employees[workplaceNumber]
        if (employee != null) {
            println("На рабочем месте $workplaceNumber работает: $employee")
        } else {
            println("Рабочее место $workplaceNumber не занято.")
        }
    }
}