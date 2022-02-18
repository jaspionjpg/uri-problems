package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNext()) {
        val sentenca = ler.next()

        val r = sentenca[0]
        val l = sentenca[2]
        val j = sentenca[4]

        if (!r.isDigit())
            println(j.toInt() - l.toInt())
        else if (!l.isDigit())
            println(j.toInt() - r.toInt())
        else println(r.toInt() + l.toInt() - '0'.toInt() * 2)
    }
}