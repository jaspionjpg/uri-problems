package problems

import java.util.Scanner
import kotlin.math.ln

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numero = ler.nextDouble()
    val menor = numero / ln(numero)
    val maior = 1.25506 * (numero / ln(numero))
    println("%.1f %.1f".format(menor, maior))
}

/*
URI Online Judge | 2159
Número Aproximado de Primos
Por M.C. Pinto, UNILA BR Brazil

Timelimit: 1
Schoenfeld e Rosser publicaram em 1962 um artigo descrevendo um valor mínimo e máximo para a quantidade de números primos até n, para n ≥ 17. Esta quantidade é representada pela função (n) e a fórmula é mostrada abaixo.



Sua tarefa é, dado um natural n, calcular o mínimo e máximo do intervalo para o número aproximado de primos até n.

Entrada
A entrada é um número natural n (17 ≤ n ≤ 109).

Saída
A saída são dois valores P e M com 1 casa decimal cada, tal que P < (n) < M, de acordo com a fórmula dada acima. Os valores devem ser separados por um espaço em branco.

Exemplos de Entrada	Exemplos de Saída
17

6.0 7.5

50

12.8 16.0

100

21.7 27.3

Prova 2 (D1) de Programação de Computadores 2016/1 da UNILA
 */