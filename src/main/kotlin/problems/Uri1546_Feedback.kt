package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val mapinha: MutableMap<Int, String> = HashMap()
    mapinha[1] = "Rolien"
    mapinha[2] = "Naej"
    mapinha[3] = "Elehcim"
    mapinha[4] = "Odranoel"
    val n: Int = ler.nextInt()
    for (i in 0 until n) {
        val j: Int = ler.nextInt()
        for (l in 0 until j) {
            val m: Int = ler.nextInt()
            println(mapinha[m])
        }
    }
}