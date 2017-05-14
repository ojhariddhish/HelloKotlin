package com.dnsoftindia.hellokotlin.functions

/**
 * Created by Ganesha on 5/11/17.
 */

fun hello(): Unit {
    println("Hello!")
}

fun throwingException(): Nothing {
    throw Exception("This function throws an exception")
}

fun returnsAFour(): Int {
    return 4
}

fun takingString(name: String) {
    println(name)
}

fun sum(x: Int, y: Int, z: Int = 0): Int {
    return x + y + z
}

fun multiply(a: Int, b: Int): Int = a * b

fun printDetails(name: String, email: String = "", phone: String) {
    println("name: $name --- email: $email --- phone: $phone")
}

fun printStrings(vararg strings: String) {
    reallyPrintStrings(*strings)
}

private fun reallyPrintStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main(args: Array<String>) {
    hello()
    takingString("Riddhish")
    println(sum(3, 5))
    println(multiply(5, 10))
    printDetails("Tom", phone = "123243433")

    printStrings("1")
    printStrings("10", "20")
    printStrings("100", "200", "300")
}