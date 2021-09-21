package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val testes = ler.nextInt()
    for (teste in 1..testes) {

        val numero1 = ler.nextInt()
        val numero2 = ler.nextInt()

        val maior: Int
        val menor: Int
        if (numero1 < numero2) {
            maior = numero1 + 1
            menor = numero2
        } else {
            maior = numero2 + 1
            menor = numero1
        }

        var resultado = 0
        for (i in maior until menor) {
            if (i % 2 != 0) {
                resultado += i
            }
        }
        println(resultado)
    }
}

/*

URI Online Judge | 1099
Soma de Ímpares Consecutivos II
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma de todos valores ímpares entre X e Y.

Exemplo de Entrada	Exemplo de Saída
7
4 5
13 10
6 4
3 3
3 5
3 4
3 8

0
11
5
0
0
0
12

 */