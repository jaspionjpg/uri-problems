package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val repeticoes = ler.nextLong()

    var raiz = 0.0
    for (i in repeticoes downTo 1) {
        raiz += 2
        raiz = 1 / raiz
    }
    raiz += 1

    println(String.format("%.10f", raiz))
}