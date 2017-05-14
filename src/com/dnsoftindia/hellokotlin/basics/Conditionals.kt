package com.dnsoftindia.hellokotlin.basics

/**
 * Created by Ganesha on 5/10/17.
 */

fun main(args: Array<String>) {
    var myString = "Not Empty"

    val result = if (myString != "") {
        println("Not empty")
        "20"
    }
    else if (myString.startsWith("a")) {
        println("Is empty")
        "Values"
    }
    else {
        println("something")
        40
    }

    println("result : "+result)

    val whenValue = when (result) {
        is String -> println("Excellent")
        "Value" -> {
            println("Its a value")
            println("another case block")
        }
        else -> println("default block")
    }


    println(whenValue)
}