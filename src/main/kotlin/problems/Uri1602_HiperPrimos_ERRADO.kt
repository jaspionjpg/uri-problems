package problems

import java.util.Scanner
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNextInt()) {
        val numeros = ler.nextInt()
        var hiperCoisos = 0
        for (numeroEntre in 2..numeros) {
            var divisiveis = 1

            val valorMaximoDivisivel = numeroEntre / 2
            if (valorMaximoDivisivel > 2)
                for (n in 1..valorMaximoDivisivel)
                    if (numeroEntre % n == 0)
                        divisiveis++

            if (isPrimo(divisiveis))
                hiperCoisos++
        }
        println(hiperCoisos)
    }
}

/*

2: 1
3: 1
4: 1
5: 1
6: 3
7: 1
8: 3
9: 2
10: 3

2: 1
3: 1
4: 1
5: 1
6: 4
7: 2
8: 4
9: 3
10: 4
 */

private fun isPrimo(number: Int): Boolean {
    for (n in 2..sqrt(number.toDouble()).toInt()) {
        if (number % n == 0)
            return false
    }
    return true
}

/*
URI Online Judge | 1602
Hiperprimos
Por Marcio T. I. Oshiro Brasil

Timelimit: 1
Várias descobertas matemáticas da idade média são devidas a matemáticos árabes famosos como al-Khwarizmı 1, Omar Khayyám, e Sharaf al-Dın al-Tusı entre outros. Um dos resultados pouco conhecido é sobre os números hiperprimos. Dizemos que um número é hiperprimo se ele tiver um número primo de divisores. Assim, por exemplo, 25 é hiperprimo, pois tem 3 divisores. Já 42 não é hiperprimo, pois tem 8 divisores.

Dado um inteiro N, determine o número de hiperprimos no intervalo [2, N].

Entrada
A entrada é composta por diversas instâncias e termina com final de arquivo (EOF).

Cada instância consiste de uma única linha contendo um único inteiro, N (2 ≤ N ≤ 2 × 106).

Saída
Para cada instância, imprima uma linha com a quantidade de hiperprimos no intervalo [2, N].

Exemplo de Entrada	Exemplo de Saída
2
4

1
3

Ele começou a multiplicar os quintos pelos sextos...
Preliminar Maratona (Seletiva IME-USP)
 */