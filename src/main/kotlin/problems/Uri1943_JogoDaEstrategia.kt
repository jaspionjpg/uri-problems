package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val numeroJogadores = ler.nextInt()
    val rodadas = ler.nextInt()

    val pontos = IntArray(numeroJogadores)
    for (rodada in 0 until rodadas)
        for (jogador in 0 until numeroJogadores)
            pontos[jogador] += ler.nextInt()

    val maximoPontos = pontos.maxOrNull()
    println(pontos.indexOfLast { it == maximoPontos } + 1)
}

/*
URI Online Judge | 1940
Jogo da Estratégia
Por Vinícius Fernandes dos Santos, Centro Federal de Educação Tecnológica de Minas Gerais BR Brazil

Timelimit: 1
Um jogo de estratégia, com J jogadores, é jogado em volta de uma mesa. O primeiro a jogar é o jogador 1, o segundo a jogar é o jogador 2 e assim por diante. Uma vez completada uma rodada, novamente o jogador 1 faz sua jogada e a ordem dos jogadores se repete novamente. A cada jogada, um jogador garante uma certa quantidade de Pontos de Vitória. A pontuação de cada jogador consiste na soma dos Pontos de Vitória de cada uma das suas jogadas.

Dado o número de jogadores, o número de rodadas e uma lista representando os Pontos de Vitória na ordem em que foram obtidos, você deve determinar qual é o jogador vencedor. Caso mais de um jogador obtenha a pontuação máxima, o jogador com pontuação máxima que tiver jogado por último é o vencedor.

Entrada
A entrada consiste de duas linhas. A primeira linha contém dois inteiros J e R, o número de jogadores e de rodadas respectivamente (1 ≤ J, R ≤ 500). A segunda linha contém J × R inteiros, correspondentes aos Pontos de Vitória em cada uma das jogadas feitas, na ordem em que aconteceram. Os Pontos de Vitória obtidos em cada jogada serão sempre inteiros entre 0 e 100, inclusive.

Saída
Seu programa deve produzir uma única linha, contendo o inteiro correspondente ao jogador vencedor.

Exemplos de Entrada	Exemplos de Saída
3 3

1 1 1 1 2 2 2 3 3

3

2 3

0 0 1 0 2 0

1

XX Maratona de Programação da SBC 2015
 */
