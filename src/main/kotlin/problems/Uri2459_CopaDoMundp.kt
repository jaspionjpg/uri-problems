package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val cidades = ler.nextInt() // N (2 ≤ N ≤ 100),
    val ferrovias = ler.nextInt() // F (1 ≤ F ≤ N(N − 1)/2)
    val rodovias = ler.nextInt() // R (1 ≤ R ≤ N(N − 1)/2)

    val matrizFerrovias = Array(cidades) { IntArray(cidades) }
    val matrizRodovias = Array(cidades) { IntArray(cidades) }
    for (i in 0 until ferrovias) {
        val cid1 = ler.nextInt() - 1
        val cid2 = ler.nextInt() - 1
        val custo = ler.nextInt()

        if (matrizFerrovias[cid1][cid2] == 0)
            matrizFerrovias[cid1][cid2] = custo
        else if (matrizFerrovias[cid1][cid2] > custo)
            matrizFerrovias[cid1][cid2] = custo
    }

    for (i in 0 until rodovias) {
        val cid1 = ler.nextInt() - 1
        val cid2 = ler.nextInt() - 1
        val custo = ler.nextInt()

        if (matrizRodovias[cid1][cid2] == 0)
            matrizRodovias[cid1][cid2] = custo
        else if (matrizRodovias[cid1][cid2] > custo)
            matrizRodovias[cid1][cid2] = custo
    }
/*
    1 2 = 100
    1 3 = 250
    3 4 = 300
    650
    2 5 = 400
    1050
 */

    var valorTotal = 0

    for (i in 0 until cidades - 1) {

        val menorValorFerrovias = getMenor(matrizFerrovias, i + 1)
        if (menorValorFerrovias != 9999)
            valorTotal += menorValorFerrovias
        else
            valorTotal += getMenor(matrizRodovias, i + 1)
    }

    println(valorTotal)
}

private fun getMenor(matriz: Array<IntArray>, lugarParaIr: Int): Int {
    var menorValor = 9999
    for (arrays in matriz) {
        if (arrays[lugarParaIr] != 0 && arrays[lugarParaIr] < menorValor)
            menorValor = arrays[lugarParaIr]
    }
    return menorValor
}