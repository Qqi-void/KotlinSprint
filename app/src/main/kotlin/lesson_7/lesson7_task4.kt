package org.example.app.lesson_7

const val SECOND_IN_MILLIS = 1000L

fun main() {
    print("Введите количество секунд: ")
    val totalSeconds = readln().toInt()

    for (remaining in totalSeconds downTo 1) {
        println("Осталось секунд: $remaining")
        Thread.sleep(SECOND_IN_MILLIS)
    }

    println("Время вышло")
}