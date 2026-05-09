package org.example.app.lessons_1_10.lesson_6

fun main() {
    print("Создайте логин: ")
    val createdLogin = readln()

    print("Создайте пароль: ")
    val createdPassword = readln()

    println("\nАккаунт создан! Теперь войдите в приложение.\n")

    var inputLogin: String
    var inputPassword: String
    var isAuthorized: Boolean

    do {
        print("Введите логин: ")
        inputLogin = readln()

        print("Введите пароль: ")
        inputPassword = readln()

        isAuthorized = inputLogin == createdLogin && inputPassword == createdPassword

        if (!isAuthorized) {
            println("Неверный логин или пароль, попробуйте снова.\n")
        }
    } while (!isAuthorized)

    println("Авторизация прошла успешно")
}