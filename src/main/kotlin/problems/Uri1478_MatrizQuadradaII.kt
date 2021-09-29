package problems

import java.util.Scanner
import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val numero = ler.nextInt()
        if (numero == 0)
            break

        val matriz = Array(numero) { linha ->
            IntArray(numero) { coluna ->
                (linha - coluna).absoluteValue + 1
            }
        }

        for (linha in 0 until numero)
            println(matriz[linha].joinToString(" ") { i: Int -> "%3d".format(i) })
        println()
    }
}

/*
URI Online Judge | 1478
Matriz Quadrada II
Por Josué Pereira de Castro, Unioeste  Brasil
Timelimit: 1
Escreva um algoritmo que leia um inteiro N (0 ≤ N ≤ 100), correspondente a ordem de uma matriz M de inteiros, e construa a matriz de acordo com o exemplo abaixo.

Entrada
A entrada consiste de vários inteiros, um valor por linha, correspondentes as ordens das matrizes a serem construídas. O final da entrada é marcado por um valor de ordem igual a zero (0).

Saída
Para cada inteiro da entrada imprima a matriz correspondente, de acordo com o exemplo. (os valores das matrizes devem ser formatados em um campo de tamanho 3 justificados à direita e separados por espaço. Após o último caractere de cada linha da matriz não deve haver espaços em branco. Após a impressão de cada matriz deve ser deixada uma linha em branco.

Exemplo de Entrada	Exemplo de Saída
1
2
3
4
5
0

  1

  1   2
  2   1

  1   2   3
  2   1   2
  3   2   1

  1   2   3   4
  2   1   2   3
  3   2   1   2
  4   3   2   1

  1   2   3   4   5
  2   1   2   3   4
  3   2   1   2   3
  4   3   2   1   2
  5   4   3   2   1
 */