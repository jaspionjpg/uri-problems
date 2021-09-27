package problems

import java.time.Duration
import java.time.LocalTime
import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (true) {
        val horaInicial = LocalTime.of(ler.nextInt(), ler.nextInt())
        val horaFinal = LocalTime.of(ler.nextInt(), ler.nextInt())
        if (horaFinal.toNanoOfDay() + horaInicial.toNanoOfDay() == 0L)
            break

        val minutos = Duration.between(horaInicial, horaFinal).toMinutes()

        if (minutos < 0)
            println(minutos + 1440)
        else println(minutos)
    }
}

/*
URI Online Judge | 1103
Alarme Despertador
Maratona de Programação da SBC  Brasil

Timelimit: 1
Daniela é enfermeira em um grande hospital, e tem os horários de trabalho muito variáveis. Para piorar, ela tem sono pesado, e uma grande dificuldade para acordar com relógios despertadores.

Recentemente ela ganhou de presente um relógio digital, com alarme com vários tons, e tem esperança que isso resolva o seu problema. No entanto, ela anda muito cansada e quer aproveitar cada momento de descanso. Por isso, carrega seu relógio digital despertador para todos os lugares, e sempre que tem um tempo de descanso procura dormir, programando o alarme despertador para a hora em que tem que acordar. No entanto, com tanta ansiedade para dormir, acaba tendo dificuldades para adormecer e aproveitar o descanso.

Um problema que a tem atormentado na hora de dormir é saber quantos minutos ela teria de sono se adormecesse imediatamente e acordasse somente quando o despertador tocasse. Mas ela realmente não é muito boa com números, e pediu sua ajuda para escrever um programa que, dada a hora corrente e a hora do alarme, determine o número de minutos que ela poderia dormir.

Entrada
A entrada contém vários casos de teste. Cada caso de teste é descrito em uma linha, contendo quatro números inteiros H  1 , M 1 , H2 e M 2, com H1:M1 representando a hora e minuto atuais, e H2:M2 representando a hora e minuto para os quais o alarme  despertador foi programado (0≤H1≤23, 0≤M1≤59, 0≤H2≤23, 0≤M2 ≤59).

O final da entrada é indicado por uma linha que contém apenas quatro zeros, separados por espaços em branco.

Saída
Para cada caso de teste da entrada seu programa deve imprimir uma linha, cada uma contendo um número inteiro, indicando o número de minutos que Daniela tem para dormir.

Sample Input	Sample Output
1 5 3 5
23 59 0 34
21 33 21 10
0 0 0 0

120
35
1417

Maratona de Programação da SBC 2009
 */