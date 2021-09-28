package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (true) {
        val qtDigitos = ler.nextInt()
        val qtApagar = ler.nextInt()
        if (qtDigitos + qtApagar == 0)
            break
        var numero = ler.next()
        var qtMaiorNumero = qtDigitos - qtApagar

        var premioFinal = ""
        for (indiceResultado in 1..qtMaiorNumero) {
            val (maiorNumero, indiceMaior) = pegarMaiorNumeroAntes(numero, qtMaiorNumero - indiceResultado)
            premioFinal += maiorNumero
            numero = numero.substring(indiceMaior + 1)
        }

        println(premioFinal)
    }
}

private fun pegarMaiorNumeroAntes(numeros: String, qtNumeros: Int): Pair<Int, Int> {
    var maiorNumero = 0
    var indiceMaior = 0
    for (indice in 0 until numeros.length - qtNumeros)
        if (numeros[indice] - '0' > maiorNumero) {
            maiorNumero = numeros[indice] - '0'
            indiceMaior = indice
        }
    return maiorNumero to indiceMaior
}

/*
URI Online Judge | 1084
Apagando e Ganhando
Por Fábio Dias Moreira  Brasil

Timelimit: 1
Juliano é fã do programa de auditório Apagando e Ganhando, um programa no qual os participantes são selecionados através de um sorteio e recebem prêmios em dinheiro por participarem.

No programa, o apresentador escreve um número de N dígitos em uma lousa. O participante então deve apagar exatamente D dígitos do número que está na lousa; o número formado pelos dígitos que restaram é então o prêmio do participante.

Juliano finalmente foi selecionado para participar do programa, e pediu que você escrevesse um programa que, dados o número que o apresentador escreveu na lousa, e quantos dígitos Juliano tem que apagar, determina o valor do maior prêmio que Juliano pode ganhar.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém dois inteiros N e D (1 ≤ D < N ≤ 105), indicando a quantidade de dígitos do número que o apresentador escreveu na lousa e quantos dígitos devem ser apagados. A linha seguinte contém o número escrito pelo apresentador, que não contém zeros à esquerda.

O final da entrada é indicado por uma linha que contém apenas dois zeros, separados por um espaço em branco.

Saída
Para cada caso de teste da entrada seu programa deve imprimir uma única linha na saída, contendo o maior prêmio que Juliano pode ganhar.

Exemplo de Entrada	Exemplo de Saída
4 2
3759
6 3
123123
7 4
1000000
7 3
1001234
6 2
103759
0 0

79
323
100
1234
3759

Maratona de Programação da SBC 2008.
 */