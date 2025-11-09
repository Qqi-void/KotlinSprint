package org.example.app.lesson_4

fun main() {
    val totalTables = 13
    val bookedToday = 13
    val bookedTomorrow = 9

    val availableToday = bookedToday < totalTables
    val availableTomorrow = bookedTomorrow < totalTables

    println("Table availability for today: $availableToday")
    println("Table availability for tomorrow: $availableTomorrow")
}