package org.example.app.lessons_1_10.lesson_10

fun main() {
    print("Введите логин: ")
    val login = readln()

    print("Введите пароль: ")
    val password = readln()

    if (isValid(login) && isValid(password)) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun isValid(text: String): Boolean {
    return text.length >= 4
}