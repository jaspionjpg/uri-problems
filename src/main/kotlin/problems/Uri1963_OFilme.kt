package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val n1 = ler.nextDouble()
    val n2 = ler.nextDouble()

    println("${String.format("%.2f", (n2 / n1 - 1) * 100)}%")
}