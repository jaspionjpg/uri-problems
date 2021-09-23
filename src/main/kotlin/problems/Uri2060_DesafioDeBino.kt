package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeros: Int = ler.nextInt()

    var multiplos2 = 0
    var multiplos3 = 0
    var multiplos4 = 0
    var multiplos5 = 0

    for (i in 0 until numeros) {

        val j: Int = ler.nextInt()
        if (j % 2 == 0)
            multiplos2++

        if (j % 3 == 0)
            multiplos3++

        if (j % 4 == 0)
            multiplos4++

        if (j % 5 == 0)
            multiplos5++
    }

    println("$multiplos2 Multiplo(s) de 2")
    println("$multiplos3 Multiplo(s) de 3")
    println("$multiplos4 Multiplo(s) de 4")
    println("$multiplos5 Multiplo(s) de 5")
}

/*
URI Online Judge | 2060
Desafio de Bino
Por Thalyson Nepomuceno, UECE BR Brasil

Timelimit: 1
Bino e Cino são colegas inseparáveis. Bino gosta de criar desafios matemáticos para Cino resolver. Desta vez, Bino gerou uma lista de números e perguntou ao Cino quantos números da lista são múltiplos de 2, 3, 4 e 5.

Esse desafio pode parecer simples, porém, quando a lista contém muitos números, Cino se confunde e acaba errando alguns cálculos. Para ajudar Cino, faça um programa para resolver o desafio de Bino.

Entrada
A primeira linha da entrada consiste em um inteiro N (1 ≤ N ≤1000), representando a quantidade de números na lista de Bino.

A segunda linha contém N inteiros Li (1 ≤ Li ≤ 100), representando os números da lista de Bino.

Saída
Imprima a quantidade de números múltiplos de 2, 3, 4 e 5 presentes na lista. Observe a formatação da saída nos exemplos, pois ela deve ser seguida rigorosamente.

Exemplo de Entrada	Exemplo de Saída
5
2 5 4 20 10

4 Multiplo(s) de 2
0 Multiplo(s) de 3
2 Multiplo(s) de 4
3 Multiplo(s) de 5

Aquecimento para a OBI 2016
 */