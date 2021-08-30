package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val porcaoCurupira = ler.nextInt()
    val porcaoBoitata = ler.nextInt()
    val porcaoBoto = ler.nextInt()
    val porcaoMapinguari = ler.nextInt()
    val porcaoLara = ler.nextInt()

    var valorTotal = 0

    valorTotal += porcaoCurupira * 300
    valorTotal += porcaoBoitata * 1500
    valorTotal += porcaoBoto * 600
    valorTotal += porcaoMapinguari * 1000
    valorTotal += porcaoLara * 150

    println(valorTotal + 225)
}

/*
URI Online Judge | 2936
Quanta Mandioca?
Por Felipe C. Ochial, URI BR Brazil

Timelimit: 1
Todo ano em abril reúnem-se na casa da dona Chica o Curupira, Boitatá, o Boto cor de rosa (esse em sua forma de homem, já que assim dona chica gosta mais), o Mapinguari e a Iara para se lembrar de seus momentos com Mani, a bela menina de pele branca. E como não poderia ser diferente o prato principal dessa reunião é a mandioca. Cada um deles come de uma a dez porções de mandioca e eles sempre avisam dona Chica com antecedência a respeito de quantas porções irão comer nesse dia. O tamanho da porção de cada um é diferente, mas sempre são os mesmos. As porções são as seguintes (em gramas):

O Curupira come 300

O Boitatá come 1500

O Boto come 600

O Mapinguari 1000

A Iara come 150

Dona chica por sua vez sempre come 225 gramas de mandioca. Cansada de todo ano ter que calcular quanta mandioca preparar ela contactou você para escrever um programa que informe quanta mandioca deve ser preparada em gramas.

Entrada
A entrada consiste de 5 inteiros cada um representando as porções que os convidados de dona Chica vão consumir. O primeiro inteiro representa as porções do Curupira, o segundo do Boitatá, o terceiro do Boto, o quarto do Mapinguari e o quinto a da Iara.

Saída
A saída consiste de um único inteiro que representa quanta mandioca dona Chica deve preparar em gramas. Não esqueça da quebra de linha após a resposta :).

Exemplos de Entrada	Exemplos de Saída
1
1
1
1
1

3775

2
2
2
2
2

7325

III Maratona do Norte
 */