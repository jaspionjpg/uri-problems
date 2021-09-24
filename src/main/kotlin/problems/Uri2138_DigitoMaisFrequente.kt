package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNext()) {
        val numero = ler.next()

        val lista = IntArray(10)

        numero.forEach { caractere ->
            lista[caractere - '0']++
        }

        val maximoRepeticoes = lista.maxOrNull()

        println(lista.indexOfLast { quantidade -> quantidade == maximoRepeticoes })
    }
}

/*
URI Online Judge | 2138
Dígito Mais Frequente
Por Joao Marcos Salvanini Bellini de Moraes, IFSULDEMINAS BR Brazil

Timelimit: 1
Na Nlogônia, diversos programadores participam de uma competição de criptografia denominada "Decrypt it!", em que aquele que decifrar o maior número de mensagens vence.

No meio da competição, você percebe que, para prosseguir e decifrar uma mensagem, deverá vencer o seguinte desafio: encontrar o dígito mais frequente de um número de até 1001 dígitos.

Entrada
A entrada é composta por várias linhas, contendo um inteiro N (1 ≤ N ≤ 101000). A entrada termina com fim de arquivo.

Saída
Mostre o dígito mais frequente do número informado. Em caso de empate, mostre o maior dígito.


 */