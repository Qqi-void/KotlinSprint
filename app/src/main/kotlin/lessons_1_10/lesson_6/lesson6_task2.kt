package org.example.app.lessons_1_10.lesson_6

const val MILLIS_IN_SECOND = 1000L

fun main() {
    print("Введите количество секунд: ")
    val seconds = readln().toInt()

    Thread.sleep(seconds * MILLIS_IN_SECOND)

    println("Прошло $seconds секунд")
}
