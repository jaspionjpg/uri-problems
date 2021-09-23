package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val engenhariaDeProducao = "EPR"
    val engenhariaHidrica = "EHD"
    val intruso = "INTRUSOS"

    while (ler.hasNext()) {
        val alunos = ler.nextInt()
        var producoes = 0
        var hidricos = 0
        var intrusos = 0

        for (aluno in 0 until alunos) {
            val matricula = ler.nextInt()
            val curso = ler.next()

            when (curso) {
                engenhariaDeProducao -> producoes++
                engenhariaHidrica -> hidricos++
                else -> intrusos++
            }
        }
        println("$engenhariaDeProducao: $producoes")
        println("$engenhariaHidrica: $hidricos")
        println("$intruso: $intrusos")
    }
}