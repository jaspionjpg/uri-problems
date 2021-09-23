package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()
    for (i in 0 until testes) {
        val diferenca = ler.nextInt()
        if (diferenca < 2015)
            println("${2015 - diferenca} D.C.")
        else
            println("${diferenca - 2014} A.C.")
    }
}

/*
URI Online Judge | 1962
Há Muito, Muito Tempo Atrás
Por M.C. Pinto, UNILA BR Brazil

Timelimit: 1
Raul Seixas cantava que nasceu há 10 mil anos atrás e não tinha nada nesse mundo que ele não sabia demais. Os Mamomas Assassinas cantavam que mais de 10 mil anos "se passaram-se" [sic] quando eles repetiram a 5a série. Tantos eventos passados e o professor MC ficou curioso para saber em que ano tudo isso aconteceu.

Você deve escrever um programa que, dada uma série de número de anos transcorridos, mostre, para cada número, em que ano o evento aconteceu. Lembre-se de indicar se ele aconteceu A.C. (Antes de Cristo) ou D.C. (Depois de Cristo).

Entrada
A entrada tem várias linhas. A primeira tem um inteiro positivo N (1 ≤ N ≤ 100000). A seguir existem N linhas. Cada uma dessas N linhas tem um único inteiro não negativo T, que indica o número de anos transcorridos até 2015 D.C. (0 ≤ T < 231).

Saída
A saída tem N linhas. Em cada uma, deve ser indicado o ano A em que o correspondente tempo T aconteceu. Veja o exemplo de saída.

Exemplo de Entrada	Exemplo de Saída
3
10000
15
2015

7986 A.C.
2000 D.C.
1 A.C.

Prova 1 de Programação de Computadores da UNILA (2015/2)
 */