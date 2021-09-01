package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val frase = "LIFE IS NOT A PROBLEM TO BE SOLVED"
    val numero = ler.nextInt()

    for (i in 0 until numero) {
        print(frase.elementAt(i))
    }
    println()
}
