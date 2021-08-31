package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeroDeTestes = ler.nextInt()

    for (i in 1..numeroDeTestes) {
        val numeroHastes = ler.nextInt()

        val hastes = IntArray(numeroHastes)

        var numeroBola = 1
        eterno@ while (true) {
            for (indiceHaste in 0 until numeroHastes) {
                if (hastes[indiceHaste] == 0) {
                    hastes[indiceHaste] = numeroBola
                    break
                }

                if (Math.sqrt(hastes[indiceHaste].toDouble() + numeroBola) % 1 == 0.0) {
                    hastes[indiceHaste] = numeroBola
                    break
                }

                if (indiceHaste == numeroHastes - 1) {
                    numeroBola--
                    break@eterno
                }
            }
            numeroBola++
        }

        println(numeroBola)
    }
}