package org.example.app.lesson_6

const val SECOND_IN_MILLIS = 1000L

fun main() {
    print("Введите количество секунд: ")
    val totalSeconds = readln().toInt()

    var remainingSeconds = totalSeconds

    while (remainingSeconds > 0) {
        println("Осталось секунд: ${remainingSeconds--}")
        Thread.sleep(SECOND_IN_MILLIS)
    }

    println("Время вышло")
}
