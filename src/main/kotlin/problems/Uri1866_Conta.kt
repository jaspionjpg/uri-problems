package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes: Int = ler.nextInt()
    for (b in 1..testes) {
        val termosSoma: Int = ler.nextInt()
        if (termosSoma % 2 == 0)
            println("0")
        else
            println("1")
    }
}

/*
URI Online Judge | 1866
Conta
Por Ricardo Martins, IFSULDEMINAS BR Brazil

Timelimit: 1
Dois amigos pedem ao atendente de uma lanchonete propor um desafio, de modo que quem acertasse mais, não precisaria pagar a conta. Então foi proposto o seguinte: Dado o seguinte somatório abaixo, informar o resultado, com uma quantidade de termos no mesmo:

S = 1 - 1 + 1 - 1 + 1 - 1 + 1 - 1 ...

Escreva um programa que, dada uma quantidade de termos, informar o resultado do somatório acima.

Entrada
Um número inteiro C será informado, que será a quantidade de casos de teste. Cada caso de teste inicia com um número inteiro N (1 ≤ N ≤ 1000), indicando a quantidade de termos da soma.

Saída
Para cada caso de teste imprima um número S, que é o resultado da soma dos N termos da expressão.

Exemplo de Entrada	Exemplo de Saída
3

11

7

18

1

1

0

V Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2015
 */