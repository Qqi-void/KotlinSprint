package org.example.app.lessons_1_10.lesson_1

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {
    val totalSeconds: Int = 6480

    val hours: Int = totalSeconds / _root_ide_package_.org.example.app.lessons_1_10.lesson_1.SECONDS_IN_HOUR
    val minutes: Int = (totalSeconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val seconds: Int = totalSeconds % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}