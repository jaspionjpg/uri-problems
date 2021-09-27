package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (true) {
        val x = ler.nextInt()
        val y = ler.nextInt()
        if (x == 0 || y == 0)
            break

        if (x > 0 && y > 0)
            println("primeiro")
        else if (x < 0 && y > 0)
            println("segundo")
        else if (x < 0 && y < 0)
            println("terceiro")
        else
            println("quarto")
    }
}

/*
URI Online Judge | 1115
Quadrante
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

Entrada
A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.

Saída
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.

Exemplo de Entrada	Exemplo de Saída
2 2
3 -2
-8 -1
-7 1
0 2

primeiro
quarto
terceiro
segundo

Formatação e inserção no portal por Cássio Favaretto.
 */