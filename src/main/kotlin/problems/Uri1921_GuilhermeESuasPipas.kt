package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val ladosDaPipa = ler.nextLong()
    println(ladosDaPipa * (ladosDaPipa - 3) / 2)
}

/*
URI Online Judge | 1921
Guilherme e Suas Pipas
Por Gustavo Ribeiro, IFPB - Campina Grande BR Brazil

Timelimit: 1
Guilherme adora brincar com pipas, pipas de várias cores, formas e tamanhos. Ele tem percebido que para as pipas possuírem maior estabilidade, e dessa forma voarem mais alto, elas devem possuir um barbante bem esticado ligando todos os pares de pontas não vizinhas.

Apesar de ser uma criança bastante criativa e astuta, Guilherme não sabe como determinar a quantidade de barbantes que ele terá que utilizar para tornar uma pipa de n lados, estável. Você pode ajudá-lo?.

Entrada
A entrada será composta por uma única linha, que contém um inteiro 3 ≤ n ≤ 105, representando o número de lados da pipa.

Saída
Imprima um número inteiro, que será a quantidade de barbantes que Guilherme terá que utilizar para tornar a pipa de n lados estável.

Exemplos de Entrada	Exemplos de Saída
Entrada
4
Saida
2
Entrada
10
Saida
35
Entrada
11
Saida
44

Homenagem ao meu irmão Guilherme, ele adora pipas.
Tapioca's Round I, 2015
 */