package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeros = ler.nextLine().trim()
    val numerosOrdenados = numeros.split(" ").map { it -> it.toInt() }
        .sortedDescending()
    println(numerosOrdenados[0])
}