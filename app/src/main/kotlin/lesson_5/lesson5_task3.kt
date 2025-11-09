package org.example.app.lesson_5

fun main() {
    val minNumber = 0
    val maxNumber = 42
    val winningNumber1 = 17
    val winningNumber2 = 40

    print("Введите первое число (от $minNumber до $maxNumber): ")
    val userNumber1 = readln().toInt()

    print("Введите второе число (от $minNumber до $maxNumber): ")
    val userNumber2 = readln().toInt()

    val resultText = when {
        (userNumber1 == winningNumber1 && userNumber2 == winningNumber2) ||
                (userNumber1 == winningNumber2 && userNumber2 == winningNumber1) -> "Поздравляем! Вы выиграли главный приз!"

        (userNumber1 == winningNumber1 || userNumber1 == winningNumber2 ||
                userNumber2 == winningNumber1 || userNumber2 == winningNumber2) -> "Вы выиграли утешительный приз!"

        else -> "Неудача!"
    }

    println(resultText)
    println("Правильные числа были: $winningNumber1 и $winningNumber2")
}