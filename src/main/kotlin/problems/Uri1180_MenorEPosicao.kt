package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeros = ler.nextInt()

    var menorNumero = Int.MAX_VALUE
    var menorIndice = 0
    for (i in 0 until numeros) {
        val numero = ler.nextInt()
        if (numero < menorNumero) {
            menorNumero = numero
            menorIndice = i
        }
    }
    println("Menor valor: $menorNumero")
    println("Posicao: $menorIndice")
}

/*
URI Online Judge | 1180
Menor e Posição
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Faça um programa que leia um valor N. Este N será o tamanho de um vetor X[N]. A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor e a sua posição dentro do vetor, mostrando esta informação.

Entrada
A primeira linha de entrada contem um único inteiro N (1 < N < 1000), indicando o número de elementos que deverão ser lidos em seguida para o vetor X[N] de inteiros. A segunda linha contém cada um dos N valores, separados por um espaço. Vale lembrar que nenhuma entrada haverá números repetidos.

Saída
A primeira linha apresenta a mensagem “Menor valor:” seguida de um espaço e do menor valor lido na entrada. A segunda linha apresenta a mensagem “Posicao:” seguido de um espaço e da posição do vetor na qual se encontra o menor valor lido, lembrando que o vetor inicia na posição zero.

Exemplo de Entrada	Exemplo de Saída
10
1 2 3 4 -5 6 7 8 9 10

Menor valor: -5
Posicao: 4
 */