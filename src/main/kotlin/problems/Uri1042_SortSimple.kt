package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val list = listOf(ler.nextInt(), ler.nextInt(), ler.nextInt())

    for (i in list.sorted()) {
        println(i)
    }
    println()
    for (i in list) {
        println(i)
    }
}

/*
URI Online Judge | 1042
Sort Simples
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.

Exemplo de Entrada	Exemplo de Saída
7 21 -14

-14
7
21

7
21
-14

-14 21 7

-14
7
21

-14
21
7
 */