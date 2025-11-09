package org.example.app.lesson_4

fun main() {
    val minCrew = 55
    val maxCrew = 70
    val recommendedCrew = 70
    val minProvisions = 50

    print("Есть ли повреждения корпуса (true/false)? ")
    val hasDamage = readln().toBoolean()

    print("Текущий состав экипажа: ")
    val crew = readln().toInt()

    print("Количество ящиков с провизией: ")
    val provisions = readln().toInt()

    print("Благоприятная ли погода (true/false)? ")
    val goodWeather = readln().toBoolean()

    val canSail = (
        (!hasDamage && crew in minCrew..maxCrew && provisions > minProvisions) ||
        (hasDamage && crew == recommendedCrew && goodWeather && provisions >= minProvisions)
    )

    println("Корабль может отправиться в плавание: $canSail")
}