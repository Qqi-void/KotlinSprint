package org.example.app.lesson_12

class WeatherDay(
    val dayTemp: Int,
    val nightTemp: Int,
    val hasPrecipitation: Boolean,
) {

    fun printWeather() {
        println("Day temp: $dayTemp C")
        println("Night temp: $nightTemp C")
        println("Precipitation: $hasPrecipitation")
    }
}

fun main() {
    val today = WeatherDay(
        dayTemp = 15,
        nightTemp = 4,
        hasPrecipitation = true,
    )

    today.printWeather()
}