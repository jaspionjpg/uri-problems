package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val linhas: Int = ler.nextInt()
    val colunas: Int = ler.nextInt()

    val numeros = Array(linhas) { IntArray(colunas) { ler.nextInt() } }

    var enderecoSabre = "0 0"
    linha@ for (linha in 0 until linhas)
        for (coluna in 0 until colunas)
            if (numeros[linha][coluna] == 42 &&
                linhaNãoÉCanto(linha, linhas, coluna, colunas) &&
                éCercadoPor7(numeros, linha, coluna)
            ) {
                enderecoSabre = "${linha + 1} ${coluna + 1}"
                break@linha
            }

    println(enderecoSabre)
}

private fun éCercadoPor7(
    numeros: Array<IntArray>,
    linha: Int,
    coluna: Int
) = numeros[linha - 1][coluna] == 7 && numeros[linha][coluna - 1] == 7 && numeros[linha - 1][coluna - 1] == 7 &&
        numeros[linha - 1][coluna + 1] == 7 && numeros[linha + 1][coluna] == 7 &&
        numeros[linha][coluna + 1] == 7 && numeros[linha + 1][coluna + 1] == 7 && numeros[linha + 1][coluna - 1] == 7

private fun linhaNãoÉCanto(
    linha: Int,
    linhas: Int,
    coluna: Int,
    colunas: Int
) = linha > 0 && linha < linhas - 1 && coluna > 0 && coluna < colunas - 1

/*
URI Online Judge | 2163
O Despertar da Força
Por M.C. Pinto, UNILA BR Brazil

Timelimit: 1
Há muito tempo atrás, em uma galáxia muito, muito distante...

Após o declínio do Império, sucateiros estão espalhados por todo o universo procurando por um sabre de luz perdido. Todos sabem que um sabre de luz emite um padrão de ondas específico: 42 cercado por 7 em toda a volta. Você tem um sensor de ondas que varre um terreno com N x M células. Veja o exemplo abaixo para um terreno 4 x 7 com um sabre de luz nele (na posição (2, 4)).



Você deve escrever um programa que, dado um terreno N x M, procura pelo padrão do sabre de luz nele. Nenhuma varredura tem mais do que um padrão de sabre de luz.

Entrada
A primeira linha da entrada tem dois números positivos N e M, representando, respectivamente, o número de linhas e de colunas varridos no terreno (3 ≤ N, M ≤ 1000). Cada uma das próximas N linhas tem M inteiros, que descrevem os valores lidos em cada célula do terreno (-100 ≤ Tij ≤ 100, para 1 ≤ i ≤ N e 1 ≤ j ≤ M).

Saída
A saída é uma única linha com 2 inteiros X e Y separados por um espaço. Eles representam a coordenada (X,Y) do sabre de luz, caso encontrado. Se o terreno não tem um padrão de sabre de luz, X e Y são ambos zero.

Exemplos de Entrada	Exemplos de Saída
4 7
11 12 7 7 7 13 14
15 6 7 42 7 7 42
98 -5 7 7 7 42 7
-1 42 3 9 7 7 7

2 4

4 7
11 12 7 7 7 13 14
15 6 7 12 7 7 42
98 -5 7 7 7 42 7
-1 42 3 9 7 7 7

0 0

3 3
7 7 7
7 42 7
7 7 7

2 2

Prova 2 (D1) de Programação de Computadores 2016/1 da UNILA
 */