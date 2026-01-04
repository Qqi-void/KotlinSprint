package org.example.app.lesson_10

fun main() {
    print("Введите длину пароля: ")
    val length = readln().toInt()

    val password = generatePassword(length)
    println("Сгенерированный пароль: $password")
}

fun generatePassword(length: Int): String {
    val digits = "0123456789"
    val symbols = "!\"#$%&'()*+,-./ "

    val result = StringBuilder()

    for (i in 0 until length) {
        if (i % 2 == 0) {
            result.append(digits.random())
        } else {
            result.append(symbols.random())
        }
    }
    return result.toString()
}