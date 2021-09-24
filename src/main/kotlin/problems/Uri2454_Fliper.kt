package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val j: Int = ler.nextInt()
    val k: Int = ler.nextInt()

    if (j == 0) println("C")
    else if (k == 0) println("B")
    else println("A")
}

/*
URI Online Judge | 2454
Flíper
Por OBI - Olimpíada Brasileira de Informática 2014 BR Brazil

Timelimit: 1
Flíper é um tipo de jogo onde uma bolinha de metal cai por um labirinto de caminhos até chegar na parte de baixo do labirinto. A quantidade de pontos que o jogador ganha depende do caminho que a bolinha seguir. O jogador pode controlar o percurso da bolinha mudando a posição de algumas portinhas do labirinto. Cada portinha pode estar na posição 0, que significa virada para a esquerda, ou na posição 1 que quer dizer virada para a direita. Considere o flíper da figura abaixo, que tem duas portinhas. A portinha P está na posição 1 e a portinha R, na posição 0. Desse jeito, a bolinha vai cair pelo caminho B.



Você deve escrever um programa que, dadas as posições das portinhas P e R, neste flíper da figura, diga por qual dos três caminhos, A, B ou C, a bolinha vai cair!

Entrada
A entrada é composta por apenas uma linha contendo dois números P (0 ou 1) e R (0 ou 1), indicando as posições das duas portinhas do flíper da figura.

Saída
A saída do seu programa deve ser também apenas uma linha, contendo uma letra maiúscula que indica o caminho por onde a bolinha vai cair: ‘A’, ‘B’ ou ‘C’.

Exemplos de Entrada	Exemplos de Saída
1 0

B

0 0

C

OBI - Olimpíada Brasileira de Informática 2014 Fase 1 Nível Júnior
 */