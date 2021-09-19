package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val x: Float = input.nextFloat()
    val y: Float = input.nextFloat()
    if (x.toDouble() == 0.0 && y.toDouble() == 0.0) {
        println("Origem")
    } else if (x.toDouble() == 0.0 && y.toDouble() != 0.0) {
        println("Eixo Y")
    } else if (y.toDouble() == 0.0 && x.toDouble() != 0.0) {
        println("Eixo X")
    } else if (x > 0.0 && y > 0.0) {
        println("Q1")
    } else if (x < 0.0 && y < 0.0) {
        println("Q3")
    } else if (x < 0.0 && y > 0.0) {
        println("Q2")
    } else {
        println("Q4")
    }
}

/*
URI Online Judge | 1041
Coordenadas de um Ponto
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).



Se o ponto estiver na origem, escreva a mensagem “Origem”.

Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

Entrada
A entrada contem as coordenadas de um ponto.

Saída
A saída deve apresentar o quadrante em que o ponto se encontra.

Exemplo de Entrada	Exemplo de Saída
4.5 -2.2

Q4

0.1 0.1

Q1

0.0 0.0

Origem
 */