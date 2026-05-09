package org.example.app.lessons_1_10.lesson_9

fun main() {
    val ingredients = listOf("potatoes", "peas", "cucumbers", "chicken", "onion", "eggs")

    println("В рецепте есть следующие ингредиенты: $ingredients")

    ingredients.forEach { println(it) }
}
