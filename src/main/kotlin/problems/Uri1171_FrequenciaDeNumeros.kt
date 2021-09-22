package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeroDeNumeros: Int = ler.nextInt()
    val mapa = mutableMapOf<Int, Int>()
    for (i in 0 until numeroDeNumeros) {
        val numero: Int = ler.nextInt()

        mapa[numero] = (mapa[numero] ?: 0) + 1
    }

    mapa.toSortedMap().forEach { (numero, repeticoes) ->
        println("$numero aparece $repeticoes vez(es)")
    }
}

/*
URI Online Judge | 1171
Frequência de Números
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Neste problema sua tarefa será ler vários números e em seguida dizer quantas vezes cada número aparece na entrada de dados, ou seja, deve-se escrever cada um dos valores distintos que aparecem na entrada por ordem crescente de valor.

Entrada
A entrada contém apenas 1 caso de teste. A primeira linha de entrada contem um único inteiro N, que indica a quantidade de valores que serão lidos para X (1 ≤ X ≤ 2000) logo em seguida. Com certeza cada número não aparecerá mais do que 20 vezes na entrada de dados.

Saída
Imprima a saída de acordo com o exemplo fornecido abaixo, indicando quantas vezes cada um deles aparece na entrada por ordem crescente de valor.

Exemplo de Entrada	Exemplo de Saída
7
8
10
8
260
4
10
10

4 aparece 1 vez(es)
8 aparece 2 vez(es)
10 aparece 3 vez(es)
260 aparece 1 vez(es)
 */