package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNextInt()) {
        val numero1 = ler.nextInt()
        val numero2 = ler.nextInt()
        if (numero1 == 0 && numero2 == 0)
            break

        val valorSemZero = (numero1 + numero2).toString().replace("0", "")
        println(valorSemZero)
    }
}

/*
URI Online Judge | 1871
Zero vale Zero
Por Ricardo Martins, IFSULDEMINAS BR Brazil

Timelimit: 1
Um dia o Prof. Humberto José Roberto fez o seguinte questionamento: Se o zero a esquerda de um número não tem valor algum, por que teria em outras posições de um número? Analisando da seguinte forma, ele pede sua ajuda para, ao somar dois valores inteiros, que o resultado seja exibido segundo o raciocínio dele, ou seja, sem os Zeros. Por exemplo, ao somar 15 + 5, o resultado seria 20, mas com esta nova ideia, o novo resultado seria 2, e, ao somar 99 + 6, o resultado seria 105, mas com esta nova ideia, o novo resultado seria 15.

Escreva um programa que, dado dois números inteiros, sem o algarismo zero, some os mesmos e, caso o resultado tenha algum algarismo zero, que os retire antes de exibir.

Entrada
Haverá diversos casos de teste. Cada caso de teste inicia com dois inteiros M e N (1 ≤ M ≤ N ≤ 999.999.999).

O último caso de teste é indicado quando N = M = 0, sendo que este caso não deve ser processado.

Saída
Para cada caso de teste, imprima o resultado da soma dos dois valores, sem os Zeros.

Exemplo de Entrada	Exemplo de Saída
7 8

15 5

99 6

0 0

15

2

15

V Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2015
 */