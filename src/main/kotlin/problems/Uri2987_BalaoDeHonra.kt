package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val caractere = ler.next()
    println(caractere[0] - 'A' + 1)
}

/*
URI Online Judge | 2987
Balão de Honra
Por Roger Eliodoro Condras, UFSC-ARA BR Brazil

Timelimit: 1
Dada uma letra do alfabeto, informe qual a sua posição.

Entrada
Um único caracter L, uma letra maiúscula ('A'-'Z') do alfabeto.

Saída
Um único inteiro, que representa a posição da letra no alfabeto.

Exemplo de Entrada	Exemplo de Saída
C

3
 */