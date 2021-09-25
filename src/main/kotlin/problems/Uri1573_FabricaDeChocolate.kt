package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (true) {
        val a = ler.nextDouble()
        val b = ler.nextDouble()
        val c = ler.nextDouble()
        if (a + b + c == 0.0)
            break
        println(Math.cbrt(a * b * c).toInt())
    }
}

/*
URI Online Judge | 1573
Fábrica de Chocolate
Por Gabriel Duarte, UNIFESO BR Brasil

Timelimit: 1
Uma fábrica produz barras de chocolates no formato de paralelepípedos e de cubos, com o mesmo volume. Porém, como a máquina que produz os chocolates em formato de cubo está apresentando alguns problemas, os donos da fábrica pediram a sua ajuda para resolver este problema.

Sua tarefa é, dadas as dimensões das arestas do chocolate em formato de paralelepípedo, dizer qual é o tamanho que a aresta em formato de cubo deve ter.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém três inteiros A, B e C (1 ≤ A, B, C ≤ 103), indicando os tamanhos das arestas do chocolate em formato de paralelepípedo. A entrada termina quando A = B = C = 0, e não deve ser processado.

Saída
Para cada entrada, você deve imprimir um único inteiro que deve ser truncado,representando o tamanho da aresta do chocolate em forma de cubo.

Exemplo de Entrada	Exemplo de Saída
170 867 253
452 378 368
5 6 7
2 4 5
0 0 0

334
397
5
3
 */