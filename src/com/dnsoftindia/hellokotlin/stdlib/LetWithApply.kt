package com.dnsoftindia.hellokotlin.stdlib

import java.io.File

/**
 * Created by Ganesha on 5/14/17.
 */


fun main(args: Array<String>) {
    val file = File("filename.txt")

//    if (file.isAbsolute) {
//        file.name
//    }

    with(file) {

    }

    val string: String? = "some value"

    string?.let {
        it.length
    }

}