package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val texto = ler.nextLine()
    if (texto.length > 140) println("MUTE")
    else println("TWEET")
}

/*
URI Online Judge | 2165
Tuitando
Por M.C. Pinto, UNILA BR Brazil

Timelimit: 1
O microblog Twitter é conhecido por limitar as postagens em 140 caracteres. Conferir se um texto vai caber em um tuíte é sua tarefa.

Entrada
A entrada é uma linha de texto T (1 ≤ |T| ≤ 500).

Saída
A saída é dada em uma única linha. Ela deve ser "TWEET" (sem as aspas) se a linha de texto T tem até 140 caracteres. Se T tem mais de 140 caracteres, a saída deve ser "MUTE".

Exemplo de Entrada	Exemplo de Saída
RT @TheEllenShow: If only Bradley's arm was longer. Best photo ever. #oscars pic.twitter.com/C9U5NOtGap

TWEET

Prova 2 (D2) de Programação de Computadores 2016/1 da UNILA
 */