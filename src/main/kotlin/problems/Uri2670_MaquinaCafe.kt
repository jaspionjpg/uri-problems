package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val numero1Andar = ler.nextInt()
    val numero2Andar = ler.nextInt()
    val numero3Andar = ler.nextInt()

    val tempo1Andar = numero2Andar * 2 + numero3Andar * 4
    val tempo2Andar = numero1Andar * 2 + numero3Andar * 2
    val tempo3Andar = numero1Andar * 4 + numero2Andar * 2
    val menorTempo = when {
        tempo1Andar < tempo2Andar && tempo1Andar < tempo3Andar -> tempo1Andar
        tempo2Andar < tempo3Andar -> tempo2Andar
        else -> tempo3Andar
    }
    println(menorTempo)

}