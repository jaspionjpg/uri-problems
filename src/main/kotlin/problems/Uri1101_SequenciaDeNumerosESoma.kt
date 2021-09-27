package problems

import java.util.Scanner
import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val numero1 = ler.nextInt()
        val numero2 = ler.nextInt()

        if (numero1 < 1 || numero2 < 1)
            break

        var stringueFinal = ""
        var soma = 0
        for (numero in min(numero1, numero2)..max(numero1, numero2)) {
            stringueFinal += "$numero "
            soma += numero
        }
        println(stringueFinal + "Sum=$soma")
    }
}

/*
URI Online Judge | 1101
Sequência de Números e Soma
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero). Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

Entrada
O arquivo de entrada contém um número não determinado de valores M e N. A última linha de entrada vai conter um número nulo ou negativo.

Saída
Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
5 2
6 3
5 0

2 3 4 5 Sum=14
3 4 5 6 Sum=18
 */