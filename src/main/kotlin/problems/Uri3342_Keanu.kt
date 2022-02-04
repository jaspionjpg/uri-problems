package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val tamanhoTabuleiro = ler.nextInt()

    val totalTabuleiro = tamanhoTabuleiro * tamanhoTabuleiro
    val pretas = totalTabuleiro / 2
    var brancas = if (totalTabuleiro % 2 == 0) pretas else pretas + 1

    println("$brancas casas brancas e $pretas casas pretas")
}

/*
beecrowd | 3342
Keanu
Por Eliton Machado, UDESC BR Brazil

Timelimit: 1
Keanu estava testando novos modelos de tabuleiros de xadrez quanto teve a seguinte duvida:

Quantas casas brancas e quantas casas pretas tem um tabuleiro de xadrez de tamanho nxn?


Tabuleiro 3x3:



5 casas brancas e 4 casas pretas

Tabuleiro 4x4:



8 casas brancas e 8 casas pretas

Observe que a casa mais acima e mais à esquerda é sempre branca.

Entrada
O input consiste de uma linha com um único inteiro n.

2
≤
 n
≤
 100

Saída
Imprima "a casas brancas e b casas pretas" sem aspas, sendo a a quantidade de casas brancas e b a quantidade de casas pretas.

Exemplos de Entrada	Exemplos de Saída
3
5 casas brancas e 4 casas pretas
4
8 casas brancas e 8 casas pretas
Maratona BRUTE Codecon JetBrains 2021
 */