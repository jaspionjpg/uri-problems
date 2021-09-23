package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val tamanhoFloresta: Int = ler.nextInt()
    val matrizFloresta = Array(tamanhoFloresta) { IntArray(tamanhoFloresta) }

    for (i in 0 until tamanhoFloresta)
        for (k in 0 until tamanhoFloresta)
            matrizFloresta[i][k] = ler.nextInt()

    val lista = mutableSetOf<Int>()
    for (indiceProcura in 0 until tamanhoFloresta * 2) {
        val i: Int = ler.nextInt() - 1
        val k: Int = ler.nextInt() - 1
        lista.add(matrizFloresta[i][k])
    }

    println(lista.size)
}

/*
URI Online Judge | 1901
Borboletas
Por Thalyson Nepomuceno, Universidade Estadual do Ceará BR Brazil

Timelimit: 1
As florestas do planeta Binox possuem várias espécies raras de borboletas. Bino também é um caçador de borboletas, e quer coletar o máximo de espécies diferentes de borboletas. A floresta de Binox é representada por um grid quadrado de tamanho NxN, e cada célula 1x1 do grid pode conter uma borboleta. A imagem a seguir representa o primeiro exemplo de entrada. As espécies coletadas foram: 1, 2, 3, 4 e 8.



Sua tarefa é determinar a quantidade de espécies de borboletas que Bino conseguirá coletar, conhecendo o mapa da floresta e todos os locais que Bino procurou por borboletas. Por algum motivo desconhecido, Bino sempre procura em 2*N posições da floresta.

Entrada
A entrada é contituida por multiplas linhas. A primeira linha contém um inteiro N (0 < N ≤ 200) representando o tamanho da floresta. As próximas N linhas contém N inteiros Kij (0 < Kij ≤ 1000) cada, representando qual espécie de borboleta presente em cada célula. As próximas N*2 linhas contém 2 inteiros cada, representando as células visitadas por Bino.

Saída
Imprima uma linha contendo a quantidade de espécies diferentes que Bino coletou.

Exemplos de Entrada	Exemplos de Saída
3
1 1 2
2 3 4
8 7 1
1 1
1 2
2 1
2 2
2 3
3 1

5

Contest Oficial de Aquecimento da Olimpíada Brasileira de Informática-Fase 2, 2015
 */