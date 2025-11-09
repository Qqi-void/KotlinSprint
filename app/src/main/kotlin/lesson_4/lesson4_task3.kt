package org.example.app.lesson_4

const val IDEAL_HUMIDITY = 20
const val SEASON_TO_AVOID = "winter"

fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val season = "winter"

    val favorableConditions = isSunny && isTentOpen && humidity == IDEAL_HUMIDITY && season != SEASON_TO_AVOID

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}