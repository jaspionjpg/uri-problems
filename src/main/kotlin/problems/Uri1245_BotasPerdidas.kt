package problems

import java.util.Scanner
import kotlin.math.min

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNext()) {

        val numeroDeSapatos = ler.nextInt()
        val calcados = HashMap<Int, Par>()

        for (i in 0 until numeroDeSapatos) {
            val tamanho = ler.nextInt()
            val qualPé = ler.next()

            val parAtual = calcados[tamanho] ?: Par(0, 0)
            parAtual.add(qualPé)
            calcados[tamanho] = parAtual
        }

        val somaPares = calcados.values.map { par -> min(par.direitos, par.esquerdos) }.toIntArray().sum()

        println(somaPares)
    }
}

internal class Par(var direitos: Int, var esquerdos: Int) {
    fun add(pe: String) =
        if (pe == "D") direitos++
        else esquerdos++
}

/*
URI Online Judge | 1245
Botas Perdidas
Maratona de Programação da SBC Brasil

Timelimit: 1
A divisão de Suprimentos de Botas e Calçados do Exército comprou um grande número de pares de botas de vários tamanhos para seus soldados. No entanto, por uma falha de empacotamento da fábrica contratada, nem todas as caixas entregues continham um par de botas correto, com duas botas do mesmo tamanho, uma para cada pé. O sargento mandou que os recrutas retirassem todas as botas de todas as caixas para reembalá-las, desta vez corretamente.

Quando o sargento descobriu que você sabia programar, ele solicitou com a gentileza habitual que você escrevesse um programa que, dada a lista contendo a descrição de cada bota entregue, determina quantos pares corretos de botas poderão ser formados no total.

Entrada
A entrada é composta por diversos casos de teste e termina com final de arquivo (EOF). A primeira linha de um caso de teste contém um inteiro N (2 ≤ N ≤ 10 4), N é par, indicando o número de botas individuais entregues. Cada uma das N linhas seguintes descreve uma bota, contendo um número inteiro M (30 ≤ M ≤ 60) e uma letra L, separados por uma espaço em branco. M indica o número da bota e L indica o pé da bota: L = 'D' indica que a bota é para o pé direito, L = 'E' indica que a bota é para o pé esquerdo.

Saída
Para cada caso de teste imprima uma linha contendo um único número inteiro indicando o número total de pares corretos que podem ser formados.

Exemplo de Entrada	Exemplo de Saída
4
40 D
41 E
41 D
40 E
6
38 E
38 E
40 D
38 D
40 D
37 E

2
1

Maratona de Programação da SBC 2011
 */