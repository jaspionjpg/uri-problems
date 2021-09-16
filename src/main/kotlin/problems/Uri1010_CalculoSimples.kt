package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val cod1 = ler.nextInt()
    val qtPecas1 = ler.nextInt()
    var valorUni1 = ler.nextDouble()

    val cod2 = ler.nextInt()
    val qtPecas2 = ler.nextInt()
    var valorUni2 = ler.nextDouble()

    val total = valorUni1 * qtPecas1 + valorUni2 * qtPecas2
    println("VALOR A PAGAR: R$ %.2f".format(total))
}
