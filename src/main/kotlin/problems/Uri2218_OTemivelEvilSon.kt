package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val testes = ler.nextInt()
    for (i in 0 until testes) {
        val numeroRetas = ler.nextInt()

        var soma = 0
        for (n in 0..numeroRetas - 2)
            soma += n

        val regioesFormadas = 2 * numeroRetas + soma

        println(regioesFormadas)
    }
}
/*
2 * 1
2 * 2
2 * 3 + 1
2 * 4 + 3
2 * 5 + 6
2 * 6 + 10
2 * 7 + 15
*
 */
/*
2       1
4       2
7       3
11      4
16      5
22      6
29
37
46
56
 */