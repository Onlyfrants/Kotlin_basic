fun module1(args: Array<String>) {

//Задание 1

    var firstTask1 : Any? = null
    var firstTask2 : Int = (firstTask1?:10) as Int
    var firstTask3 : Any = firstTask2/2.5 // тип данных Double

//Задание 2

    var secondTask1 : String = "hello"
    var secondTask2 : String = " aplana"
    print(secondTask1 + secondTask2)

//Задание 3

    var five: Char = '5'
    var string : String = five.toString()
    var byte : Byte = five.toByte()
    var short : Short = five.toShort()
    var int : Int = five.toInt()
    var double : Double = five.toDouble()
    var float : Float = five.toFloat()
    var long : Long = five.toLong()

//Задание 4

    println("Напишите ваше имя пользователя и нажмите Enter")
    var text : String? = readLine()
    var inputText : String = text.toString()
    print("Добро пожаловать, "+ inputText)

//Задание 5

    var alphabet = "z".."a"

//Задание 6

    println("Напишите число и нажмите Enter")
    var a : String? = readLine()
    println("Напишите второе число и нажмите Enter")
    var b : String? = readLine()
    var boolean = a!! > b.toString()
    print(boolean)

}