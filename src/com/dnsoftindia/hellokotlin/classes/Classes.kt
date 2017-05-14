package com.dnsoftindia.hellokotlin.classes

import java.util.*

/**
 * Created by Ganesha on 5/11/17.
 */

class Customer(var id: Int, var name: String, val yearOfBirth: Int) {

    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""
        set(value) {
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Social security should start with SN")
            }
            field = value
        }

    fun customerAsString(): String {
        return "id: $id --- Name: $name"
    }


//    init {
//        name = name.toUpperCase()
//    }

//    constructor(email: String): this(0, "") {
//
//    }
}


fun main(args: Array<String>) {
    val customer = Customer(10, "Riddhish", 1985)

    customer.socialSecurityNumber = "1232321"

    println(customer.name)
    println(customer.age)
    println(customer.socialSecurityNumber)
    println(customer.customerAsString())

}