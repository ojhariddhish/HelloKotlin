package com.dnsoftindia.hellokotlin.stdlib

/**
 * Created by Ganesha on 5/14/17.
 */

fun main(args: Array<String>) {
    val elements = 1..100

    val output = elements.asSequence().filter { it < 30 }.map { Pair("Yes", it) }

    output.forEach {
        println(it)
    }

    val output2 = elements.asSequence().take(30).sum()
    println(output2)

    val numbers = generateSequence(1) { x -> x + 10 }

    println(numbers.take(30).sum())

    val lazyInit: Int by lazy { 10 }

}