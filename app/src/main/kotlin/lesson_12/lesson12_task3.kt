package org.example.app.lesson_12

class WeatherInCelsius(
    tempKelvinDay: Int,
    tempKelvinNight: Int,
    _hasPrecipitation: Boolean,
) {
    val dayTemp = tempKelvinDay - 273
    val nightTemp = tempKelvinNight - 273
    val hasPrecipitation = _hasPrecipitation

    fun printWeather() {
        println("Day temp: $dayTemp C")
        println("Night temp: $nightTemp C")
        println("Precipitation: $hasPrecipitation")
    }
}

fun main() {
    val today = WeatherInCelsius(
        tempKelvinDay = 300,
        tempKelvinNight = 280,
        _hasPrecipitation = true,
    )

    today.printWeather()
}