package com.dnsoftindia.hellokotlin.inheritance

/**
 * Created by Ganesha on 5/11/17.
 */

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

fun main(args: Array<String>) {
    val customerRepo = GenericRepository<Customer>()


}