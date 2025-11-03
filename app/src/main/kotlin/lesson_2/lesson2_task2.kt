package org.example.app.lesson_2

fun main () {
    val employees = 50
    val interns = 30
    val salaryEmployee = 30_000
    val salaryIntern = 20_000

    val expensesEmployees = employees * salaryEmployee
    val totalExpenses = expensesEmployees + interns * salaryIntern
    val averageSalary = totalExpenses / (employees + interns)

    println(expensesEmployees)
    println(totalExpenses)
    println(averageSalary)
}