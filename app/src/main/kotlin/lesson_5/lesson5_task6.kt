package org.example.app.lesson_5

const val CM_IN_METER = 100
const val UNDERWEIGHT_MAX = 18.5
const val NORMAL_MAX = 25.0
const val OVERWEIGHT_MAX = 30.0

fun main() {
    print("Введите ваш вес (в кг): ")
    val weight = readln().toDouble()

    print("Введите ваш рост (в см): ")
    val heightCm = readln().toDouble()

    val heightM = heightCm / CM_IN_METER

    val bodyMassIndex = weight / (heightM * heightM)

    val category = when {
        bodyMassIndex < UNDERWEIGHT_MAX -> "Недостаточная масса тела"
        bodyMassIndex < NORMAL_MAX -> "Нормальная масса тела"
        bodyMassIndex < OVERWEIGHT_MAX -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ: %.2f, категория: %s".format(bodyMassIndex, category))
}
