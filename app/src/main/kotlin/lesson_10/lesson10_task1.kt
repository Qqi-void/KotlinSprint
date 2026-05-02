package org.example.app.lesson_10

import kotlin.random.Random

fun main() {
    println("Ход игрока:")
    val playerRoll = rollDice()
    println("Игрок выбросил: $playerRoll")

    println("Ход компьютера:")
    val computerRoll = rollDice()
    println("Компьютер выбросил: $computerRoll")

    when {
        playerRoll > computerRoll -> println("Победило человечество")
        computerRoll > playerRoll -> println("Победила машина")
        else -> println("Победила дружба")
    }
}

fun rollDice(): Int {
    return Random.nextInt(1, 7)
}
