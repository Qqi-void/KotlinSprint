package org.example.app.lessons_1_10.lesson_9

fun main() {
    print("Введите 5 ингредиентов через запятую и пробел: ")
    val input = readln()

    val ingredients = input.split(", ")

    val sortedIngredients = ingredients.sorted()

    println("Отсортированные ингредиенты: $sortedIngredients")
}