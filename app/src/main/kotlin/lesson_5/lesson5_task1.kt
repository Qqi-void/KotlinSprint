package org.example.app.lesson_5

fun main() {
    val number1 = 4
    val number2 = 7

    println("Чтобы войти, решите пример: $number1 + $number2 = ?")
    val answer = readln().toInt()

    if (answer == number1 + number2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}