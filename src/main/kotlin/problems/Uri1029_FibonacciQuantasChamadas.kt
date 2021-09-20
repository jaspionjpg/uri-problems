package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val n = ler.nextInt()
    for (i in 0 until n) {
        val x = ler.nextInt()
        val (recursoes, fibosDe1) = fib(x)
        println("fib(" + x + ") = " + (recursoes - 1) + " calls = " + fibosDe1)
    }
}

fun fib(n: Int): Pair<Int, Int> =
    when (n) {
        0 -> 1 to 0
        1 -> 1 to 1
        else -> {
            val (recursoes1, fibos1) = fib(n - 1)
            val (recursoes2, fibos2) = fib(n - 2)
            recursoes1 + recursoes2 + 1 to fibos1 + fibos2
        }
    }
