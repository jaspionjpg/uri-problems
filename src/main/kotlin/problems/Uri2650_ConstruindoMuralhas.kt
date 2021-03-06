package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val (numeroTitas: Int, tamanho: Int) = ler.nextLine().split(" ").map { s -> s.toInt() }

    for (numeroTita in 0 until numeroTitas) {
        val tita = ler.nextLine().trim().split(" ")
        if (tita[tita.size - 1].toInt() > tamanho) {
            println(tita.joinToString(" ").substringBeforeLast(" "))
        }
    }
}

/*
URI Online Judge | 2650
Construindo Muralhas
Por Abner Samuel P. Palmeira, IFSULDEMINAS BR Brazil

Timelimit: 1
Após o titã colossal destruir a muralha Maria, a Tropa de Exploração resolveu construir uma nova muralha, essa muralha será tão resistente que nenhum titã poderá quebrá-la.

Porém se o titã for muito alto ele pode simplesmente passar por cima da muralha, pensando nisso a Tropa de Exploração contratou você para escrever um programa, que dado a altura da muralha que eles vão construir e o tamanho dos titãs que eles conhecem, responda quais titãs conseguirão passar por cima da muralha.

Um titã consegue passar por cima de uma muralha somente se ele for mais alto que a mesma.

Entrada
A primeira linha contém dois inteiros N (1 ≤ N ≤ 100) e W (1 ≤ W ≤ 1000) representando respectivamente quantos titãs a Tropa de Exploração conhece e o tamanho da muralha que eles pretendem construir.

Cada uma das N linhas seguintes contém uma string S (1 ≤ |S| ≤ 100) representando o nome do titã, seguida por um inteiro H (1 ≤ H ≤ 1000) representando a altura do titã. A string é composta por letras maiúsculas,minúsculas e espaços.

O nome de um titã nunca começa ou termina com espaço.

Saída
Seu programa deverá exibir quais titãs conseguirão passar por cima da muralha, os titãs devem ser exibidos na ordem que aparacem na entrada.

Exemplo de Entrada	Exemplo de Saída
3 50
Titan Colossal 60
Titan Encoracado 15
Titan Femea 14

Titan Colossal

Aquecimento OLIP 2017
 */