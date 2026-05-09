package org.example.app.lessons_1_10.lesson_10

import kotlin.random.Random

fun main() {
    var wins = 0
    var answer: String

    do {
        val humanWon = playRound()
        if (humanWon) {
            wins++
        }

        print("Хотите бросить кости еще раз? Введите Да или Нет: ")
        answer = readln()
    } while (answer.equals("да", ignoreCase = true))

    println("Вы выиграли партий: $wins")
}

fun playRound(): Boolean {
    val humanRoll = rollDice()
    val computerRoll = rollDice()

    println("Игрок бросил: $humanRoll")
    println("Компьютер бросил: $computerRoll")

    return when {
        humanRoll > computerRoll -> {
            println("Победило человечество")
            true
        }
        humanRoll < computerRoll -> {
            println("Победила машина")
            false
        }
        else -> {
            println("Победила дружба")
            false
        }
    }
}

fun rollDice(): Int {
    return Random.nextInt(1, 7)
}
