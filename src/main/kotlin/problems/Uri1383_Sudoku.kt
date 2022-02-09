package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val vezes = ler.nextInt()
    for (vez in 1..vezes) {
        val matriz = Array(9) { IntArray(9) { ler.nextInt() } }
        val deuCertoHorizontal = matriz.all { colunas -> colunas.sum() == 45 && colunas.toSet().size == 9 }
        val deuCertoVertical = emColuna(matriz)
        val deuCertoPorQuadrado = emQuadrado(matriz)

        println("Instancia $vez")
        println(if (deuCertoHorizontal && deuCertoVertical && deuCertoPorQuadrado) "SIM" else "NAO")
        println()
    }
}

fun emColuna(matriz: Array<IntArray>): Boolean {
    for (quadradosHorizontais in 0 until 9) {
        var somaNumeros = 0
        var numerosDiferentes = mutableSetOf<Int>()
        for (quadradosVerticais in 0 until 9) {
            val numero = matriz[quadradosVerticais][quadradosHorizontais]
            somaNumeros += numero
            numerosDiferentes.add(numero)
        }
        if (somaNumeros != 45 || numerosDiferentes.size != 9) {
            return false
        }
    }
    return true
}

fun emQuadrado(matriz: Array<IntArray>): Boolean {
    for (quadradosHorizontais in 0..2) {
        for (quadradosVerticais in 0..2) {
            var somaNumeros = 0
            var numerosDiferentes = mutableSetOf<Int>()

            for (coluna in 0..2) {
                for (linha in 0..2) {
                    val numero = matriz[linha + 3 * quadradosHorizontais][coluna + 3 * quadradosHorizontais]
                    somaNumeros += numero
                    numerosDiferentes.add(numero)
                }
            }
            if (somaNumeros != 45 || numerosDiferentes.size != 9) {
                return false
            }
        }
    }
    return true
}

/*
beecrowd | 1383
Sudoku
Maratona de Programação IME-USP  Brasil
Timelimit: 1
O jogo de Sudoku espalhou-se rapidamente por todo o mundo, tornando-se hoje o passatempo mais popular em todo o planeta. Muitas pessoas, entretanto, preenchem a matriz de forma incorreta, desrespeitando as restrições do jogo. Sua tarefa neste problema é escrever um programa que verifica se uma matriz preenchida é ou não uma solução para o problema.

A matriz do jogo é uma matriz de inteiros 9 x 9 . Para ser uma solução do problema, cada linha e coluna deve conter todos os números de 1 a 9. Além disso, se dividirmos a matriz em 9 regiões 3 x 3, cada uma destas regiões também deve conter os números de 1 a 9. O exemplo abaixo mostra uma matriz que é uma solução do problema.



Entrada
São dadas várias instâncias. O primeiro dado é o número n > 0 de matrizes na entrada. Nas linhas seguintes são dadas as n matrizes. Cada matriz é dada em 9 linhas, em que cada linha contém 9 números inteiros.

Saída
Para cada instância seu programa deverá imprimir uma linha dizendo "Instancia k", onde k é o número da instância atual. Na segunda linha, seu programa deverá imprimir "SIM" se a matriz for a solução de um problema de Sudoku, e "NAO" caso contrário. Imprima uma linha em branco após cada instância.

Exemplo de Entrada	Exemplo de Saída
2
1 3 2 5 7 9 4 6 8
4 9 8 2 6 1 3 7 5
7 5 6 3 8 4 2 1 9
6 4 3 1 5 8 7 9 2
5 2 1 7 9 3 8 4 6
9 8 7 4 2 6 5 3 1
2 1 4 9 3 5 6 8 7
3 6 5 8 1 7 9 2 4
8 7 9 6 4 2 1 5 3
1 3 2 5 7 9 4 6 8
4 9 8 2 6 1 3 7 5
7 5 6 3 8 4 2 1 9
6 4 3 1 5 8 7 9 2
5 2 1 7 9 3 8 4 6
9 8 7 4 2 6 5 3 1
2 1 4 9 3 5 6 8 7
3 6 5 8 1 7 9 2 4
8 7 9 6 4 2 1 3 5

Instancia 1
SIM

Instancia 2
NAO

X Maratona de Programação IME-USP 2006.
 */