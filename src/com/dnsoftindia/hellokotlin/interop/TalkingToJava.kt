package com.dnsoftindia.hellokotlin.interop

import com.dnsoftindia.hellokotlin.classes.CustomerJava

/**
 * Created by Ganesha on 5/13/17.
 */

fun main(args: Array<String>) {

    val customer = CustomerJava()

    customer.id = 10
    customer.name = "A"
    customer.email = "a@b.com"

    customer.prettyPrint()
    customer.sometimesNull()
    customer.neverNull()

    val runnable = Runnable { println("invoking runnable") }

}

class PersonKotlin: PersonJava() {

}

class KotlinCustomerRepo: CustomerRepository {
    override fun getById(id: Int): CustomerJava? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): MutableList<CustomerJava>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}