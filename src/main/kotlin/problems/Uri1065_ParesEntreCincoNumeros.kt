package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var resultado = 0
    for (i in 0..4) {
        val j = ler.nextInt()
        if (j % 2 == 0) {
            resultado++
        }
    }
    println("$resultado valores pares")
}

/*
URI Online Judge | 1065
Pares entre Cinco Números
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.

Exemplo de Entrada	Exemplo de Saída
7
-5
6
-4
12

3 valores pares
 */