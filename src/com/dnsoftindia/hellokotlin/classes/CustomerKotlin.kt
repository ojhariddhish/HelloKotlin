package com.dnsoftindia.hellokotlin.classes

import java.io.IOException

/**
 * Created by Ganesha on 5/11/17.
 */
data class CustomerKotlin(var id: Int, var name: String, var email: String, val phone: String?) {

    @JvmField val someProperty = "value"

    override fun toString(): String {
        return "{\"id\": \"$id\", \"name\": \"$name\"}"
    }

    @JvmOverloads fun changeStatus(status: Status = Status.Current) {
    }

    @JvmName("preferrential") fun makePreferred() {

    }

    @Throws(IOException::class) fun loadStatistics(filename: String) {
        if (filename == "") {
            throw IOException("Filename can't be blank");
        }
    }

}

fun CustomerKotlin.extension() {

}

enum class Status {
    Current,
    Past
}



fun main(args: Array<String>) {
    val customer = CustomerKotlin(1, "Riddhish", "ridd@hish.com", null)
    val customer2 = CustomerKotlin(1, "Riddhish", "ridd@hish.com", null)
    println(customer)
    if (customer == customer2) {
        println("They are same")
    }

    val customer3 = customer
    val customer4 = customer.copy(email = "a@b.com")

    println("" + customer3 + "\n" + customer4)
}