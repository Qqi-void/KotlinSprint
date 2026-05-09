package org.example.app.lesson_11

class User (
    val id: Int,
    var login: String,
    var password: String,
    val email: String,
)

fun main() {
    val user1 = User(
        id = 1,
        login = "barashek",
        password = "12345!",
        email = "baran@gmal.com",
    )

    val user2 = User(
        id = 2,
        login = "koteyka",
        password = "11hdfv!",
        email = "kiti@gmal.com",
    )

    println("id: ${user1.id}")
    println("login: ${user1.login}")
    println("password: ${user1.password}")
    println("email: ${user1.email}")

    println("id: ${user2.id}")
    println("login: ${user2.login}")
    println("password: ${user2.password}")
    println("email: ${user2.email}")
}
