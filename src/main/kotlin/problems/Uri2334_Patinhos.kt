package problems

import java.math.BigInteger
import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    eterno@ while (true) {
        val patos = ler.nextBigInteger()
        when (patos) {
            BigInteger.valueOf(-1) -> break@eterno
            BigInteger.ZERO -> println(0)
            else -> println(patos.minus(BigInteger.ONE))
        }
    }
}

/*
URI Online Judge | 2334
Patinhos
Por Hiago Oliveira de Jesus, UEA BR Brazil

Timelimit: 1
Cinco patinhos foram passear. Além das montanhas. Para brincar. A mamãe gritou: quá, quá, quá, quá. Mas só quatro patinhos voltaram de lá. Quatro patinhos foram passear. Além das montanhas. Para brincar. A mamãe gritou: quá, quá, quá, quá. Mas só três patinhos voltaram de lá. Três patinhos foram passear. Além das montanhas. Para brincar. A mamãe gritou: quá, quá, quá, quá. Mas só dois patinhos voltaram de lá. Dois patinhos foram passear. Além das montanhas. Para brincar. A mamãe gritou: quá, quá, quá, quá. Mas só um patinho voltou de lá. Um patinho foi passear. Além das montanhas. Para brincar. A mamãe gritou: quá, quá, quá, quá. Mas nenhum patinho voltou de lá.

A mamãe patinha ficou tão triste naquele dia que resolveu pedir sua ajuda para procurar além das montanhas, na beira do mar, quantos patinhos não voltaram de lá.

Entrada
Haverá vários casos de testes, a primeira linha de cada caso de teste contém um inteiro (0 ≤ P ≤ 1019) representando a quantidade total de patos, a entrada termina com P = -1.

Saída
O arquivo de saída deve conter a quantidade de patinhos que retornaram.

Exemplo de Entrada	Exemplo de Saída
0
1
10000000000000000000
-1

0
0
9999999999999999999
 */