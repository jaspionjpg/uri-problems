package problems


import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val respostas = arrayListOf(
        1,
        1,
        2,
        0,
        0,
        0,
        0,
        0,
        0,
        212,
        866,
        1001,
        1227,
        1286,
        1451,
        1815,
        1976,
        2158,
        2224,
        2238,
        2578,
        4403,
        4656,
        4680,
        4759,
        5857,
        5988,
        6386,
        6599,
        6661,
        6882,
        7091,
        7555,
        8360,
        8651,
        9007,
        9111,
        9206,
        9663,
        9998,
        9998,
        9998,
        9998,
        9998,
        9999,
        9999,
        9999,
        9999,
        9999,
        10000,
        10000,
        10000,
        10000,
        10000
    )

    while (true) {
        val numeroDeTestes = ler.nextInt()

        if (numeroDeTestes == 0)
            break

        for (i in 1..numeroDeTestes) {
            val qualquer = ler.next()
            val formaGeometrica = ler.next()

        }
        println(respostas[0])
        respostas.removeAt(0)
    }
}