package problems

import java.time.LocalTime
import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val horainicio = LocalTime.of(ler.nextInt(), ler.nextInt())
    val horafim = LocalTime.of(ler.nextInt(), ler.nextInt())

    horainicio.isBefore(horafim)

    val diferenca = horafim.minusMinutes(horainicio.minute + horainicio.hour * 60L)

    if (horainicio.toNanoOfDay() == horafim.toNanoOfDay())
        println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)")
    else
        println("O JOGO DUROU ${diferenca.hour} HORA(S) E ${diferenca.minute} MINUTO(S)")
}