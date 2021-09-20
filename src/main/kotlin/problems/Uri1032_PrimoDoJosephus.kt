package problems

import java.util.Scanner
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (true) {
        val quantidadePessoas = ler.nextInt()
        if (quantidadePessoas == 0)
            break

        val pessoas = ArrayList<Int>()
        for (indiceInicialPessoa in 1..quantidadePessoas) {
            pessoas.add(indiceInicialPessoa)
        }

        var primoAtual = 2
        var contador = primoAtual - 1
        while (pessoas.size != 1) {
            while (contador >= pessoas.size) {
                contador -= pessoas.size
            }

            pessoas.removeAt(contador)
            primoAtual = pegarProximoNumeroPrimo(primoAtual)
            contador += primoAtual - 1
        }

        println(pessoas[0])
    }
}

private fun pegarProximoNumeroPrimo(numeroInicial: Int): Int {
    var novoNumero = numeroInicial + 1
    while (true) {
        if (isPrimo(novoNumero))
            return novoNumero
        novoNumero++
    }
    return 1
}

private fun isPrimo(number: Int): Boolean {
    for (n in 2..sqrt(number.toDouble()).toInt()) {
        if (number % n == 0)
            return false
    }
    return true
}