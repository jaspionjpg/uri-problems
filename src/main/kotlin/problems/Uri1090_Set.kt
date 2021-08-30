package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val cartas: IntArray = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0)
        var sets = 0
        val numeroDeTestes = ler.nextInt()
        if (numeroDeTestes == 0)
            break

        for (i in 1..numeroDeTestes) {
            val numeroDaCartas = ler.next()
            val formaGeometrica = ler.next()

            val multForma = when {
                formaGeometrica.startsWith("circulo") -> 0
                formaGeometrica.startsWith("triangulo") -> 1
                formaGeometrica.startsWith("quadrado") -> 2
                else -> -1
            }
            val indice = getNumero(numeroDaCartas) + multForma * 3
            cartas[indice]++
        }

        /*
        c cc ccc
        t tt ttt
        q qq qqq
         */

        // verifica mesmas formas, numeros diferentes
//        for (i in 0..2) {
//            val menorValor = Math.min(Math.min(cartas[i * 3 + 0], cartas[i * 3 + 1]), cartas[i * 3 + 2])
//            sets += menorValor
//            if (menorValor > 0) {
//                cartas[i * 3 + 0] -= menorValor
//                cartas[i * 3 + 1] -= menorValor
//                cartas[i * 3 + 2] -= menorValor
//            }
//        }
//
        // verifica iguais
        for (i in cartas.indices) {
            if (cartas[i] > 2) {
                sets += cartas[i] / 3
                cartas[i] = cartas[i] % 3
            }
        }

        // verifica diferente formas, numeros iguais
        for (i in 0..2) {
            val menorValor = Math.min(Math.min(cartas[i], cartas[i + 3]), cartas[i + 6])
            sets += menorValor
            if (menorValor > 0) {
                cartas[i] = cartas[i] - menorValor
                cartas[i + 3] = cartas[i + 3] - menorValor
                cartas[i + 6] = cartas[i + 6] - menorValor
            }
        }


        println(sets)
    }
}

fun getNumero(valor: String) =
    when (valor) {
        "um" -> 0
        "dois" -> 1
        "tres" -> 2
        else -> -1
    }