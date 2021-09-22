package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNextLine()) {
        val linha = ler.nextLine()
        var novaFrase = ""

        for (letra in linha)
            novaFrase += when (letra.code) {
                in 97..122 ->
                    if (letra.code + 13 > 122) (letra.code + 13 - 122 + 96).toChar()
                    else (letra.code + 13).toChar()
                in 65..90 ->
                    if (letra.code + 13 > 90) (letra.code + 13 - 90 + 64).toChar()
                    else (letra.code + 13).toChar()
                else -> letra
            }
        println(novaFrase)
    }
}