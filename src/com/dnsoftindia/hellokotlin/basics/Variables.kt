package com.dnsoftindia.hellokotlin.basics

/**
 * Created by Ganesha on 5/10/17.
 */

fun main(args: Array<String>) {
    var streetNumber: Int = 10
    var streetName: String = "Notting Hill" // no need to specify types

    println("StreetNumber: "+streetNumber)
    println("Street: "+streetName)
    val zip = "400101"

    streetName = "Nottingham Hill"
    println(streetName)

    val myLong = 10L
    val myFloat = 100.11F
    val myHex = 0x0F
    val myBinary = 0xb01

    val myInt = 100
    val myLongAgain: Long = myInt.toLong()
    println("Long: "+myLong)
    println("Float: "+myFloat)
    println("Hex: "+myHex)
    println("Binary: "+myBinary)
    println("Int: "+myInt)
    println("LongAgain: "+myLongAgain)

    // String

    val myChar = 'R'
    val myString = "Hello World"
    val escapeChars = "A new line \n"
    val rawString = "Hello " +
            " Second line " +
            " A third line"

    val multipleLines = """
            This is a multiple
            line string
            with more than
            3 lines
        """

    println("Char: "+myChar)
    println("String: "+myString)
    println("Escape: "+escapeChars)
    println("RawString: "+rawString)
    println("MultipleLinesString: "+multipleLines)

    val years = 10
    val message = "A decade is $years years"

    val name = "Krishna"
    val anotherMessage = "Length of name is ${name.length}."

    println("Message: "+message)
    println("AnotherMessage: "+anotherMessage)


}