package problems

import java.time.Month
import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeroMes = ler.nextInt()

    val mes = Month.values().first { month: Month -> month.value == numeroMes }

    println(mes.name.substring(0, 1) + mes.name.substring(1).toLowerCase())
}
