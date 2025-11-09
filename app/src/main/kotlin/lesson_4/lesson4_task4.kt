package org.example.app.lesson_4

fun main() {
    val day = 5

    val isArmsDay = day % 2 != 0
    val isPressDay = day % 2 != 0
    val isLegsDay = day % 2 == 0
    val isBackDay = day % 2 == 0

    println("""
        Упражнения для рук:    $isArmsDay
        Упражнения для ног:    $isLegsDay
        Упражнения для спины:  $isBackDay
        Упражнения для пресса: $isPressDay
    """.trimIndent()
    )
}
