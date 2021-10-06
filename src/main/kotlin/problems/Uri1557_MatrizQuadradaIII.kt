package problems

import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val numero = ler.nextInt()
        if (numero == 0)
            break

        val matriz = Array(numero) { linha ->
            IntArray(numero) { coluna ->
                2.0.pow(linha + coluna).toInt()
            }
        }

        val maiorNumero = 2.0.pow((numero-1)+(numero-1)).toInt().toString().length

        val espacos = "%${maiorNumero}d"

        for (linha in 0 until numero)
            println(matriz[linha].joinToString(" ") { i: Int -> espacos.format(i) })
        println()
    }
}

/*
URI Online Judge | 1557
Matriz Quadrada III
Por Gabriel Dalalio, ITA BR Brazil

Timelimit: 1
Escreva um algoritmo que leia um inteiro N (0 ≤ N ≤ 15), correspondente a ordem de uma matriz M de inteiros, e construa a matriz de acordo com o exemplo abaixo.

Entrada
A entrada consiste de vários inteiros, um valor por linha, correspondentes as ordens das matrizes a serem construídas. O final da entrada é marcado por um valor de ordem igual a zero (0).

Saída
Para cada inteiro da entrada imprima a matriz correspondente, de acordo com o exemplo. Os valores das matrizes devem ser formatados em um campo de tamanho T justificados à direita e separados por espaço, onde T é igual ao número de dígitos do maior número da matriz. Após o último caractere de cada linha da matriz não deve haver espaços em branco. Após a impressão de cada matriz deve ser deixada uma linha em branco.

Exemplo de Entrada	Exemplo de Saída
1

2

3

4

5

0

1

1 2
2 4

 1  2  4
 2  4  8
 4  8 16

 1  2  4  8
 2  4  8 16
 4  8 16 32
 8 16 32 64

  1   2   4   8  16
  2   4   8  16  32
  4   8  16  32  64
  8  16  32  64 128
 16  32  64 128 256


Contest Dalalio 2014
 */