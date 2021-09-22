package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeros: Int = ler.nextInt()

    val pares = ArrayList<Int>()
    val impares = ArrayList<Int>()

    for (i in 0 until numeros) {
        val numero: Int = ler.nextInt()
        if (numero % 2 == 0) pares.add(numero)
        else impares.add(numero)
    }

    pares.sorted().forEach { println(it) }
    impares.sortedDescending().forEach { println(it) }
}

/*
URI Online Judge | 1259
Pares e Ímpares
Por Neilor Tonin, URI  Brasil

Timelimit: 1
Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo o seguinte critério:

Primeiro os Pares
Depois os Ímpares
Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares em ordem decrescente.

Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N <= 105) Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas conterão, cada uma delas, um valor inteiro não negativo.

Saída
Apresente todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
10
4
32
34
543
3456
654
567
87
6789
98

4
32
34
98
654
3456
6789
567
543
87
 */