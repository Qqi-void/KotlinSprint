package org.example.app.lesson_10

private const val STORED_LOGIN = "admin"
private const val STORED_PASSWORD = "1234"

fun main() {
    print("Введите логин: ")
    val login = readln()

    print("Введите пароль: ")
    val password = readln()

    val token = authorize(login, password)
    val cart = getCart(token)

    if (cart != null) {
        println("Содержимое корзины: $cart")
    } else {
        println("Авторизация не удалась")
    }
}

fun authorize(login: String, password: String): String? =
    if (login == STORED_LOGIN && password == STORED_PASSWORD) generateToken()
    else null

fun generateToken(): String {
    val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..32).map { chars.random() }.joinToString("")
}

fun getCart(token: String?): List<String>? =
    if (token?.length == 32) listOf("Apple", "Banana", "Milk")
    else null