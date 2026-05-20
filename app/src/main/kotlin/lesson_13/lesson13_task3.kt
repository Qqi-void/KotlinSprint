package org.example.app.lesson_13

class Contact(
    val name: String,
    val number: Long,
    val company: String? = null,
)

fun main() {
    val contacts = listOf(
        Contact("Peter", 89007777777L),
        Contact("Jone", 89002223344L, "null"),
        Contact("Jake", 89002223344L, "Cat"),
        Contact("Robert", 89003334455L),
        Contact("Viliam", 89003334456L,"Mp3"),
    )
    val companies = contacts.mapNotNull { it.company }
    println("companies: $companies")
}