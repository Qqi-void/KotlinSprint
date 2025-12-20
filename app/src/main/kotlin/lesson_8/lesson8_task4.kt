package org.example.app.lesson_8

fun main() {
    val ingredients = arrayOf("potatoes", "peas", "cucumbers", "chicken", "onion", "eggs")

    println("Текущий список ингредиентов:")
    for (i in ingredients) {
        println("Ингредиент ${ingredients.indexOf(i) + 1}: $i")
    }

    print("Введите ингредиент, который хотите заменить: ")
    val oldIngredient = readln()

    val index = ingredients.indexOf(oldIngredient)

    if (index == -1) {
        println("Такого ингредиента в рецепте нет")
        return
    }

    print("Введите новый ингредиент: ")
    val newIngredient = readln()

    ingredients[index] = newIngredient

    println("Готово! Вы сохранили следующий список:")
    for (i in ingredients) {
        println("Ингредиент ${ingredients.indexOf(i) + 1}: $i")
    }
}
