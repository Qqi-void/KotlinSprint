package org.example.app.lesson_9

fun main() {
    val ingredients = mutableListOf("egg", "tomato", "rice")

    println("В рецепте есть базовые ингредиенты: $ingredients")

    print("Желаете добавить еще? ")
    val answer = readln()

    if (answer.equals("да", ignoreCase = true)) {
        print("Какой ингредиент вы хотите добавить? ")
        val newIngredient = readln()
        ingredients.add(newIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
    }
}

