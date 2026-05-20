package org.example.app.lesson_13

class ContactV3(
    val name: String,
    val number: Long,
    val company: String? = null,
)

fun main() {
    println("Enter phone number: ")
    val inputPhone = readln()
    var parsedNumber: Long? = null

    try {
        parsedNumber = inputPhone.toLong()
        val user1 = ContactV3(name = "Steve", number = parsedNumber)
        println("Contact successfully created!")
    } catch (e: NumberFormatException) {
        println("Caught an error! Error name: $e")
    }
}