package org.example.app.lesson_7

fun main() {
    val letters = ('a'..'z')
    val digits = ('0'..'9')

    var password = ""

    for (i in 1..3) {
        password += letters.random()
        password += digits.random()
    }

    println("Сгенерированный пароль: $password")
}