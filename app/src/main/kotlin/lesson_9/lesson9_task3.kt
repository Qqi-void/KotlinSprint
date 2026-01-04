package org.example.app.lesson_9

fun main() {
    val ingredientsForOnePortion = listOf(2, 50, 15)

    print("Введите количество порций: ")
    val portions = readln().toInt()

    val eggs = ingredientsForOnePortion[0] * portions
    val milk = ingredientsForOnePortion[1] * portions
    val butter = ingredientsForOnePortion[2] * portions

    println("На $portions порций вам понадобится: яиц – $eggs шт, молока – $milk мл, сливочного масла – $butter г")
}