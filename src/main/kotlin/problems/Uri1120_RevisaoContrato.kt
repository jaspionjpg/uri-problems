package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (true) {
        val digitoErrado = ler.next()
        var numero = ler.next()
        if (digitoErrado == "0" || numero == "0")
            break

        numero = numero.replace(digitoErrado, "")

        if (numero.isEmpty())
            println(0)
        else println(numero.toBigInteger())
    }
}