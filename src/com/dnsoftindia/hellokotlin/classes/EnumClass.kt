package com.dnsoftindia.hellokotlin.classes

/**
 * Created by Ganesha on 5/11/17.
 */
enum class Priority(val value: Int) {
    MINOR(-1) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun toString(): String {
            return "Minor Priority"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    MAJOR(1) {
        override fun text(): String {
            return "Major priority text"
        }
    },
    CRITICAL(10) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    };

    abstract fun text(): String
}

fun main(args: Array<String>) {
    val priority = Priority.MINOR
    println(priority)
    println(priority.value)
    println(priority.ordinal)

    for(p in Priority.values()) {
        println(p)
    }

    println(Priority.valueOf("MAJOR"))
}