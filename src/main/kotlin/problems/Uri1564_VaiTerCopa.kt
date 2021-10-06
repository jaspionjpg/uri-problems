package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (ler.hasNextInt())
        if (ler.nextInt() > 0)
            println("vai ter duas!")
        else println("vai ter copa!")
}

/*
URI Online Judge | 1564
Vai Ter Copa?
Por Gabriel Dalalio, ITA BR Brazil

Timelimit: 1
O Brasil é o país sede da copa esse ano. Porém, há muitas pessoas protestando contra o governo. Em redes sociais é possível ver pessoas afirmando que não vai ter copa devido aos protestos.

Mas esses rumores de que não haverá copa são totalmente falsos, a presidente Dilma Roussef já avisou: vai ter copa sim, e se reclamar vai ter duas!

Entrada
A entrada contém vários casos de teste e termina com EOF. Cada caso de teste consiste de uma linha contendo o número N de reclamações sobre a copa encaminhadas para a presidente (0 ≤ N ≤ 100).

Saída
Para cada teste, a saída consiste de uma linha dizendo "vai ter copa!" caso não haja reclamações para a presidente. Caso haja reclamações, a saída deverá dizer "vai ter duas!".

Exemplo de Entrada	Exemplo de Saída
0

1

0

2

100

0

vai ter copa!

vai ter duas!

vai ter copa!

vai ter duas!

vai ter duas!

vai ter copa!

Contest Dalalio 2014
 */