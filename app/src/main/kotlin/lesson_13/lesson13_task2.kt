package org.example.app.lesson_13

class DataUser(
    val name: String,
    val number: Long,
    val company: String? = null,
) {
    fun printDataUser() {
        println("Name: $name, \nPhone number: $number, \nCompany: ${company ?: "<not specified>"}")
    }
}

fun main() {
    val user1 = DataUser(
        "Peter",
        79007777777L,
    )
    user1.printDataUser()
}