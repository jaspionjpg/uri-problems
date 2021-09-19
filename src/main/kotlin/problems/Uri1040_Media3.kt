package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val n1 = ler.nextDouble() * 2
    val n2 = ler.nextDouble() * 3
    val n3 = ler.nextDouble() * 4
    val n4 = ler.nextDouble()
    var media = (n1 + n2 + n3 + n4) / 10
    println("Media: %.1f".format(media))
    if (media >= 7.0)
        println("Aluno aprovado.")
    else if (media < 5.0)
        println("Aluno reprovado.")
    else {
        println("Aluno em exame.")
        val exame = ler.nextDouble()
        println("Nota do exame: %.1f".format(exame))
        media = (media + exame) / 2
        if (media >= 5.0) {
            println("Aluno aprovado.")
        } else {
            println("Aluno reprovado.")
        }
        println("Media final: %.1f".format(media))
    }
}
