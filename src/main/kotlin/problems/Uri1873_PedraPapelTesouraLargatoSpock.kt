package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes: Int = ler.nextInt()
    for (i in 0 until testes) {
        val a = ler.next()
        val b = ler.next()

        if (a == b) {
            println("empate")
        } else if (a == "tesoura" && b == "papel") {
            println("rajesh")
        } else if (a == "papel" && b == "pedra") {
            println("rajesh")
        } else if (a == "pedra" && b == "lagarto") {
            println("rajesh")
        } else if (a == "lagarto" && b == "spock") {
            println("rajesh")
        } else if (a == "spock" && b == "tesoura") {
            println("rajesh")
        } else if (a == "tesoura" && b == "lagarto") {
            println("rajesh")
        } else if (a == "lagarto" && b == "papel") {
            println("rajesh")
        } else if (a == "papel" && b == "spock") {
            println("rajesh")
        } else if (a == "spock" && b == "pedra") {
            println("rajesh")
        } else if (a == "pedra" && b == "tesoura") {
            println("rajesh")
        } else println("sheldon")
    }
}

/*
URI Online Judge | 1873
Pedra-papel-tesoura-lagarto-Spock
Por Ricardo Martins, IFSULDEMINAS BR Brazil

Timelimit: 1
Pedra-papel-tesoura-lagarto-Spock é uma expansão do clássico método de seleção em jogo de pedra-papel-tesoura. Atua sob o mesmo princípio básico, mas inclui outras duas armas adicionais: o lagarto (formado pela mão igual a uma boca de fantoche) e Spock (formada pela saudação dos vulcanos em Star Trek). Isso reduz as chances de uma rodada terminar em um empate. O jogo foi inventado por Sam Kass e Karen Bryla, como "Rock Paper Scissors Lizard Spock". As regras de vantagem são as seguintes:

Tesoura corta papel
Papel cobre pedra
Pedra derruba lagarto
Lagarto adormece Spock
Spock derrete tesoura
Tesoura prende lagarto
Lagarto come papel
Papel refuta Spock
Spock vaporiza pedra
Pedra quebra tesoura
Um dia, dois amigos, Rajesh e Sheldon, decidiram apostar quem pagaria um almoço para o outro, com esta brincadeira. Sua missão será fazer um algoritmo que, baseado no que eles escolherem, informe quem irá ganhar ou se dará empate.

Entrada
Haverá diversos casos de teste. O primeiro número a ser lido será um inteiro C, representando a quantidade de casos de teste. Cada caso de teste tem duas palavras, representando a escolha de Rajesh e de Sheldon, respectivamente.

Saída
Para cada caso de teste, imprima quem venceu, ou se houve empate.

Exemplo de Entrada	Exemplo de Saída
3

spock spock

tesoura spock

lagarto spock

empate

sheldon

rajesh

V Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2015
 */