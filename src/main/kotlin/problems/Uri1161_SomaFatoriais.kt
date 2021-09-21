package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNextInt()) {
        var n1 = ler.nextLong()
        var n2 = ler.nextLong()
        var total: Long = 1
        var total2: Long = 1
        while (n1 > 0) {
            total2 *= n1
            n1--
        }
        while (n2 > 0) {
            total *= n2
            n2--
        }
        println(total + total2)
    }
}

/*
URI Online Judge | 1161
Soma de Fatoriais
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia dois valores inteiros M e N indefinidamente. A cada leitura, calcule e escreva a soma dos fatoriais de cada um dos valores lidos. Utilize uma variável apropriada, pois cálculo pode resultar em um valor com mais de 15 dígitos.

Entrada
O arquivo de entrada contém vários casos de teste. Cada caso contém dois números inteiros M (0 ≤ M ≤ 20) e N (0 ≤ N ≤ 20). O fim da entrada é determinado por eof.

Saída
Para cada caso de teste de entrada, seu programa deve imprimir uma única linha, contendo um número que é a soma de ambos os fatoriais (de M e N).

Exemplo de Entrada	Exemplo de Saída
4 4
0 0
0 2

48
2
3
 */