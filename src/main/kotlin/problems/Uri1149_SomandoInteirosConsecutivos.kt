package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    var valor = ler.nextInt()
    var segundo = ler.nextInt()
    while (ler.hasNextInt())
        segundo = ler.nextInt()

    var soma = 0
    for (numero in 1..segundo) {
        soma += valor
        valor++
    }
    println(soma)
}

/*
URI Online Judge | 1149
Somando Inteiros Consecutivos
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Faça um algoritmo para ler um valor A e um valor N. Imprimir a soma de A + i para cada i com os valores (0 <= i <= N-1). Enquanto N for negativo ou ZERO, um novo N(apenas N) deve ser lido.

Entrada
A entrada contém somente valores inteiros, podendo ser positivos ou negativos. Todos os valores estão na mesma linha.

Saída
A saída contém apenas um valor inteiro.

Exemplo de Entrada	Exemplo de Saída
3 2

7

3 -1 0 -2 2

7

Agradecimentos a Cássio F.
 */