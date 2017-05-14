package com.dnsoftindia.hellokotlin.inheritance

/**
 * Created by Ganesha on 5/11/17.
 */

abstract class StoredEntity {
    val isActive = true
    abstract fun store()
    fun status(): String {
        return isActive as String
    }
}

class Employee: StoredEntity() {
    override fun store() {

    }

}

fun main(args: Array<String>) {
    val se = Employee()
    se.isActive
    se.status()
}