package com.dnsoftindia.hellokotlin.tidbits

/**
 * Created by Ganesha on 5/11/17.
 */

open class Person {

}

class Employee: Person() {
    fun vacationDays(days: Int) {
        if (days < 60) {
            println("You need more vacation")
        }
    }
}

class Contractor: Person() {

}

fun hasVacations(obj: Person) {
    if (obj is Employee) {
        obj.vacationDays(20)
    }
    else {

    }
}

var input: Any = 10

fun main(args: Array<String>) {

    val str = input as? String
    println(str?.length)

}