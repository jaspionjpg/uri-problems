package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    var numero = ler.nextInt()
    for (i in 0 until 10) {
        println("N[$i] = $numero")
        numero += numero
    }
}
