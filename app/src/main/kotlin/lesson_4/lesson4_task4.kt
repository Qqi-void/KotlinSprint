package org.example.app.lesson_4

fun main() {
    val day = 5
    val isEven = day % 2 == 0

    val isArmsDay = !isEven
    val isPressDay = !isEven
    val isLegsDay = isEven
    val isBackDay = isEven

    println(
        """
        Упражнения для рук:    $isArmsDay
        Упражнения для ног:    $isLegsDay
        Упражнения для спины:  $isBackDay
        Упражнения для пресса: $isPressDay
    """.trimIndent()
    )
}
