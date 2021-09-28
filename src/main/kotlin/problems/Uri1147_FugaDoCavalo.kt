package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    var testes = 0
    while (true) {
        testes++
        val posicaoInicial = ler.next()
        if (posicaoInicial == "0")
            break

        val i1 = posicaoInicial[0]
        val j1 = posicaoInicial[1]
        var possiveisMovimentosCavalo =
            mutableListOf(
                i1 - 1 to j1 - 2,
                i1 + 1 to j1 + 2,
                i1 + 1 to j1 - 2,
                i1 - 1 to j1 + 2,
                i1 - 2 to j1 - 1,
                i1 + 2 to j1 + 1,
                i1 + 2 to j1 - 1,
                i1 - 2 to j1 + 1
            )

        for (i in 1..8) {
            val posicaoPeao = ler.next()
            val i2 = posicaoPeao[0]
            val j2 = posicaoPeao[1]

            possiveisMovimentosCavalo.remove(i2 - 1 to j2 - 1)
            possiveisMovimentosCavalo.remove(i2 - 1 to j2 + 1)
        }

        val movimentosValidos = possiveisMovimentosCavalo.count { (i, j) -> i in '1'..'8' && j in 'a'..'h' }
        println("Caso de Teste #$testes: $movimentosValidos movimento(s).")
    }
}

/*
URI Online Judge | 1147
Fuga do Cavalo
Por Gerson Groth  Brasil

Timelimit: 1
Seu amigo Pedro está aprendendo a jogar xadrez. Mas ele ainda não tem segurança de como pode movimentar o Cavalo. Desta forma, ele solicitou a você que desenvolvesse um programa que calcule, em apenas uma jogada, o número de distintos movimentos que o cavalo pode realizar, sem que o mesmo fique sobre o ataque de qualquer um dos 8 peões. Os movimentos do cavalo e dos peões são realizados conforme o jogo de xadrez tradicional, ou seja, o cavalo pode somente andar em “L”, e os peões atacar somente para frente em diagonal. Segue abaixo um exemplo:




Na imagem apresentada, das 8 distintas posições que o cavalo pode movimentar-se no tabuleiro, 2 delas estão sobre ataque (6b e 3e). Nas demais casas, o cavalo pode movimentar-se seguramente, conseguindo fugir do ataque de qualquer um dos peões. Note que na casa 2b já existe um peão, porém ainda é uma jogada válida, já que o cavalo pode movimentar-se nessa mesma casa e “matar” o peão.

Portanto, para o exemplo apresentado, o número de movimentos seguros para o cavalo realizar são 6. Vale lembrar que os peões pretos somente podem se movimentar de cima para baixo no tabuleiro, ou seja, da linha 7 até a linha 1, não sendo permitido o seu retorno.

Entrada
A entrada consiste de diversos casos de teste. Cada caso de teste consiste em 9 linhas de entrada. A primeira linha indica a posição inicial do cavalo. As demais 8 linhas, representam as respectivas posições dos peões.

O final da entrada consiste em uma única linha contendo somente o valor 0 (zero).

Saída
Para cada teste de caso de entrada, seu programa deve imprimir uma única linha, contendo a seguinte descrição:

Caso de Teste #Y: X movimento(s).

onde Y representa o número do respectivo caso de teste, e X representa a quantidade de movimentos possíveis ao cavalo realizar, em uma única rodada, sem que fique sobre ataque de um ou mais peões.

Exemplo de Entrada	Exemplo de Saída
4c
2b
2c
3d
4f
5d
7a
7d
7g
0

Caso de Teste #1: 6 movimento(s).
 */