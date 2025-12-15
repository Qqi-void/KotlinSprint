package org.example.app.lesson_8

fun main() {
    val viewsPerDay = intArrayOf(120, 340, 560, 230, 410, 390, 500)
    var totalViews = 0

    for (views in viewsPerDay) {
        totalViews += views
    }

    println("Всего просмотров за неделю: $totalViews")
}