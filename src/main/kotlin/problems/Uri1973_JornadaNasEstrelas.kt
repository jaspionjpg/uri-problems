package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeroSitios = ler.nextLong()

    val sitios = ArrayList<Long>()
    val sitiosAntigos = ArrayList<Long>()

    for (i in 0 until numeroSitios) {
        val ovelhas = ler.nextLong()
        sitios.add(ovelhas)
        sitiosAntigos.add(ovelhas)
    }

    var indice = 0
    while (indice > -1 && indice < sitios.size) {
        if ((sitios[indice] % 2L) != 0L) {
            if (sitios[indice] > 0)
                sitios[indice] = sitios[indice] - 1
            indice++
        } else {
            if (sitios[indice] > 0)
                sitios[indice] = sitios[indice] - 1
            indice--
        }
    }
    var alteracaoOvelhas = 0
    sitios.forEachIndexed { index, i ->
        if (sitiosAntigos.get(index) != i)
            alteracaoOvelhas++
    }

    val totalOvelhasRestantes = sitios.reduce { acc, i -> acc + i }

    println("$alteracaoOvelhas $totalOvelhasRestantes")
}

/*
URI Online Judge | 1973
Jornada nas Estrelas
Por Leandro Zatesko, UFFS BR Brazil

Timelimit: 1
Após comprar vários sítios adjacentes na região do oeste catarinense, a família Estrela construiu uma única estrada que passa por todos os sítios em sequência. O primeiro sítio da sequência foi batizado de Estrela 1, o segundo de Estrela 2, e assim por diante. Porém, o irmão que vive em Estrela 1 acabou enlouquecendo e resolveu fazer uma Jornada nas Estrelas para roubar carneiros das propriedades de seus irmãos. Mas ele está definitivamente pirado. Quando passa pelo sítio Estrela i, ele rouba apenas um carneiro daquele sítio (se o sítio tem algum) e segue ou para Estrela i + 1 ou para Estrela i - 1, dependendo se o número de carneiros em Estrela i era, respectivamente, ímpar ou par. Se não existe a Estrela para a qual ele deseja seguir, ele interrompe sua jornada. O irmão louco começa sua Jornada em Estrela 1, roubando um carneiro do seu próprio sítio.

Entrada
A primeira linha da entrada consiste de um único inteiro N (1 ≤ N ≤ 106), o qual representa o número de Estrelas. A segunda linha da entrada consiste de N inteiros, de modo que o i-ésimo inteiro, Xi (1 ≤ Xi ≤ 106), representa o número inicial de carneiros em Estrela i.

Saída
Imprima uma linha contendo dois inteiros, de modo que o primeiro represente o número de Estrelas atacadas pelo irmão louco e o segundo represente o número total de carneiros não roubados.

Exemplo de Entrada	Exemplo de Saída
8
1 3 5 7 11 13 17 19

8 68

8
1 3 5 7 11 13 16 19

7 63

3ạ Maratona de Programação Júnior da UFFS
 */