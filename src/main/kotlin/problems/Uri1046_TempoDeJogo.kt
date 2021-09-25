package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val horainicio = ler.nextInt()
    val horafim = ler.nextInt()

    val duracao = if (horainicio < horafim)
        horafim - horainicio
    else horafim + 24 - horainicio

    println("O JOGO DUROU $duracao HORA(S)")
}

/*
URI Online Judge | 1046
Tempo de Jogo
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
16 2
O JOGO DUROU 10 HORA(S)

0 0
O JOGO DUROU 24 HORA(S)

2 16
O JOGO DUROU 14 HORA(S)
 */