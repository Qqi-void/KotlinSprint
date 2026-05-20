package org.example.app.lesson_13

class ContactV2(
    val name: String,
    val number: Long,
    val company: String? = null,
) {
    fun printDataUser() {
        println("Name: $name, \nPhone number: $number, \nCompany: ${company ?: "<not specified>"}")
    }
}

fun main() {
    val phoneBook = mutableListOf<ContactV2>()

    repeat(2) {
        println("Enter name: ")
        val inputName = readln()

        println("Enter phone number: ")
        val inputPhone = readln()
        val parsedNumber: Long? = inputPhone.toLongOrNull()
        if (parsedNumber == null) {
            println("Error! Incorrect phone number entered!")
        } else {
            println("Enter company: ")
            val inputCompany = readln()
            val finalCompany = inputCompany.ifBlank { null }

            val newContact = ContactV2(inputName, parsedNumber, finalCompany)
            phoneBook.add(newContact)
        }
    }
    for (contact in phoneBook) {
        contact.printDataUser()
    }
}