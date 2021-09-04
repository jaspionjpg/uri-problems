package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val idadeHuguinho = ler.nextInt()
    val idadeZezinho = ler.nextInt()
    val idadeLuisinho = ler.nextInt()

    if (idadeZezinho in (idadeLuisinho + 1) until idadeHuguinho || idadeZezinho in (idadeHuguinho + 1) until idadeLuisinho)
        println("zezinho")
    else if (idadeHuguinho in (idadeLuisinho + 1) until idadeZezinho || idadeHuguinho in (idadeZezinho + 1) until idadeLuisinho)
        println("huguinho")
    else println("luisinho")
}

/*
URI Online Judge | 3301
Sobrinho do Meio
Por Ricardo Martins, Instituto Federal do Sul de Minas Gerais BR Brazil

Timelimit: 1
Tio Patinhas era um milionário que vivia em sua mansão, e tinha três sobrinhos: Huguinho, Zezinho e Luisinho. Ele se confundia facilmente entre os três sobrinhos, pois eram bem parecidos, apesar de terem idades diferentes. Um dia, os três fizeram uma aposta com o tio: se ele acertasse quem era o sobrinho do meio, ou seja, nem o mais novo, nem o mais velho, eles dariam uma moeda de ouro para ele, e se ele errasse, teria que dar uma moeda de ouro para cada um. Assim, o tio pede a tua ajuda para que ele possa ganhar essa aposta.

Entrada
A entrada consiste em vários casos de teste. Cada caso contém três valores inteiros H, Z e L, que representam as idades de Huguinho, Zezinho e Luisinho, respectivamente.

Saída
Para cada caso de teste imprima o nome do sobrinho do meio, com letras minúsculas.

Exemplos de Entrada	Exemplos de Saída
5 6 7

zezinho

7 5 6

luisinho

6 7 5

huguinho

11ª Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 202
 */