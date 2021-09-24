package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes: Int = ler.nextInt()
    for (i in 0 until testes) {
        val galopeira = ler.next()
        val numeroCaractere = galopeira.length.toDouble() / 100

        println("%.2f".format(numeroCaractere))
    }
}

/*
URI Online Judge | 2147
Galopeira
Por Ricardo Martins, IFSULDEMINAS BR Brazil

Timelimit: 1
Certo dia, os irmãos Little Chitão e Xor Or Oh, exímios digitadores, fizeram um desafio, para ver quem era o melhor na digitação. Para isto, conseguiram um computador que não processa teclas pressionadas, ou seja, se for para digitar a mesma letra duas vezes seguidas, precisa pressionar a tecla duas vezes, visto que, pressionar a tecla por mais tempo, não adianta. Também mediram o tempo de uma tecla pressionada, que foi de, exatamente, um centésimo de segundo. O desafio seria quem digitasse a palavra “galopeira”, formada por mais letras e, mas ambos eram muito bons, e chegava num ponto que não era possível contar quantas letras haviam sido digitadas. Então, pediram a sua ajuda para escrever um programa que verifique a palavra digitada e veja quanto tempo foi gasto para a digitação.

Escreva um programa que, dada uma palavra digitada, informe quanto tempo foi gasto para ser digitada.

Entrada
Um número inteiro C será informado, que será a quantidade de casos de teste. Cada caso tem uma palavra, de, no mínimo, 9 e, no máximo 10000 letras.

Saída
Para cada caso de teste, imprima um número T, que é o tempo gasto, em segundos, para digitar a palavra do respectivo caso de teste, com aproximação de duas casas decimais.

Exemplo de Entrada	Exemplo de Saída
3

galopeira

galopeeeeeeeeeeeeeeeeeira

galopeeira

0.09

0.25

0.10

VI Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2016
 */