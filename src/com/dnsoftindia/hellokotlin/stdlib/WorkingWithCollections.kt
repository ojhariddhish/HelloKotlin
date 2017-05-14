package com.dnsoftindia.hellokotlin.stdlib

import java.util.*

/**
 * Created by Ganesha on 5/14/17.
 */


fun main(args: Array<String>) {

    var list: List<String> = ArrayList()
    val numbers = 1..100
    val cities = listOf("Dehi", "Mumbai", "Vadodara")

    val empty = emptyList<String>()
    println(cities.javaClass)
    println(empty.javaClass)

    val arrayList = Arrays.asList("Dehi", "Mumbai", "Vadodara")
    println(arrayList.javaClass)

    val mutableCities = mutableListOf("Mumbai", "Surat", "Ahmedabad")
    mutableCities.add("Gandhinagar")

    val hashMap = hashMapOf(Pair("1", "Delhi"), Pair("2", "Rajkot"))


}