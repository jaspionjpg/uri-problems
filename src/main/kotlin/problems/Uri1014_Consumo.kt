package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val km = ler.nextInt()
    var gasosa = ler.nextDouble()
    val consumo = km / gasosa
    println("%.3f km/l".format(consumo))
}
