package org.example.app.lesson_13

class UserData(
    val name: String,
    val number: Long,
    val company: String?,
)

fun main() {
    val user1 = UserData(
        "Peter",
        79007777777L,
        company = null
    )
}