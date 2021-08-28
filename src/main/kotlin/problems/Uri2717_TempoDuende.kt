package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val tempoExpediente = ler.nextInt()
    val tempo1Presente = ler.nextInt()
    val tempo2Presente = ler.nextInt()
    val tempoTotalPresentes = tempo1Presente + tempo2Presente
    if (tempoExpediente >= tempoTotalPresentes)
        println("Farei hoje!")
    else
        println("Deixa para amanha!")
}