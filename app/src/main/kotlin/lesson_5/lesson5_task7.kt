package org.example.app.lesson_5

const val ONE_HUNDRED = 100.0

fun main() {

    print("Введите расстояние поездки (км): ")
    val distance = readln().toDouble()

    print("Введите расход топлива на 100 км (л): ")
    val fuelPer100km = readln().toDouble()

    print("Введите цену за литр топлива: ")
    val pricePerLiter = readln().toDouble()

    val fuelNeeded = (distance * fuelPer100km) / ONE_HUNDRED
    val tripCost = fuelNeeded * pricePerLiter

    println("Необходимое топливо: ${"%.2f".format(fuelNeeded)} л")
    println("Стоимость поездки: ${"%.2f".format(tripCost)}")
}