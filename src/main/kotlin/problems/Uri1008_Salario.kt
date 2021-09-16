package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numf = ler.nextInt()
    val horas = ler.nextInt()
    val preco = ler.nextDouble()
    val salario = horas * preco
    println("NUMBER = $numf")
    println("SALARY = U$ ${String.format("%.2f", salario)}")
}
