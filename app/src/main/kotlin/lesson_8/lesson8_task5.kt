package org.example.app.lesson_8

fun main() {
    print("Введите количество ингредиентов: ")
    val count = readln().toInt()

    val ingredients = Array(count) { "" }

    for (i in ingredients.indices) {
        print("Введите ингредиент ${i + 1}: ")
        ingredients[i] = readln()
    }

    println("Ингредиенты: ${ingredients.joinToString(", ")}")
}
