package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val cartas: IntArray = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0)
        var sets = 0
        val numeroDeTestes = ler.nextInt()

        val diferentes = arrayOf(
            intArrayOf(4, 5, 7, 8),
            intArrayOf(3, 5, 6, 8),
            intArrayOf(3, 4, 6, 7),
            intArrayOf(1, 2, 7, 8),
            intArrayOf(0, 2, 6, 8),
            intArrayOf(0, 1, 6, 7),
            intArrayOf(1, 2, 4, 5),
            intArrayOf(0, 2, 3, 5),
            intArrayOf(0, 1, 3, 4)
        )

        /*
        c cc ccc
        t tt ttt
        q qq qqq
         */

        if (numeroDeTestes == 0)
            break

        for (i in 1..numeroDeTestes) {
            val numeroDaCartasString = ler.next()
            val numero = pegarNumero(numeroDaCartasString)
            val formaGeometrica = ler.next()

            val multForma = when {
                formaGeometrica.startsWith("circulo") -> 0
                formaGeometrica.startsWith("triangulo") -> 1
                formaGeometrica.startsWith("quadrado") -> 2
                else -> -1
            }
            val indice = numero + multForma * 3
            cartas[indice]++

            if (cartas[indice] > 2) {
                sets++
                cartas[indice] = 0
            } else if (cartas[numero] > 0 && cartas[numero + 3] > 0 && cartas[numero + 6] > 0) {
                sets++
                cartas[numero] -= 1
                cartas[numero + 3] -= 1
                cartas[numero + 6] -= 1
            } else if (cartas[multForma * 3 + 0] > 0 && cartas[multForma * 3 + 1] > 0 && cartas[multForma * 3 + 2] > 0) {
                sets++
                cartas[multForma * 3 + 0] -= 1
                cartas[multForma * 3 + 1] -= 1
                cartas[multForma * 3 + 2] -= 1
            } else if (cartas[diferentes[indice][1]] > 0 && cartas[diferentes[indice][2]] > 0) {
                sets++
                cartas[diferentes[indice][1]]--
                cartas[indice]--
                cartas[diferentes[indice][2]]--
            } else if (cartas[diferentes[indice][0]] > 0 && cartas[diferentes[indice][3]] > 0) {
                sets++
                cartas[diferentes[indice][0]]--
                cartas[indice]--
                cartas[diferentes[indice][3]]--
            }
        }

        println(sets)
    }
}

fun pegarNumero(valor: String) =
    when (valor) {
        "um" -> 0
        "dois" -> 1
        "tres" -> 2
        else -> -1
    }

/*
1
2
0
0
0
0
0
0
212
866
1001
1227
1286
1451
1815
1976
 */