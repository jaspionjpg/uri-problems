package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numero = ler.nextDouble()
    if (numero < 0.0)
        println("Fora de intervalo")
    else if (numero <= 25.0)
        println("Intervalo [0,25]")
    else if (numero <= 50.0)
        println("Intervalo (25,50]")
    else if (numero <= 75.0)
        println("Intervalo (50,75]")
    else if (numero <= 100.0)
        println("Intervalo (75,100]")
    else
        println("Fora de intervalo")
}

/*
URI Online Judge | 1037
Intervalo
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

Entrada
O arquivo de entrada contém um número com ponto flutuante qualquer.

Saída
A saída deve ser uma mensagem conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
25.01

Intervalo (25,50]

25.00

Intervalo [0,25]

100.00

Intervalo (75,100]

-25.02

Fora de intervalo
 */