package com.dnsoftindia.hellokotlin.functional

/**
 * Created by Ganesha on 5/11/17.
 */

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun operation(x: Int, op: (Int) -> Unit) {

}

fun route(path: String, vararg actions: (String, String) -> String) {

}

fun unaryOperation(x: Int, op: (Int) -> Int) {

}

fun unaryOp(op: (Int) -> Int) {

}

fun sum(x: Int, y: Int) = x + y

fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    }
    finally {
        db.commit()
    }
}

class Database {
    fun commit() {}
}

fun main(args: Array<String>) {
    println(operation(1, 2, ::sum))

    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    println(operation(4, 7, sumLambda))

    println(unaryOperation(3, { x -> x * x }))
    println(unaryOperation(9, { it * it }))

    println(unaryOperation(5) { it * it })

    unaryOp { it * it }


    val db = Database()

    transaction(db) {

    }

    unaryOperation(5, fun(x: Int): Int { return x * x })

}