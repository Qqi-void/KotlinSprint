package org.example.app.lesson_1

fun main() {
    val totalSeconds: Int = 6480

    val hours: Int = totalSeconds / 3600
    val minutes: Int = (totalSeconds % 3600) / 60
    val seconds: Int = totalSeconds % 60

    if (hours<10) print(0)
    print(hours)
    print(":")

    if (minutes<10) print(0)
    print(minutes)
    print(":")

    if (seconds<10) print(0)
    print(seconds)
}