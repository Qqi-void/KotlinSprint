package org.example.app.lesson_3

fun main() {
     val input = "D2-D4;0"

    val parts = input.split("-", ";")

    val from = parts[0]
    val to = parts[1]
    val moveNumber = parts[2]

    println("From: $from")
    println("To: $to")
    println("Move number: $moveNumber")
}