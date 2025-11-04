package org.example.app.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelMinutes = 457

    val totalMinutes = departureHour * MINUTES_IN_HOUR + departureMinute + travelMinutes
    val arrivalHour = totalMinutes / MINUTES_IN_HOUR
    val arrivalMinute = totalMinutes % MINUTES_IN_HOUR

    println("%02d:%02d".format(arrivalHour, arrivalMinute))
}