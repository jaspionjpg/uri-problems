package problems

import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val tamanhosLados = DoubleArray(3) { ler.nextDouble() }.sortedDescending()

    val maior = tamanhosLados[0]
    val segundoMaior = tamanhosLados[1]
    val terceiroMaior = tamanhosLados[2]

    val aQuadrado = maior.pow(2)
    val bVezesC = segundoMaior.pow(2) + terceiroMaior.pow(2)

    if (maior >= segundoMaior + terceiroMaior)
        println("Invalido")
    else {
        if (maior == segundoMaior && segundoMaior == terceiroMaior)
            println("Valido-Equilatero")
        else if (maior == segundoMaior || segundoMaior == terceiroMaior || maior == terceiroMaior)
            println("Valido-Isoceles")
        else
            println("Valido-Escaleno")
        println("Retangulo: ${if (aQuadrado == bVezesC) "S" else "N"}")
    }
}

/*
URI Online Judge | 2313
Qual Triângulo
Por Alexandre A. Melo, IFSC BR Brazil

Timelimit: 1
Dados três valores, verifique se os três podem formar um triângulo. Em caso afirmativo, verifique se ele é escaleno, isóceles ou equilátero e se trata-se de um triângulo retângulo ou não.

Entrada
A entrada consiste em três números inteiros A,B e C (0 < A,B,C < 105).

Saída
A saída deve conter a string "Invalido" se os valores lidos não formarem um triângulo. Se os valores formarem um triângulo a saída deve ser "Valido-Equilatero", "Valido-Escaleno" ou "Valido-Isoceles" de acordo com a característica do triângulo seguido de "Retangulo: S" se o triângulo for retângulo ou "Retangulo: N" se não for, conforme os exemplos.

Exemplos de Entrada	Exemplos de Saída
4 6 2

Invalido

4 3 3

Valido-Isoceles
Retangulo: N

3 4 5

Valido-Escaleno
Retangulo: S
 */