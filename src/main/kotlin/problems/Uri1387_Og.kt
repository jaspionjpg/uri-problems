package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (true) {
        val filhos = ler.nextInt()
        val filhas = ler.nextInt()
        if (filhos == 0 && filhas == 0)
            break
        println(filhos + filhas)
    }
}

/*
URI Online Judge | 1387
Og
Por Fábio Dias Moreira, PUC-Rio  Brasil
Timelimit: 1
Og é um homem das cavernas com vários filhos e filhas, e ele quer contar todos eles. Og conta seus filhos com sua mão esquerda e suas filhas com sua mão direita.

Entretanto, Og não é inteligente, e não sabe somar os dois números. Assim, ele pediu para você escrever um programa que realize a soma.

Entrada
A entrada contém vários casos de teste. Cada caso de teste consiste em uma linha contendo dois inteiros L e R, separados por um espaço, indicando o número de filhos e de filhas, respectivamente (1 ≤ L, R ≤ 5).

O fim do arquivo de entrada é indicado por L = R = 0.

Saída
Para cada caso de teste, imprima uma linha contendo um inteiro indicando quantos filhos e filhas Og tem ao todo.

Exemplo de Entrada	Exemplo de Saída
2 2
2 3
5 5
1 1
0 0

4
5
10
2

ACM/ICPC South America Contest 2007.
 */