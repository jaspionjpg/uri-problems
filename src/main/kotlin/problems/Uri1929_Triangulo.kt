package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val graveto1 = ler.nextInt()
    val graveto2 = ler.nextInt()
    val graveto3 = ler.nextInt()
    val graveto4 = ler.nextInt()
    val lista = listOf(graveto1, graveto2, graveto3, graveto4).sorted()

    if (isPossible(lista[0], lista[1], lista[2]) ||
        isPossible(lista[0], lista[1], lista[3]) ||
        isPossible(lista[0], lista[2], lista[3]) ||
        isPossible(lista[1], lista[2], lista[3])
    ) {
        println("S")
    } else {
        println("N")
    }

}

private fun isPossible(gravetoA: Int, gravetoB: Int, maiorIgual: Int): Boolean =
    gravetoA + gravetoB > maiorIgual
