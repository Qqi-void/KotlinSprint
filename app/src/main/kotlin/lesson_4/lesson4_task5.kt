package org.example.app.lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val RECOMMENDED_CREW = 70
const val MIN_PROVISIONS = 50


fun main() {
    print("Есть ли повреждения корпуса (true/false)? ")
    val hasDamage = readln().toBoolean()

    print("Текущий состав экипажа: ")
    val crew = readln().toInt()

    print("Количество ящиков с провизией: ")
    val provisions = readln().toInt()

    print("Благоприятная ли погода (true/false)? ")
    val goodWeather = readln().toBoolean()

    val canSail = (
            (!hasDamage && crew in MIN_CREW..MAX_CREW && provisions > MIN_PROVISIONS) ||
                    (hasDamage && crew == RECOMMENDED_CREW && goodWeather && provisions >= MIN_PROVISIONS)
            )
    println("Корабль может отправиться в плавание: $canSail")
}