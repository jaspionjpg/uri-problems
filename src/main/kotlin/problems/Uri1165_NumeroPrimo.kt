package problems

import java.util.Scanner
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()
    for (i in 0 until testes) {
        val numero = ler.nextInt()
        if (isPrimo(numero))
            println("$numero eh primo")
        else println("$numero nao eh primo")
    }
}

private fun isPrimo(number: Int): Boolean {
    for (n in 2..sqrt(number.toDouble()).toInt()) {
        if (number % n == 0)
            return false
    }
    return true
}

/*
URI Online Judge | 1165
Número Primo
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Na matemática, um Número Primo é aquele que pode ser dividido somente por 1 (um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido apenas pelo número 1 e pelo número 7.

Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 100), indicando o número de casos de teste da entrada. Cada uma das N linhas seguintes contém um valor inteiro X (1 < X ≤ 107), que pode ser ou não, um número primo.

Saída
Para cada caso de teste de entrada, imprima a mensagem “X eh primo” ou “X nao eh primo”, de acordo com a especificação fornecida.

Exemplo de Entrada	Exemplo de Saída
3
8
51
7

8 nao eh primo
51 nao eh primo
7 eh primo
 */