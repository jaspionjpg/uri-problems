package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val numero = ler.nextInt()

    for (i in 1..numero / 2)
        if (numero % i == 0)
            println(i)

    println(numero)
}

/*
URI Online Judge | 1157
Divisores I
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Ler um número inteiro N e calcular todos os seus divisores.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Escreva todos os divisores positivos de N, um valor por linha.

Exemplo de Entrada	Exemplo de Saída
6

1
2
3
6

Agradecimentos a Cassio F.
 */