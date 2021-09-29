package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val num1 = ler.nextInt()
        val num2 = ler.nextInt()
        if (num2 + num1 == 0)
            break
        println(num1 - (num2 - num1))
    }
}

/*
URI Online Judge | 1379
Problema com Mediana e Média
Por Pablo Heiber  Argentina
Timelimit: 1
A média de três inteiros A, B e C é (A + B + C)/3. A mediana de três números inteiros seria então aquela que estaria no meio, se forem ordenados em ordem não decrescente. Dados dois números inteiros A e B, retornar o mínimo inteiro possível C, tal que a média e a mediana de A, B e C, sejam iguais.

Entrada
Cada caso de teste é dado em uma única linha que contém dois inteiros A e B (1 ≤ A ≤ B ≤ 109). O último caso de teste é seguido por uma linha contendo dois zeros.

Saída
Para cada caso de teste, imprima uma linha que contenha o mínimo inteiro possível C, de forma que a média e a mediana de A, B e C sejam iguais.

Exemplo de Entrada	Exemplo de Saída
1 2
6 10
1 1000000000
0 0

0
2
-999999998

ACM/ICPC South America Contest 2010.
 */