package org.example.app.lessons_1_10.lesson_7

const val START = 0
const val STEP = 2

fun main() {

    print("Введите число: ")
    val end = readln().toInt()

    println("Чётные числа от $START до $end:")

    for (i in START..end step STEP) {
        println(i)
    }
}