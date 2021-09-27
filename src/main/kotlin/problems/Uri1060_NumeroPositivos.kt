package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val listaNumeros = ArrayList<Double>()
    while (ler.hasNextDouble())
        listaNumeros.add(ler.nextDouble())

    println("${listaNumeros.count { numero -> numero > 0 }} valores positivos")
}

/*
URI Online Judge | 1060
Números Positivos
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.

Exemplo de Entrada	Exemplo de Saída
7
-5
6
-3.4
4.6
12

4 valores positivos
 */