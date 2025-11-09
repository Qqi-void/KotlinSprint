package org.example.app.lesson_5

fun main() {
    val registeredUser = "Zaphod"
    val registeredPassword = "PanGalactic"

    print("Введите имя пользователя: ")
    val inputUser = readln()

    if (inputUser != registeredUser) {
        println("Пользователь не найден. Хотите зарегистрироваться? (процесс завершён)")
        return
    }

    print("Введите пароль: ")
    val inputPassword = readln()

    if (inputPassword == registeredPassword) {
        println("Пользователь \"$registeredUser\", вам разрешено входить на борт корабля \"Heart of Gold\".")
    } else {
        println("Неверный пароль.")
    }
}