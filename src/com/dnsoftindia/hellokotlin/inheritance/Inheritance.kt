package com.dnsoftindia.hellokotlin.inheritance

/**
 * Created by Ganesha on 5/11/17.
 */

open class Person {
    open fun validate() {

    }

}

open class Customer: Person {
    override fun validate() {

    }

    constructor(): super() {

    }
}

class SpecialCustomer: Customer() {
    override fun validate() {
        super.validate()
    }
}

fun main(args: Array<String>) {
    val customer = Customer()
    customer.validate()
}