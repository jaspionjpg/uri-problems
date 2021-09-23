package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val n: Int = ler.nextInt()
    for (i in 0 until n) {
        val j: Int = ler.nextInt()
        val k: Int = ler.nextInt()
        println("${k * j / 2} cm2")
    }
}

/*
URI Online Judge | 1585
Fazendo Pandorgas
Por Neilor Tonin, URI BR Brasil

Timelimit: 1
Anastácia adora construir pipas (ou pandorgas) para seus amigos. Pedro, que sabe disso, separou vários retalhos de bambus da fábrica de móveis de seu tio que seriam descartados para dar a Anastácia. Ao entregar os bambus à Anastácia, Pedro perguntou a ela qual era a maior pipa que poderia ser construída com aqueles retalhos de bambus. Anastácia, então, que não é muito boa em calcular, quer que você a ajude nesta tarefa.

Obs.: Cada pipa é construída com dois pedaços de bambus amarrados em forma de cruz, formando um losango.

Entrada
A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de pipas que serão construídas. Cada uma das N linhas a seguir contém dois valores inteiros x (10 ≤ x ≤ 100) e y (10 ≤ y ≤ 100) que indicam o tamanho dos dois bambus utilizados para construir a pipa.

Saída
Para cada caso de teste de entrada, imprima um valor inteiro (desconsiderando a parte decimal) correspondente a àrea da pipa criada, em cm2, seguido de um espaço e do texto "cm2", sem as aspas.

Exemplo de Entrada	Exemplo de Saída
4
10 20
20 14
10 100
100 100

100 cm2
140 cm2
500 cm2
5000 cm2

Agradecimentos a Michele S.
Aquecimento para a OBI 2014
 */