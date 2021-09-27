package problems

import java.util.Scanner
import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numero1 = ler.nextInt()
    val numero2 = ler.nextInt()

    var soma = 0
    for (numero in min(numero1, numero2)..max(numero1, numero2))
        if (numero % 13 != 0)
            soma += numero
    println(soma)
}
/*
URI Online Judge | 1132
Múltiplos de 13
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.

Entrada
O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.

Saída
Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada, inclusive ambos se for o caso.

Sample Input	Sample Output
100
200

13954
Agradecimentos a Cássio F.
 */