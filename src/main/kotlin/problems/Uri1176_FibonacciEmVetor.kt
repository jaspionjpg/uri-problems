package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()
    for (teste in 1..testes) {
        val numero = ler.nextInt()
        val lista = ArrayList<Long>()
        lista.add(0L)
        lista.add(1L)
        for (i in 2..numero)
            lista.add(lista[i - 1] + lista[i - 2])
        println("Fib($numero) = ${lista[numero]}")
    }
}
/*
URI Online Judge | 1176
Fibonacci em Vetor
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Faça um programa que leia um valor e apresente o número de Fibonacci correspondente a este valor lido. Lembre que os 2 primeiros elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a ele. Todos os valores de Fibonacci calculados neste problema devem caber em um inteiro de 64 bits sem sinal.

Entrada
A primeira linha da entrada contém um inteiro T, indicando o número de casos de teste. Cada caso de teste contém um único inteiro N (0 ≤ N ≤ 60), correspondente ao N-esimo termo da série de Fibonacci.

Saída
Para cada caso de teste da entrada, imprima a mensagem "Fib(N) = X", onde X é o N-ésimo termo da série de Fibonacci.

Exemplo de Entrada	Exemplo de Saída
3
0
4
2

Fib(0) = 0
Fib(4) = 3
Fib(2) = 1

Agradecimentos a Cassio F.
 */