package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val inicio = ler.nextLong()
    val fim = ler.nextLong()
//    time exceeded
//    var valorSomado = 0L
//    for (i in inicio..fim) {
//        valorSomado += i
//    }
    var valorSomado = (inicio + fim) * (fim - inicio + 1) / 2;

    println(valorSomado)
}

/*
URI Online Judge | 1805 | [P1]
Soma Natural
Por Caio Russi, UNOESTE BR Brazil

Timelimit: 1
Um número natural é um inteiro não-negativo (0, 1, 2, 3, 4, 5,...). A sua tarefa neste problema é calcular a soma dos números naturais que estão presentes em um determinado intervalo [A, B] inclusive.

Por exemplo, a soma dos números naturais no intervalo [2, 5] é 14 = (2+3+4+5).

Entrada
Cada caso de teste contém dois inteiros A e B (1 ≤ A ≤ B ≤ 109), representando o limite inferior e o superior respectivamente.

Saída
Para cada caso de teste, a saída consiste de uma linha contendo a soma dos números naturais do intervalo.

Exemplo de Entrada	Exemplo de Saída
Entrada
1 5
Saida
15

Entrada
1 1000
Saida
500500

Entrada
10 20
Saida
165
Contest Oficial de Aquecimento da Olimpíada Brasileira de Informática 2015
 */