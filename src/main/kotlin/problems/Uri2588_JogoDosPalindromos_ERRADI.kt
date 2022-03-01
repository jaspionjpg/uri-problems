package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNext()) {
        var palavra = ler.next()
        var contador = 0

        while (palavra.reversed() != palavra) {
            palavra += palavra[contador]
            contador++
        }
        println(contador)
    }
}

/*
beecrowd | 2588
Jogo dos Palíndromos
Por Ricardo Martins, IFSULDEMINAS BR Brazil

Timelimit: 1
Rener era um garoto que adorava palíndromos. Tanto que inventou um jogo com estes. Dada uma sequência de letras, quantas mais teriam que ser adicionadas, pelo menos, de modo que alguma permutação desta sequência formasse um palíndromo. Por exemplo, batata precisa adicionar um b no final, para virar o palíndromo batatab. Em outro exemplo, aabb, não precisa adicionar nenhuma letra, pois se faz o palíndromo abba ou baab. Em mais um exemplo, abc precisa de duas letras a mais, para formar um palíndromo, que pode ser abcba, acbca, bacab, bcacb, cabac ou cbabc. Escreva um programa que, dada uma sequência de letras, informe qual é o mínimo de letras que precisam ser adicionadas à sequência, para que haja, pelo menos, um anagrama que forme um palíndromo.

Entrada
Haverá diversos casos de teste. Em cada caso, é mostrada uma sequência de, no máximo, 1000 letras. Os casos de teste terminam com fim de arquivo.

Saída
Para cada caso de teste, imprima um valor inteiro, correspondente à quantidade mínima de letras a serem acrescentadas para que a sequência se torne um palíndromo, em uma de suas permutações.

Exemplo de Entrada	Exemplo de Saída
batata
aabb
abc

1
0
2

VII Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2017
 */