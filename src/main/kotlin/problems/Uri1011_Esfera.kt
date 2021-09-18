package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val valorUni1 = ler.nextDouble()
    val volume = 4 / 3.0 * 3.14159 * valorUni1 * valorUni1 * valorUni1
    println("VOLUME = %.3f".format(volume))
}
