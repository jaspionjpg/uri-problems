package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    var dias = ler.nextLine().toInt()

    var somaGastos = 0.0
    var somaKilos = 0.0

    for (dia in 1..dias) {
        val valorGasto = ler.nextLine().toDouble()
        val numeroDeFrutas = ler.nextLine().split(" ").size

        somaGastos += valorGasto
        somaKilos += numeroDeFrutas

        println("day $dia: $numeroDeFrutas kg")
    }

    println("%.2f kg by day".format(somaKilos / dias))
    println("R$ %.2f by day".format(somaGastos / dias))
}

/*
URI Online Judge | 1217
Getline Two - Frutas
Por Neilor Tonin, URI  Brasil

Timelimit: 1
Dona Parcinova, mãe de Mangojata, pediu a ela que ajudasse a calcular o consumo de frutas da casa e a quantidade gasta por dia nestas frutas. Mangojata agora deve então fazer um programa a partir de uma tabela que sua mãe estava utilizando para anotações há quase um ano. Nesta tabela, dona Parcinova anotou a quantidade de dias e depois o valor gasto cada dia e as frutas compradas naquele dia, sempre na quantidade de um KG por tipo de fruta.

Entrada
A primeira linha de entrada contém um inteiro N (1 ≤ N ≤ 365) que indica o número de casos de teste que vem a seguir. Cada caso de teste é composto por 2 linhas. A primeira linha contém um valor de ponto flutuante V (0.10 ≤ V ≤ 20.00) indicando o valor gasto no dia e a segunda linha contém o nome de cada uma das frutas que dona Parcinova comprou.

Saída
Para cada caso de teste, imprima quantos kg de frutas dona Parcinova comprou em cada dia, com mensagem correspondente em inglês, conforme exemplo abaixo. No final, apresente o consumo médio em kg por dia com 2 casas decimais seguido da mensagem correspondente e a média de gasto por dia com as frutas, também em inglês e com mensagem correspondente, conforme o exemplo abaixo.

Obs.: Todas as letras da saída devem ser impressas em minúsculas, com exceção do "R" de "R$"

Exemplo de Entrada	Exemplo de Saída
3
9.58
Mamao Maca Melao
2.65
Melancia
9.54
Pera Uva Goiaba

day 1: 3 kg
day 2: 1 kg
day 3: 3 kg
2.33 kg by day
R$ 7.26 by day
 */