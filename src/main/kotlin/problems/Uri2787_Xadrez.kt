package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val y = ler.nextInt()
    val x = ler.nextInt()

    if ((x % 2 == 0 && y % 2 == 0) ||
        (x % 2 != 0 && y % 2 != 0) )
        println(1)
    else
        println(0)
}

/*
URI Online Judge | 2787
Xadrez
Por OBI BR Brasil

Timelimit: 1
No tabuleiro de xadrez, a casa na linha 1, coluna 1 (canto superior esquerdo) é sempre branca e as cores das casas se alternam entre branca e preta, de acordo com o padrão conhecido como... xadrez! Dessa forma, como o tabuleiro tradicional tem oito linhas e oito colunas, a casa na linha 8, coluna 8 (canto inferior direito) será também branca. Neste problema, entretanto, queremos saber a cor da casa no canto inferior direito de um tabuleiro com dimensões quaisquer: L linhas e C colunas. No exemplo da figura, para L = 6 e C = 9, a casa no canto inferior direito será preta!



Entrada
A primeira linha da entrada contém um inteiro L (1 ≤ L ≤ 1000) indicando o número de linhas do tabuleiro. A segunda linha da entrada contém um inteiro C (1 ≤ C ≤ 1000) representando o número de colunas.

Saída
Imprima uma linha na saída. A linha deve conter um inteiro, representando a cor da casa no canto inferior direito do tabuleiro: 1, se for branca; e 0, se for preta.

Exemplos de Entrada	Exemplos de Saída
6 9

0

8 8

1

5 91

1

OBI - Olimpíada Brasileira de Informática 2018 - Fase 1
 */