package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val numeroDeTestes = ler.nextInt()
    for (i in 1..numeroDeTestes) {
        val numeroDeAlunos = ler.nextInt()
        val listaNotas = ArrayList<Int>()
        val listaOrdenada = ArrayList<Int>()
        for (i in 1..numeroDeAlunos) {
            val numeroProva = ler.nextInt()
            listaNotas.add(numeroProva)
            listaOrdenada.add(numeroProva)
        }
        var alteracaoFila = 0
        listaOrdenada.sortedDescending().forEachIndexed { index, i ->
            if (listaNotas.get(index) == i)
                alteracaoFila++
        }
        println(alteracaoFila)
    }
}