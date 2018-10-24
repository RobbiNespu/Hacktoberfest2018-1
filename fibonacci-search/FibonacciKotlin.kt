package io.github.robbinespu.hacktoberfest2018.fibonacci

import kotlin.coroutines.experimental.*

fun main(args: Array<String>) {
    val fib = buildSequence {
        var a: Int = 0
        var b: Int = 1
        yield(1)
        while (true) {
            yield(a + b)
            val temp: Int = a + b
            a = b
            b = temp
        }
    }
    val str: String = fib.take(25).joinToString(" ")
    println(str)
}
