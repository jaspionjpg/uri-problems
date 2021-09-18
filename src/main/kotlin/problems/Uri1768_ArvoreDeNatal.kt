package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNextInt()) {
        val tamanhoArvore = ler.nextInt()

        for (i in 1..tamanhoArvore step 2) {
            printParteArvore(i, tamanhoArvore)
        }
        printParteArvore(1, tamanhoArvore)
        printParteArvore(3, tamanhoArvore)
        println()
    }
}

fun printParteArvore(numero: Int, tamanho: Int) {
    val tamanhoBrancos = (tamanho - numero) / 2

    var brancos = ""
    for (i in 0 until tamanhoBrancos)
        brancos += " "
    var asteristicos = ""
    for (i in 0 until numero)
        asteristicos += "*"
    println(brancos + asteristicos)
}

/*
URI Online Judge | 1768
Árvore de Natal
Por Neilor Tonin, URI Online Judge BR Brazil

Timelimit: 1
As crianças adoram desenhar árvores de natal e você desafiou algumas delas a desenharem árvores de diversos tamanhos com apenas com o caractere asterisco "*".

A regra é simples. De baixo para cima, o tronco da árvore consiste de 3 asteriscos e depois 1. Em seguida vem o restante da árvore, com cada fileira de folhas iniciando no tamanho que você determinou e diminuindo de dois em dois, até chegar na copa da árvore que terá apenas um asterisco. Note que para isso dar certo, somente será permitido tamanhos ímpares para estas árvores.

Entrada
A entrada contém vários casos de teste e termina com EOF. Cada caso de teste consiste em um inteiro N (2 < N < 100).

Saída
Para cada caso de teste de entrada, seu programa deverá desenhar uma árvore conforme especificação acima e exemplo abaixo, com uma linha em branco após cada árvore.

Exemplo de Entrada	Exemplo de Saída
9
5

    *
   ***
  *****
 *******
*********
    *
   ***

  *
 ***
*****
  *
 ***

Contest de Natal 2014
 */