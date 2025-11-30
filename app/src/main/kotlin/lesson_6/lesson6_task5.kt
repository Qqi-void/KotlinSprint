package org.example.app.lesson_6

import kotlin.random.Random

fun main() {
    var attemptsLeft = 3

    while (attemptsLeft > 0) {
        val a = Random.nextInt(1, 10)
        val b = Random.nextInt(1, 10)

        println("Решите пример: $a + $b = ?")
        val answer = readln().toInt()

        if (answer == a + b) {
            println("Добро пожаловать!")
            return
        } else {
            attemptsLeft--
            if (attemptsLeft > 0) {
                println("Неверно! Осталось попыток: $attemptsLeft")
            }
        }
    }

    println("Доступ запрещен")
}
