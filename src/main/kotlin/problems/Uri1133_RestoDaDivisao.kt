package problems

import java.util.Scanner
import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numero1 = ler.nextInt()
    val numero2 = ler.nextInt()

    for (numero in min(numero1, numero2) + 1 until max(numero1, numero2))
        if (numero % 5 in 2..3)
            println(numero)
}

/*
URI Online Judge | 1133
Resto da Divisão
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles cujo resto da divisão dele por 5 for igual a 2 ou igual a 3.

Entrada
O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não necessariamente em ordem crescente.

Saída
Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.

Sample Input	Sample Output
10
18

12
13
17
 */