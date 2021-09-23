package problems

import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes: Int = ler.nextInt()
    for (i in 0 until testes) {
        val x = ler.nextDouble()
        val y = ler.nextDouble()

        val resultadoRafael = (3 * x).pow(2) + y.pow(2)
        val resultadoBeto = 2 * x.pow(2) + (5 * y).pow(2)
        val resultadoCarlos = -100 * x + y.pow(3)

        if (resultadoRafael > resultadoBeto && resultadoRafael > resultadoCarlos) {
            println("Rafael ganhou")
        } else if (resultadoBeto > resultadoRafael && resultadoBeto > resultadoCarlos) {
            println("Beto ganhou")
        } else {
            println("Carlos ganhou")
        }
    }
}

/*
URI Online Judge | 1555
Funções
Por Cristhian Bonilha, UTFPR BR Brazil

Timelimit: 1
Na última aula de matemática, Rafael, Beto e Carlos aprenderam algumas novas funções matemáticas. Cada um deles se identificou com uma função em especial, e resolveram competir para ver quem tinha a função de maior resultado.

A função que Rafael escolheu é r(x, y) = (3x)² + y².

Já Beto escolheu a função b(x, y) = 2(x²) + (5y)².

Carlos, por sua vez, escolheu a função c(x, y) = -100x + y³.

Dados os valores x e y, diga quem escolheu a função com o maior resultado.

Entrada
A primeira linha de entrada contém um inteiro N que determina a quantidade de casos de teste. Cada caso de teste consiste em dois inteiros x e y (1 ≤ x, y ≤ 100), indicando as variáveis a serem inseridas na função.

Saída
Para cada caso de teste imprima uma linha, contendo uma frase, indicando quem ganhou a competição. Por exemplo, se Rafael ganhar a competição, imprima “Rafael ganhou”. Assuma que nunca haverá empates.

Exemplo de Entrada	Exemplo de Saída
6
5 3
2 30
2 100
30 20
15 5
30 2

Beto ganhou
Carlos ganhou
Carlos ganhou
Beto ganhou
Rafael ganhou
Rafael ganhou
 */