package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val codigo = ler.next()

    val quantidadeDe1ns = codigo.chars().filter { it -> it.toChar() == '1' }.count()

    val charParaAdicionarNoFinal = if ((quantidadeDe1ns % 2) == 0L) 0 else 1

    println(codigo + charParaAdicionarNoFinal)
}