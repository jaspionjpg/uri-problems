package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val operacao = ler.next()

    val matriz = Array(12) { DoubleArray(12) { ler.nextDouble() } }

    var soma = 0.0
    var numeros = 0
    for (linha in 0 until 12)
        for (coluna in 0 until 12) {
            if (linha > coluna) {
                soma += matriz[linha][coluna]
                numeros++
            }
        }

    if (operacao == "S")
        println("%.1f".format(soma))
    else
        println("%.1f".format(soma / numeros))
}

/*
URI Online Judge | 1184
Abaixo da Diagonal Principal
Por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão abaixo da diagonal principal da matriz, conforme ilustrado abaixo (área verde).




Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
S
1.0
0.0
-3.5
2.5
4.1
...

12.6
 */