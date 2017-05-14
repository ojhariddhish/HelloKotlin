package com.dnsoftindia.hellokotlin.functional

/**
 * Created by Ganesha on 5/13/17.
 */

fun String.hello() {
    println("It's me")
}

fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") { it.capitalize() }
}

fun main(args: Array<String>) {
    "Hello".hello()
    println("this is a sample string to Title case it.".toTitleCase())

    val instance: BaseClass = InheritedClass()
    instance.extension()
}

open class BaseClass
class InheritedClass: BaseClass()

fun BaseClass.extension() {
    println("Base Extension")
}

fun InheritedClass.extension() {
    println("InheritedClass Extension")
}