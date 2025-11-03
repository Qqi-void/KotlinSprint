package org.example.app.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffPercent = 20
    val percentDivider = 100

    val bonusCrystal = crystalOre * buffPercent / percentDivider
    val bonusIron = ironOre * buffPercent / percentDivider

    println("Crystal: $bonusCrystal")
    println("Iron: $bonusIron")
}