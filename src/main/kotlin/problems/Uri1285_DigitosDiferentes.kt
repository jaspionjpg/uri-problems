package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (ler.hasNextInt()) {
        val numero1 = ler.nextInt()
        val numero2 = ler.nextInt()

        var numeroCasas = 0
        for (numero in numero1..numero2) {
            val existeMaisDeUmNumero = numero.toString().groupBy { c -> c }.any { grupo -> grupo.value.size > 1 }

            if (!existeMaisDeUmNumero)
                numeroCasas++
        }
        println(numeroCasas)
    }
}

/*
URI Online Judge | 1285
Dígitos Diferentes
Por Ines Kereki, ORT  Uruguai

Timelimit: 1
Os habitantes de Nlogônia são muito supersticiosos. Uma de suas crenças é que os números das casas de rua que têm um dígito repetido traz sorte ruim para os moradores. Portanto, eles nunca iriam viver em uma casa que tem o número 838 ou 1004, por exemplo.

A rainha de Nlogônia ordenou a construção de uma nova avenida à beira-mar e quer atribuir para as novas casas apenas números sem dígitos repetidos, para evitar desconforto entre os seus súditos. Você foi nomeado por Sua Majestade para escrever um programa que, dado dois inteiros N e M, determine a quantidade máxima possível de casas que podem assumir um número entre N e M inclusive, sem que ocorram dígitos repetidos nestes números.

Entrada
Cada teste é descrito usando uma linha. A linha contém dois inteiros N e M, conforme descrito acima (1 ≤ N ≤ M ≤ 5000).

Saída
Para cada caso de teste imprima um valor inteiro que representa a quantidade máxima possível de números de casa entre N e M inclusive, sem dígitos repetidos.

Exemplo de Entrada	Exemplo de Saída
87 104
989 1022
22 25
1234 1234

14
0
3
1

ACM/ICPC South America Contest 2012.
 */