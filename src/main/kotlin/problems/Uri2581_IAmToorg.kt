package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextLine().toInt()
    for (i in 0 until testes) {
        val pergunta = ler.nextLine()
        println("I am Toorg!")
    }
}

/*
URI Online Judge | 2581
I am Toorg!
Por Ricardo Martins, IFSULDEMINAS BR Brazil

Timelimit: 1
Toorg é o integrante mais sábio do grupo de heróis denominado Os Protetores da Via Láctea. Para qualquer pergunta, ele tem a resposta ideal! Escreva um programa que, dada uma pergunta, informe a resposta de Toorg.

Entrada
A entrada terá diversos casos de teste. A cada caso de teste, um número N é apresentado, que representa o número de casos de teste. Em seguida, haverá N linhas, com as perguntas feitas para Toorg.

Saída
Para cada caso de teste, imprima a resposta de Toorg.

Exemplo de Entrada	Exemplo de Saída
3
Who are you?
How old are you?
What can I do for you?

I am Toorg!
I am Toorg!
I am Toorg!

VII Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2017
 */