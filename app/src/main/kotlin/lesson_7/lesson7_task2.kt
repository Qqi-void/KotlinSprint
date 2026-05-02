package org.example.app.lesson_7

import kotlin.random.Random

const val MIN_CODE = 1000
const val MAX_CODE = 9999

fun main() {
    while (true) {
        val code = Random.nextInt(MIN_CODE, MAX_CODE + 1)
        println("Ваш код авторизации: $code")

        print("Введите код: ")
        val userInput = readln().toIntOrNull()

        if (userInput == code) {
            println("Авторизация успешна! Добро пожаловать!")
            return
        } else {
            println("Неверный код, отправляем новый...")
        }
    }
}