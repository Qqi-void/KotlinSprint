package org.example.app.lesson_2

import kotlin.math.pow

fun main() {
    val startAmount = 70_000
    val annualInterestPercent = 16.7
    val years = 20

    val percentDivider = 100
    val one = 1

    val annualInterestRate = annualInterestPercent / percentDivider
    val finalAmount = startAmount * (one + annualInterestRate).pow(years.toDouble())

    println("%.3f".format(finalAmount))
}