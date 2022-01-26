package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val map = mapOf(
        0 to "Dasher",
        1 to "Dancer",
        2 to "Prancer",
        3 to "Vixen",
        4 to "Comet",
        5 to "Cupid",
        6 to "Donner",
        7 to "Blitzen",
        8 to "Rudolph"
    )

    val vencedora = IntArray(9) { ler.nextInt() }.sum() - 1
    println(map[vencedora % 9])
}