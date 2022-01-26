package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (ler.hasNextInt()) {
        val competidores: Int = ler.nextInt()
        val largada = IntArray(competidores) { ler.nextInt() }
        val chegada = IntArray(competidores) { ler.nextInt() }

        var ultrapassagens = 0

        // intera todos a lista da chegada -1
        for (posicaoCarro in 0..competidores - 2) {
            // pega com base no carro da chegada em qual posicao o carro ta na largada
            val lugarLargada = largada.indexOfFirst { i -> i == chegada[posicaoCarro] }

            // cria uma lista de carros aptos a serem ultrapassados com base no lugar de largada
            var aPassarNaLargada = largada.slice(0..lugarLargada)

            // pega todos os carros que estao atras do carro em questao na chegada
            var atrasNaChegada = chegada.slice(posicaoCarro + 1 until competidores)

            // conta quantos numeros nas duas listas estao nas duas listas
            // e soma em ultrapassagens
            ultrapassagens += aPassarNaLargada.intersect(atrasNaChegada).count()
        }

        println(ultrapassagens)
    }
}

/*
beecrowd | 1228
Grid de Largada
Maratona de Programação da SBC  Brasil

Timelimit: 1
Na Nlogônia, vai ser realizada a sensacional final mundial da fórmula 17. Os competidores se alinham na largada e disputam a corrida. Você vai ter acesso aos grids de largada e de chegada. A questão é determinar o número mínimo de ultrapassagens que foram efetuadas durante a competição.

Entrada
Cada caso de teste utiliza três linhas. A primeira linha de um caso de teste contém um inteiro N (2 ≤ N ≤ 24) indicando o número de competidores. Cada competidor é identificado com um número de 1 a N. A segunda linha de cada caso tem os N competidores, em ordem do grid de largada. A terceira linha de cada caso tem os mesmos competidores, porém agora na ordem de chegada.

Saída
Para cada caso de teste imprima uma linha contendo um único número inteiro, que indica o número mínimo de ultrapassagens necessárias para se chegar do grid de largada ao grid de chegada.

Exemplo de Entrada	Exemplo de Saída
5
1 2 3 4 5
3 1 2 5 4
5
3 1 2 5 4
1 2 3 4 5
5
3 1 2 5 4
5 3 2 1 4

3
3
4

Maratona de Programação da SBC 2012
 */