package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()
    for (teste in 0 until testes) {

        val blocos = ler.nextInt()
        var comprimento = ler.nextInt()

        val listaBlocos = IntArray(blocos)
        for (i in 0 until blocos)
            listaBlocos[i] = ler.nextInt()

        val blocosOrdenados = listaBlocos.sortedDescending()

        var menorBlocos = Int.MAX_VALUE
        for (i in blocos downTo 1) {

            val numeroBlocos = pegarMinimoBlocos(blocosOrdenados.subList(blocos - i, blocos), comprimento)
            if (numeroBlocos < menorBlocos)
                menorBlocos = numeroBlocos
        }

        println(menorBlocos)
    }
}

private fun pegarMinimoBlocos(
    listaBlocos: List<Int>,
    comprimentoTotal: Int
): Int {
    var comprimentoRestante = comprimentoTotal
    var todosBlocosUsados = 0

    for (bloco in listaBlocos) {
        val blocosUsados = comprimentoRestante.floorDiv(bloco)
        comprimentoRestante -= blocosUsados * bloco

        todosBlocosUsados += blocosUsados
        if (comprimentoRestante == 0)
            break
    }

    return todosBlocosUsados
}

/*
URI Online Judge | 1034
Festival de Estátuas de Gelo
Por Wanderley Guimarães, USP  Brasil

Timelimit: 3
Todos os anos, artistas de todo o mundo se reúnem na cidade, onde fazem esculturas de gelo gigantescas. A cidade vira uma galeria de arte ao céu aberto, uma vez que as esculturas ficam expostas na rua por semanas, sem derreter. Afinal, a temperatura média no inverno de Harbin (época em que ocorrerá a final mundial do ICPC) é de -20 graus.

O primeiro passo para fazer a escultura é montar um grande bloco de gelo da dimensão pedida pelo artista. Os blocos são recortados das geleiras de Harbin em blocos de altura e profundidade padrão e vários comprimentos diferentes. O artista pode determinar qual o comprimento que ele deseja que tenha o seu bloco de gelo para que a escultura possa começar a ser esculpida.

Os comprimentos disponíveis dos blocos são {a1; a2; ...;  aN} e o comprimento que o artista deseja é M. O bloco de comprimento 1 é muito usado, por este motivo ele sempre aparece na lista de blocos disponíveis. Sua tarefa é determinar o número mínimo de blocos tal que a soma de seus comprimentos seja M.

Entrada
A entrada é composta por diversas instâncias. A primeira linha da entrada contém um inteiro T indicando o número de instâncias. A primeira linha de cada instância contém dois inteiros N (1 ≤ N ≤ 25) e M (1 ≤ M ≤ 1000000) representando o número de tipos de blocos e o comprimento desejado pelo artista, respectivamente. A próxima linha contém os inteiros a1; a2; ...; aN , onde (1 ≤ ai ≤ 100) para todo i (1,2,...N) separados por espaço.

Saída
Para cada instância, imprima o número mínimo de blocos necessários para obter um bloco de comprimento M.

Exemplo de Entrada	Exemplo de Saída
2
6 100
1 5 10 15 25 50
2 103
1 5

2
23

XIII Maratona de Programação IME-USP 2009.
 */