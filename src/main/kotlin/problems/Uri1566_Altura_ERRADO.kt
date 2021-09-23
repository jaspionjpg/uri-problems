package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val cidades: Int = ler.nextInt()
    for (i in 0 until cidades) {
        val pessoasCidades = ler.nextInt()

        val alturas = IntArray(230)
        for (pessoa in 0 until pessoasCidades)
            alturas[ler.nextInt()] += 1

        var first = false
        for (indice in 0 until alturas.size) {
            if (alturas[indice] > 0)
                for (numero in 0 until alturas[indice])
                    if (first)
                        print(" $indice")
                    else {
                        first = true
                        print(indice)
                    }
        }
        println()
    }
}

//fun countElements(input: IntArray, k: Int): IntArray {
//    val c = IntArray(k + 1)
//    Arrays.fill(c, 0)
//    for (i in input)
//        c[i] += 1
//    for (i in 1 until c.size)
//        c[i] += c[i - 1]
//
//    return c
//}

//fun sort(input: IntArray, k: Int): IntArray {
//    val c: IntArray = countElements(input, k)
//    val sorted = IntArray(input.size)
//    for (i in input.indices.reversed()) {
//        val current = input[i]
//        sorted[c[current] - 1] = current
//        c[current] -= 1
//    }
//    return sorted
//}

/*
URI Online Judge | 1566
Altura
Por Neilor Tonin, URI BR Brazil

Timelimit: 1
Cheio de boas ideias, agora o governo brasileiro resolveu criar a "bolsa altura". Desta forma, você foi incumbido de fazer o levantamento da altura da população de várias cidades e ordenar esta população por ordem crescente de altura. Você sabe que as cidades as quais terá que fazer isso tem menos de 3 milhões de habitantes e que ninguém, segundo o IBGE, tem mais do que 230 cm de altura nestas cidades.

Entrada
A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro NC (NC < 100) que indica a quantidade de casos de teste, ou seja de cidades. Para cada caso de teste, a primeira linha conterá um inteiro N (1 < N ≤ 3000000), indicando a quantidade de pessoas da cidade. A próxima linha irá conter a altura de cada uma destas pessoas, em centímetros, representado pela letra h (20 ≤ h  ≤ 230) e separados por um espaço em branco.

Saída
Para cada caso de teste de entrada, imprima uma linha contendo os valores das alturas de todos os moradores da cidade (em cm), por ordem crescente de altura, separados por um espaço em branco.

Obs.: O arquivo de entrada é bastante grande, portanto, utilize um método rápido para leitura / escrita.

Exemplo de Entrada	Exemplo de Saída
6
10
65 31 37 37 72 76 61 35 57 37
12
45 186 185 55 51 51 22 78 64 26 49 21
10
20 93 203 67 64 225 112 81 58 180
8
169 189 220 228 68 32 214 180
6
133 55 67 166 112 41
4
39 38 120 55

31 35 37 37 37 57 61 65 72 76
21 22 26 45 49 51 51 55 64 78 185 186
20 58 64 67 81 93 112 180 203 225
32 68 169 180 189 214 220 228
41 55 67 112 133 166
38 39 55 120
 */