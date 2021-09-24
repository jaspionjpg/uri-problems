package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val numeroPokemons = ler.nextInt()
    val pokemons = mutableSetOf<String>()

    for (i in 0 until numeroPokemons) {
        val pokemon = ler.next()
        pokemons.add(pokemon)
    }

    val total = 151 - pokemons.size
    println("Falta(m) $total pomekon(s).")
}

/*
URI Online Judge | 2174
Coleção de Pomekon
Por Gabriel Duarte, UNIFESO BR Brazil

Timelimit: 1
Desde que foi lançado oficialmente o Pomekon no Brasil, Dabriel está tentando realizar seu maior sonho: Ser um Mestre Pomekon. Sua meta é conquistar os 151 Pomekons disponíveis. Ele já conseguiu capturar muitos monstrinhos, porém em sua cidade aparecem muitos Pomekons repetidos, fazendo com que ele capture diversas vezes o mesmo Pomekon.

Vendo que sua mochila está bem cheia, Dabriel pediu para que você fizesse um programa de computador que informasse a ele quantos Pomekons faltam para completar a coleção.

Entrada
A primeira linha do caso de teste consiste de um inteiro N (1 ≤ N ≤ 10³), representando a quantidade de Pomekons que Dabriel já capturou.
As próximas N linhas consistem de uma string S (1 ≤ |S| ≤ 10³), representando o nome de cada Pomekons. O nome de cada Pomekons consiste apenas de letras maiúsculas e minúsculas.

Saída
Você deverá imprimir: "Falta(m) X pomekon(s).", onde X representa a quantidade Pomekons não capturados.

Exemplos de Entrada	Exemplos de Saída
7
Charmander
Caterpie
Pidgeot
Rattata
Zubat
Zubat
Zubat

Falta(m) 146 pomekon(s).

8
Zubat
Zubat
Zubat
Zubat
Zubat
Zubat
Zubat
Zubat

Falta(m) 150 pomekon(s).

Aquecimento para a OBI 2016 - Fase 2
 */