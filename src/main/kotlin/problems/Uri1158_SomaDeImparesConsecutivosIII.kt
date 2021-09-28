package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val testes = ler.nextInt()

    for (teste in 0 until testes) {
        val numero = ler.nextInt()
        val qt = ler.nextInt()

        var soma = 0
        for (num in numero until numero + 2 * qt) {
            if (num % 2 == 1 || num % 2 == -1)
                soma += num
        }
        println(soma)
    }
}
/*
URI Online Judge | 1158
Soma de Ímpares Consecutivos III
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de Y ímpares consecutivos a partir de X inclusive o próprio X se ele for ímpar. Por exemplo:
para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma dos consecutivos números ímpares a partir do valor X.

Exemplo de Entrada	Exemplo de Saída
2
4 3
11 2

21
24
 */