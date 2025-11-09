package org.example.app.lesson_4

fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val season = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            (isSunny && isTentOpen && humidity == 20 && season != "winter")
    )
}
