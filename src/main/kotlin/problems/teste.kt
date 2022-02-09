package problems

import java.util.*

fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val cosi = CharArray(4) { input.nextInt().toChar() }.joinToString("")
    println(cosi)
}