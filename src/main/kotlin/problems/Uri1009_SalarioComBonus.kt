package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val nome = ler.next()
    var salario = ler.nextDouble()
    var vendas = ler.nextDouble()
    val total = salario + (vendas * 0.15)
    println("TOTAL = R$ %.2f".format(total))
}
