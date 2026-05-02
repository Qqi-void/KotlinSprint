package org.example.app.lesson_7

fun main() {
    val lower = ('a'..'z')
    val upper = ('A'..'Z')
    val digits = ('0'..'9')
    val allChars = lower + upper + digits
    var length: Int

    do {
        print("Введите длину пароля (не меньше 6): ")
        length = readln().toIntOrNull() ?: 0
        if (length < 6) {
            println("Длина пароля должна быть не меньше 6. Попробуйте снова.")
        }
    } while (length < 6)

    val password =
        (listOf(lower.random(), upper.random(), digits.random()) + List(length - 3) { allChars.random() })
            .shuffled()
            .joinToString("")

    println("Сгенерированный пароль: $password")
}