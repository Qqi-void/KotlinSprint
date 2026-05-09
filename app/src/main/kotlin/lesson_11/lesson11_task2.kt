package org.example.app.lesson_11

class User2 (
    val id: Int,
    var login: String,
    var password: String,
    val email: String,
    var bio: String?,
) {
    fun printUserInfo() {
        println("User Info")
        println("id: $id")
        println("login: $login")
        println("password: $password")
        println("email: $email")
        println("bio: $bio")
    }

    fun addBio(newText: String) {
        bio = newText
    }

    fun changePassword(
        oldPass: String,
        newPass: String
    ): Boolean {
        if (oldPass == password) {
            password = newPass
            return true
        }
        return false
    }
}

fun main() {
    val itIsMe = User2(
        id = 1,
        login = "barashek",
        password = "12345!",
        email = "baran@gmal.com",
        bio = null,
    )

    print("Describe yourself: ")
    val input = readln()
    itIsMe.addBio(input)

    print("Old password: ")
    val old = readln()
    print("New password: ")
    val new = readln()

    val success = itIsMe.changePassword(old, new)
    if (success) {
        println("Success: Password changed!")
    } else {
        println("Error: Wrong current password!")
    }

    itIsMe.printUserInfo()
}
