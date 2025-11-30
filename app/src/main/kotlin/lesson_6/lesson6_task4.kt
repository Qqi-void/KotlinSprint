package org.example.app.lesson_6

import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 10)
    var attemptsLeft = 5

    println("Угадайте число от 1 до 9. У вас $attemptsLeft попыток.")

    while (attemptsLeft > 0) {
        print("Введите число: ")
        val guess = readln().toInt()

        if (guess == secretNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            attemptsLeft--
            if (attemptsLeft > 0) {
                println("Неверно! Осталось попыток: $attemptsLeft")
            }
        }
    }

    println("Время вышло! Было загадано число $secretNumber")
}

