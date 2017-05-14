package com.dnsoftindia.hellokotlin.classes

/**
 * Created by Ganesha on 5/11/17.
 */

object Global {
    val PI = 3.14
}

fun main(args: Array<String>) {

    val localObject = object {
        val PI = 3.14159
    }

    println(localObject.PI)
    println(Global.PI)
}