package com.dnsoftindia.hellokotlin.tidbits

import java.io.BufferedReader
import java.io.FileReader

/**
 * Created by Ganesha on 5/11/17.
 */
class NotANumberException(message: String) : Throwable(message) {
}

fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("This is not a number")
    }
}

fun main(args: Array<String>) {

    try {
        checkIsNumber("A")
    }
    catch (e: IllegalArgumentException) {
        println("Do nothing")
    }
    catch (e: NotANumberException) {
        println("${e.message}")
    }

    //throw NotANumberException()

    val buffer = BufferedReader(FileReader("input.txt"))
    val result = try {
        val chars = CharArray(30)
        buffer.read(chars, 0, 40)
    }
    catch (e: IndexOutOfBoundsException) {
        println("Exception handled")
    }
    finally {
        println("Closing...")
        buffer.close()
    }

    println(result)

}