package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val posicaoInicial = ler.next()
    val posicaoFinal = ler.next()

    val i1 = posicaoInicial[0]
    val j1 = posicaoInicial[1]

    val i2 = posicaoFinal[0]
    val j2 = posicaoFinal[1]

    val possiveisMovimentosCavalo =
        listOf(
            i1 - 1 to j1 - 2,
            i1 + 1 to j1 + 2,
            i1 + 1 to j1 - 2,
            i1 - 1 to j1 + 2,
            i1 - 2 to j1 - 1,
            i1 + 2 to j1 + 1,
            i1 + 2 to j1 - 1,
            i1 - 2 to j1 + 1
        )

    if (possiveisMovimentosCavalo.any { (i1, j1) -> i1 == i2 && j1 == j2 }) {
        println("VALIDO")
    } else {
        println("INVALIDO")
    }
}

/*
URI Online Judge | 2808
Mais Cavalos
Por Francisco Elio Parente Arcos Filho, UEA BR Brazil

Timelimit: 1
Dado a posição inicial de um cavalo em um tabuleiro de xadrez e a posição destino, deve se dizer se, com exatamente um único movimento, o cavalo consegue alcançar a posição destino. Se isso for possível, o movimento é classificado como válido, caso contrário, o movimento é dito inválido.



Em um tabuleiro de xadrez se utiliza números, de 1 a 8, para especificar a linha do tabuleiro e letras, de 'a' a 'h' para especificar a coluna.

Entrada
A entrada é composta por uma única linha contendo a posição inicial do cavalo e a posição destino, separadas por um espaço em branco. Uma posição no tabuleiro é especificada por um caractere, que representa a coluna, seguido de um número inteiro que representa a linha.

Saída
A saída consiste em uma linha contendo a mensagem "VALIDO" caso o movimento seja um movimento válido de um cavalo no jogo de xadrez ou "INVALIDO" caso contrário.

Exemplos de Entrada	Exemplos de Saída
d4 b5

VALIDO

a1 g6

INVALIDO

h8 f7

VALIDO

II Maratona de Programação do Norte
 */