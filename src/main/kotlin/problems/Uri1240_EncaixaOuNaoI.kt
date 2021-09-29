package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()

    for (teste in 1..testes) {
        val numeroCompleto = ler.next()
        val numero = ler.next()
        if (numeroCompleto.endsWith(numero))
            println("encaixa")
        else println("nao encaixa")
    }
}
/*
URI Online Judge | 1240
Encaixa ou Não I
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Paulinho tem em suas mãos um pequeno problema. A professora lhe pediu que ele construísse um programa para verificar, à partir de dois valores inteiros A e B, se B corresponde aos últimos dígitos de A.

Entrada
A entrada consiste de vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Cada caso de teste consiste de dois inteiros A (1 ≤ A < 231 ) e B (1 ≤ B < 231) positivos.

Saída
Para cada caso de entrada imprima uma mensagem indicando se o segundo valor encaixa no primeiro valor, confome exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
4
5678690 78690
5434554 543
1243 1243
54 654

encaixa
nao encaixa
encaixa
nao encaixa
 */