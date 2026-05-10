package org.example.app.lesson_12

import kotlin.random.Random

class Day(
    tempKelvinDay: Int,
    tempKelvinNight: Int,
    _hasPrecipitation: Boolean,
) {
    val dayTemp = tempKelvinDay - 273
    val nightTemp = tempKelvinNight - 273
    val hasPrecipitation = _hasPrecipitation
}

fun main() {
    val month = mutableListOf<Day>()

    for (i in 1..30) {
        month.add(
            Day(
                Random.nextInt(280, 310),
                Random.nextInt(270, 290),
                Random.nextBoolean()
            )
        )
    }
    val monthDayTemps = month.map { it.dayTemp }
    val monthNightTemps = month.map { it.nightTemp }

    val averageDay = monthDayTemps.average()
    val averageNight = monthNightTemps.average()

    val rainyDays = month.count { it.hasPrecipitation }

    println("Average day temp: $averageDay C")
    println("Average night temp: $averageNight C")
    println("Count of rainy days: $rainyDays")
}