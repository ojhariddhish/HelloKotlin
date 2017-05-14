package com.dnsoftindia.hellokotlin.tidbits

/**
 * Created by Ganesha on 5/11/17.
 */

fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 23000000)
}

fun countryInformation(country: String): Triple<String, Long, String> {
    return Triple("Washington D. C.", 550000000, "North America")
}

fun main(args: Array<String>) {
    val result = capitalAndPopulation("Madrid")
    println(result.first)
    println(result.second)

    val countryInfo = countryInformation("USA")
    println(countryInfo.first)
    println(countryInfo.second)
    println(countryInfo.third)

    val (capital, population) = capitalAndPopulation("Madrid")
    println(capital)
    println(population)

    val listOfCapitalAndCountries = listOf(Pair("Madrid", "Spain"), "Paris" to "France")
    for ((capital, country) in listOfCapitalAndCountries) {
        println("$capital $country")
    }
}