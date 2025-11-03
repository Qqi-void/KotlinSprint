package org.example.app.lesson_1

const val secondsInHour = 3600
const val secondsInMinute = 60

fun main() {
    val totalSeconds: Int = 6480

    val hours: Int = totalSeconds / secondsInHour
    val minutes: Int = (totalSeconds % secondsInHour) / secondsInMinute
    val seconds: Int = totalSeconds % secondsInMinute

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}