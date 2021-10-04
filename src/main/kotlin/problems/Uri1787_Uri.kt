package problems

import java.util.Scanner
import kotlin.math.ln
import kotlin.math.log2
import kotlin.math.max
import kotlin.math.pow
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val pessoas = mapOf(0 to "Uilton", 1 to "Rita", 2 to "Ingred")

    while (true) {
        val rodadas = ler.nextInt()
        if (rodadas == 0)
            break

        val totalPontos = IntArray(3)

        for (i in 1..rodadas) {
            val pontosRodada = Array(3) {
                val value = ler.nextDouble()
                val éMultiplo = multiploDe2(value)
                if (éMultiplo)
                    totalPontos[it]++
                value to éMultiplo
            }

            val maior = max(max(pontosRodada[0].first, pontosRodada[1].first), pontosRodada[2].first)
            val indiceMaior = pontosRodada.indexOfFirst { pair -> pair.second && pair!!.first == maior }

            if (indiceMaior >= 0)
                totalPontos[indiceMaior]++
        }
        val maiorPontos = max(max(totalPontos[0], totalPontos[1]), totalPontos[2])

        if (totalPontos.count { it == maiorPontos } > 1)
            println("URI")
        else println(pessoas[totalPontos.indexOfFirst { it == maiorPontos }])
    }
}

private fun multiploDe2(number: Double): Boolean {
    val log: Double = log2(number)
    val pow: Double = 2.0.pow(log.roundToInt().toDouble())
    return pow == number
}

private fun multiploDe23(numero: Double): Boolean =
    if (numero == 2.0) true
    else if (numero % 2 == 0.0) multiploDe2(numero / 2)
    else false

/*
URI Online Judge | 1787
URI
Por Jadson José Monteiro Oliveira, Faculdade de Balsas BR Brazil

Timelimit: 1
Uilton, Rita e Ingred criaram um novo jogo para decidir quem não pagará sua parte da pizza do próximo final de semana e deram o nome de "URI" para o jogo (talvez eles decidiram unir as iniciais de seus nomes para formar o nome do jogo). O URI consiste de N rodadas, a cada rodada, cada um dos três jogadores falam um número, não é permitido números iguais em uma rodada. Se o número que o jogador falar for uma potência de 2, o mesmo ganha 1 ponto, e se além de ser uma potência de 2, for o maior número da rodada, o jogador ganha mais 1 ponto, se o número não for potência de 2 o jogador não ganha nenhum ponto. Sua tarefa é criar um programa que os ajude a contabilizar a pontuação e informar o vencedor, dado a quantidade de rodadas, e os números de cada rodada.

Considere que as 4 primeiras potências de 2 são: 2, 4, 8, 16.

Entrada
A entrada contém vários casos de teste. A primeira linha de entrada contém um único inteiro N indicando o número de rodadas (1 ≤ 10⁵), cada uma das N linhas seguintes contem 3 números inteiros Ui, Ri, Ii (1 < Ui, Ri, Ii ≤ 10⁹), representando respectivamente o número de Uilton, Rita e Ingred na i-ésima rodada. O final da entrada é indicado quando N = 0.

Saída
Para cada caso de teste imprima uma única linha contendo o nome do jogador que tenha a maior quantidade de pontos. Caso haja empate no primeiro lugar, imprima o nome do jogo "URI" (sem aspas).

Exemplo de Entrada	Exemplo de Saída
2

2 4 3

2 4 6

2

2 4 6

3 2 16

6

2048 26 7986

2 45 63

69 13 281

4 8 2

6 987 4

39894 7337 1354

0

Rita
URI
Uilton
 */