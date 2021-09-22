package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val n: Int = ler.nextInt()
    for (i in 0 until n) {
        val j: Int = ler.nextInt()
        val x: Int = ler.nextInt()
        val resultado1 = (3 * j * (3 * j) + x * x).toDouble()
        val resultado2 = (2 * (j * j) + 5 * x * (5 * x)).toDouble()
        val resultado3 = (-100 * j + x * x * x).toDouble()
        if (resultado1 > resultado2 && resultado1 > resultado3) {
            println("Rafael ganhou")
        } else if (resultado2 > resultado1 && resultado2 > resultado3) {
            println("Beto ganhou")
        } else {
            println("Carlos ganhou")
        }
    }
}