package org.example.app.lesson_4

const val TOTAL_TABLES = 13

fun main() {

    val bookedToday = 13
    val bookedTomorrow = 9

    val availableToday = bookedToday < TOTAL_TABLES
    val availableTomorrow = bookedTomorrow < TOTAL_TABLES

    println("Table availability for today: $availableToday")
    println("Table availability for tomorrow: $availableTomorrow")
}