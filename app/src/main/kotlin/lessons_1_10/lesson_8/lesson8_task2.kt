package org.example.app.lessons_1_10.lesson_8

fun main() {
    val ingredients = arrayOf("potatoes", "peas", "cucumbers", "chicken", "onion", "eggs")

    println("Введите ингредиент для поиска:")
    val input = readln()

    var found = false

    for (ingredient in ingredients) {
        if (ingredient == input) {
            found = true
            break
        }
    }
    if (found) {
        println("Ингредиент $input в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}