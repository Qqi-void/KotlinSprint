package org.example.app.lesson_6

fun main() {
    print("Создайте логин: ")
    val createdLogin = readln()

    print("Создайте пароль: ")
    val createdPassword = readln()

    println("\nАккаунт создан! Теперь войдите в приложение.\n")

    var inputLogin: String
    var inputPassword: String

    do {
        print("Введите логин: ")
        inputLogin = readln()

        print("Введите пароль: ")
        inputPassword = readln()

        if (inputLogin != createdLogin || inputPassword != createdPassword) {
            println("Неверный логин или пароль, попробуйте снова.\n")
        }
    } while (inputLogin != createdLogin || inputPassword != createdPassword)

    println("Авторизация прошла успешно")
}