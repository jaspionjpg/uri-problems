package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val impares = ArrayList<Int>()
    val pares = ArrayList<Int>()

    for (i in 0 until 15) {
        val numero = ler.nextInt()
        if (numero % 2 == 0)
            pares.add(numero)
        else
            impares.add(numero)

        if (pares.size == 5) {
            printar(pares)
            pares.clear()
        } else if (impares.size == 5) {
            printar(impares)
            impares.clear()
        }
    }
    printar(impares)
    printar(pares)
}

private fun printar(lista: ArrayList<Int>) {
    for (i in 0 until lista.size) {
        if (lista[i] % 2 == 0)
            println("par[$i] = ${lista[i]}")
        else println("impar[$i] = ${lista[i]}")
    }
}

/*
URI Online Judge | 1179
Preenchimento de Vetor IV
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Neste problema você deverá ler 15 valores colocá-los em 2 vetores conforme estes valores forem pares ou ímpares. Só que o tamanho de cada um dos dois vetores é de 5 posições. Então, cada vez que um dos dois vetores encher, você deverá imprimir todo o vetor e utilizá-lo novamente para os próximos números que forem lidos. Terminada a leitura, deve-se imprimir o conteúdo que restou em cada um dos dois vetores, imprimindo primeiro os valores do vetor impar. Cada vetor pode ser preenchido tantas vezes quantas for necessário.

Entrada
A entrada contém 15 números inteiros.

Saída
Imprima a saída conforme o exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
1
3
4
-4
2
3
8
2
5
-7
54
76
789
23
98

par[0] = 4
par[1] = -4
par[2] = 2
par[3] = 8
par[4] = 2
impar[0] = 1
impar[1] = 3
impar[2] = 3
impar[3] = 5
impar[4] = -7
impar[0] = 789
impar[1] = 23
par[0] = 54
par[1] = 76
par[2] = 98
 */