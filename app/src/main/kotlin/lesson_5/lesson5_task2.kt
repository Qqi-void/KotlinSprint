package org.example.app.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = 2025

    println("Введите ваш год рождения:")
    val birthYear = readln().toInt()

    val age = currentYear - birthYear

    val resultText = if (age >= AGE_OF_MAJORITY) {
        "Показать экран со скрытым контентом"
    } else {
        "Доступ запрещен"
    }
    println(resultText)
}