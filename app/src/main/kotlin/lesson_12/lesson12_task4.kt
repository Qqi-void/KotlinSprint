package org.example.app.lesson_12

class WeatherPrint (
    tempKelvinDay: Int,
    tempKelvinNight: Int,
    _hasPrecipitation: Boolean,
) {
    val dayTemp = tempKelvinDay - 273
    val nightTemp = tempKelvinNight - 273
    val hasPrecipitation = _hasPrecipitation

    init{
        println("Day temp: $dayTemp C")
        println("Night temp: $nightTemp C")
        println("Precipitation: $hasPrecipitation")
    }
}

fun main() {
    WeatherPrint(
        300,
        280,
        true,
    )
}
