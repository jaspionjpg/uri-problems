package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeroDeTestes = ler.nextInt()

    var numeroAnterior = ler.nextInt()
    var subindoAnterior: Boolean? = null
    var padraoCerto = true
    for (i in 2..numeroDeTestes) {
        val numero = ler.nextInt()
        if (padraoCerto) {
            val subindo = numero > numeroAnterior
            if (subindo == subindoAnterior || numeroAnterior == numero) {
                padraoCerto = false
            }
            numeroAnterior = numero
            subindoAnterior = subindo
        }
    }
    println(if (padraoCerto) 1 else 0)
}