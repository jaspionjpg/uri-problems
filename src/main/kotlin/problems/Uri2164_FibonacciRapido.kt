package problems

import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numero = ler.nextDouble()
    val positivo = ((1 + sqrt(5.0)) / 2).pow(numero)
    val menor = ((1 - sqrt(5.0)) / 2).pow(numero)
    val valor = (positivo - menor) / sqrt(5.0)

    println("%.1f".format(valor))
}

/*
URI Online Judge | 2164
Fibonacci Rápido
Por M.C. Pinto, UNILA BR Brazil

Timelimit: 1
A fórmula de Binet é uma forma de calcular números de Fibonacci.



Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a fórmula acima.

Entrada
A entrada é um número natural n (0 < n ≤ 50).

Saída
A saída é o valor de Fibonacci(n) com 1 casa decimal utilizando a fórmula de Binet dada.

Exemplos de Entrada	Exemplos de Saída
1

1.0

2

1.0

3

2.0

Prova 2 (D2) de Programação de Computadores 2016/1 da UNILA
 */