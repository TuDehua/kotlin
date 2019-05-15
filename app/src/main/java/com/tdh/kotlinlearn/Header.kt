package com.tdh.kotlinlearn

/**
 * Author: tudehua
 * E-mail:tdh@erongdu.com
 * Date: 2019/5/14 15:23
 * Descripiton:
 * Link:{@link}
 */
fun createName(length: Int): String {
    val builder = StringBuilder()
    val charRange = CharRange('A', 'Z')
    for (i in 1..length) {
        val letter = charRange.random()
        builder.append(letter)
    }
    return builder.toString()
}

fun main(args: Array<String>) {
    println(createName(10))
    println(createName(10))
    println(createName(10))
}