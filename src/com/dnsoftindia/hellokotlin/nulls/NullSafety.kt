package com.dnsoftindia.hellokotlin.nulls

import com.dnsoftindia.hellokotlin.classes.CustomerJava

/**
 * Created by Ganesha on 5/11/17.
 */
class Service {
    fun evaluate() {}
}

class ServiceProvider {
    fun createService(): Service? {
        return null
    }
}

fun main(args: Array<String>) {
    val message: String = "Message"

    val nullMessage: String? = null
    val inferredNull = null

    println(nullMessage?.length)

    val message2 = null

    val customerJava = CustomerJava()
    println(customerJava?.name?.length)

    val sp = ServiceProvider()
    sp.createService()?.evaluate()

}

