package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNextInt()) {
        val senha: Int = ler.nextInt()
        println(senha - 1)
    }
}