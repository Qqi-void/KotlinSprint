package org.example.app.lesson_12

class WeatherData {
    var dayTemp = 0
    var nightTemp = 0
    var hasPrecipitation = false

    fun printWeather() {
        println("Day temp: $dayTemp C")
        println("Night temp: $nightTemp C")
        println("Precipitation: $hasPrecipitation")
    }
}

fun main() {
    val day1 = WeatherData()
    val day2 = WeatherData()

    day1.dayTemp = 15
    day2.hasPrecipitation = true

    day1.printWeather()
    day2.printWeather()
}