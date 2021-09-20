package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numero1 = ler.nextInt()
    val numero2 = ler.nextInt()

    val maior: Int
    val menor: Int
    if (numero1 < numero2) {
        maior = numero1 + 1
        menor = numero2
    } else {
        maior = numero2 + 1
        menor = numero1
    }

    var resultado = 0
    for (i in maior until menor) {
        if (i % 2 != 0) {
            resultado += i
        }
    }
    println(resultado)
}

/*
URI Online Judge | 1071
Soma de Impares Consecutivos I
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.

Exemplo de Entrada	Exemplo de Saída
6
-5

5

15
12

13

12
12

0
 */