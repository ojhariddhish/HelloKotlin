@file:JvmName("UtilityClass")
package com.dnsoftindia.hellokotlin.interop

/**
 * Created by Ganesha on 5/14/17.
 */

const val copyrightYear = 2017

fun prefix(prefix: String, value: String): String {
    return "$prefix: $value"
}