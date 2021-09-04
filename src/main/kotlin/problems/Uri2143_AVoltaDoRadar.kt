package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var n: Int
    while (true) {
        n = ler.nextInt()
        if (n == 0)
            break
        for (i in 0 until n) {
            val j = ler.nextInt()
            if (j % 2 != 0) {
                println(j * 2 - 1)
            } else {
                println(j * 2 - 2)
            }
        }
    }
}