package org.example.app.lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelMinutes = 457
    val minutesInHour = 60

    val totalMinutes = departureHour * minutesInHour + departureMinute + travelMinutes
    val arrivalHour = totalMinutes / minutesInHour
    val arrivalMinute = totalMinutes % minutesInHour

    println("%02d:%02d".format(arrivalHour, arrivalMinute))
}