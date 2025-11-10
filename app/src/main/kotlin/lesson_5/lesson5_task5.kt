package org.example.app.lesson_5

import kotlin.random.Random

const val MIN_NUMBER = 0
const val MAX_NUMBER = 42

fun main() {
    val numbersToGuess = 3
    val winningNumbers = List(numbersToGuess) { Random.nextInt(MIN_NUMBER, MAX_NUMBER + 1) }.toSet().toList()

    println("Угадайте $numbersToGuess числа от $MIN_NUMBER до $MAX_NUMBER.")

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