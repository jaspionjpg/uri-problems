package problems

import java.util.Scanner;

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNext()) {
        val n: Int = ler.nextInt()
        val j: Int = ler.nextInt()
        println(n * j * 2)
    }
}

/*
URI Online Judge | 1197
Volta à Faculdade de Física
Por Shahriar Manzoor  Bangladesh

Timelimit: 1
Uma partícula tem velocidade inicial e aceleração constante. Se a sua velocidade após certo momento é v então qual será seu deslocamento no dobro deste tempo?

Entrada
A entrada contém vários casos de teste. Cada linha da entrada é um caso de teste e contém dois inteiros v (-100 ≤ v ≤ 100) e t (0 ≤ t ≤ 200) ( t significa o momento no qual a partícula ganha aquela velocidade). O final da entrada é determinado por EOF.

Saída
Para cada linha de entrada imprima um único inteiro que denota o deslocamento no dobro do tempo fornecido.

Exemplo de Entrada	Exemplo de Saída
0 0
5 12

0
120

Agradecimentos a Rezaul Alam Chowdhury
 */