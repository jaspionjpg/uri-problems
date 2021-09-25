package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val a = ler.nextDouble()
    val b = ler.nextDouble()
    val c = ler.nextDouble()

    if (a < b + c && b < a + c && c < a + b)
        println("Perimetro = %.1f".format(a + b + c))
    else
        println("Area = %.1f".format(c * (a + b) / 2))
}

/*
URI Online Judge | 1043
Triângulo
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:


Perimetro = XX.X


Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem


Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.

Exemplo de Entrada	Exemplo de Saída
6.0 4.0 2.0

Area = 10.0

6.0 4.0 2.1

Perimetro = 12.1
 */