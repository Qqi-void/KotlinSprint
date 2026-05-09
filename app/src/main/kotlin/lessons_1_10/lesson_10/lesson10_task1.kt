package org.example.app.lessons_1_10.lesson_10

import kotlin.random.Random

fun main() {
    println("Ход игрока:")
    val playerRoll = rollDiceLesson10()
    println("Игрок выбросил: $playerRoll")

    println("Ход компьютера:")
    val computerRoll = rollDiceLesson10()
    println("Компьютер выбросил: $computerRoll")

    when {
        playerRoll > computerRoll -> println("Победило человечество")
        computerRoll > playerRoll -> println("Победила машина")
        else -> println("Победила дружба")
    }
}

fun rollDiceLesson10(): Int {
    return Random.nextInt(1, 7)
}
