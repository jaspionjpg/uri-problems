package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (true) {
        val valorCompra = ler.nextInt()
        val valorPago = ler.nextInt()
        if (valorCompra == 0 && valorPago == 0)
            break

        var troco = valorPago - valorCompra

        val notas = listOf(100, 50, 20, 10, 5, 2)
        var notasUsadas = 0

        for (nota in notas)
            while (troco >= nota) {
                notasUsadas++
                troco -= nota
            }

        if (notasUsadas != 2) println("impossible")
        else println("possible")
    }
}

/*
URI Online Judge | 2140
Duas Notas
Por Joao Marcos Salvanini Bellini de Moraes, IFSULDEMINAS BR Brazil

Timelimit: 1
Gilberto é um famoso vendedor de esfirras na região. Porém, apesar de todos gostarem de suas esfirras, ele só sabe dar o troco com duas notas, ou seja, nem sempre é possível receber o troco certo. Para facilitar a vida de Gil, escreva um programa para ele que determine se é possível ou não devolver o troco exato utilizando duas notas.

As notas disponíveis são: 2, 5, 10, 20, 50 e 100.

Entrada
A entrada deve conter o valor inteiro N da compra realizada pelo cliente e, em seguida, o valor inteiro M pago pelo cliente (N < M ≤ 104). A entrada termina com N = M = 0.

Saída
Seu programa deverá imprimir "possible" se for possível devolver o troco exato ou "impossible" se não for possível.

Exemplo de Entrada	Exemplo de Saída
11 23
500 650
100 600
9948 9963
1 2
2 4
0 0

possible
possible
impossible
possible
impossible
impossible

Aquecimento para a VI Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2016
 */