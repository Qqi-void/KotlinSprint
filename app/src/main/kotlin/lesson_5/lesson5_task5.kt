package org.example.app.lesson_5

import kotlin.random.Random


fun main() {
    val minNumber = 0
    val maxNumber = 42
    val numbersToGuess = 3

    val winningNumbers = List(numbersToGuess) { Random.nextInt(minNumber, maxNumber + 1) }.toSet().toList()

    println("Угадайте $numbersToGuess числа от $minNumber до $maxNumber.")

    val userNumbers = mutableListOf<Int>()
    repeat(numbersToGuess) { i ->
        print("Введите число №${i + 1}: ")
        userNumbers.add(readln().toInt())
    }

    val guessedCount = userNumbers.intersect(winningNumbers.toSet()).size

    val resultMessage = when (guessedCount) {
        3 -> "Вы угадали все числа и выиграли ДЖЕКПОТ!"
        2 -> "Вы угадали два числа и получаете крупный приз!"
        1 -> "Вы угадали одно число и получаете утешительный приз!"
        else -> "Неудача! Вы не угадали ни одного числа."
    }

    println(resultMessage)
    println("Выигрышные числа были: ${winningNumbers.joinToString(", ")}")
}