package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    var maiorNumero = 0
    var indece = 0
    for (i in 1 until 101) {
        val numero = ler.nextInt()
        if (numero > maiorNumero) {
            maiorNumero = numero
            indece = i
        }
    }
    println(maiorNumero)
    println(indece)
}

/*
URI Online Judge | 1080
Maior e Posição
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
2
113
45
34565
6
...
8


34565
4
 */