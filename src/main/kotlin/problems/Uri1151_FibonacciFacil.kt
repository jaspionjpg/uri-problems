package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val numero = ler.nextInt()

    if (numero == 1)
        println("0")
    else if (numero == 2) {
        println("0 1")
        return
    }

    val lista = ArrayList<Int>()
    lista.add(0)
    lista.add(1)
    for (i in 2 until numero)
        lista.add(lista[i - 1] + lista[i - 2])
    println(lista.joinToString(" "))
}
/*
URI Online Judge | 1151
Fibonacci Fácil
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 46).

Saída
Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve haver espaço após o último valor.

Exemplo de Entrada	Exemplo de Saída
5

0 1 1 2 3

Agradecimentos a Cássio F.
 */