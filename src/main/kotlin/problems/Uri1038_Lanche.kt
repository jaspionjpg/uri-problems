package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val cardapio = mapOf(1 to 4.0, 2 to 4.5, 3 to 5.0, 4 to 2.0, 5 to 1.5)

    val codigo = ler.nextInt()
    val quantidade = ler.nextInt()

    println("Total: R$ %.2f".format(cardapio[codigo]!! * quantidade))
}

/*
URI Online Judge | 1038
Lanche
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.



Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
3 2

Total: R$ 10.00

4 3

Total: R$ 6.00

2 3

Total: R$ 13.50
 */