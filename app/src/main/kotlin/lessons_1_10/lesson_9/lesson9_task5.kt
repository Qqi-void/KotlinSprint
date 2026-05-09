package org.example.app.lessons_1_10.lesson_9

fun main() {
    val ingredientsSet = mutableSetOf<String>()

    repeat(5) {
        print("Введите ингредиент ${it + 1}: ")
        ingredientsSet.add(readln().trim().lowercase())
    }

    val sortedIngredients = ingredientsSet.sorted().toMutableList()

    if (sortedIngredients.isNotEmpty()) {
        sortedIngredients[0] = sortedIngredients[0].replaceFirstChar { it.uppercase() }
    }

    println(sortedIngredients.joinToString(", "))
}