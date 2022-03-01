package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var proximoAvistamento = ler.nextInt()
    var numeroPessoas = ler.nextInt()

    val anoite = 24 * 60

    val pessoas = Array(numeroPessoas) {
        val (hora, minuto) = ler.next().split(":").map { it.toInt() }
        hora * 60 + minuto to ler.next()
    }
    pessoas.sortBy { it.first }

    pessoas.filter { it.first >= anoite - proximoAvistamento }.forEach {
        println(it.second)
    }

    pessoas.filter { it.first <= proximoAvistamento }.forEach {
        println(it.second)
    }
    print("")
}

/*
beecrowd | 3149
A Noiva do Trevo
Por Gabriel Bianchin de Oliveira, IFSULDEMINAS/UNICAMP BR Brazil

Timelimit: 1
Existe uma famosa história na cidade de Muzambinho de uma noiva que aparece no trevo da entrada da cidade sempre próximo a meia noite.

Muitos moradores da cidade já relataram que viram a noiva, porém não existe um consenso de qual é o horário certo que ela aparece, principalmente porque todos dizem que viram "próximo a meia noite".

Toguro, um grande estudioso de eventos sobrenaturais, está tentando organizar os relatos dos moradores e verificar se houveram relatos verdadeiros.

Como um horário "próximo a meia noite" pode ser tanto alguns minutos antes quanto alguns minutos depois, Toguro pediu a sua ajuda para criar um algoritmo que dado o valor M de minutos para ser considerado antes e depois da meia noite, o nome do morador e o horário do suposto avistamento, mostrasse de forma ordenada pelo horário os avistamentos que podem ser catalogados como relatos verdadeiros.

Entrada
A primeira linha da entrada contém um inteiro P representando o valor próximo da meia noite para mais e para menos e um inteiro Q representando a quantidade de pessoas que relataram o avistamento.

Nas próximas Q linhas serão lidos duas strings H e N, indicando o horário do relato e o nome do morador, respectivamente.

Limites:

1 <= P <=  59;

1 <= Q <= 1000;

23:01 <= H <= 00:59

1 <= |N| <= 100;

Saída
A saída deverá ser o nome dos moradores que tiveram o relato como verdadeiro ordenados pelo horário que viram.

Obs: avistamentos antes da meia noite ocorreram primeiro que os avistamentos depois da meia noite. Em caso de avistamentos no mesmo horário a ordem de registro do avistamento deve ser considerada, ou seja, o avistamento que foi registrado primeiro deve aparecer primeiro, assim sucessivamente.

Exemplos de Entrada	Exemplos de Saída
15 5

23:44 Marcelo

00:11 Carlos

00:09 Ana

00:30 Nicolas

00:10 Bernardo

Ana

Bernardo

Carlos

10 5

23:44 Marcelo

00:10 Carlos

00:09 Bernardo

00:30 Nicolas

00:10 Ana

Bernardo

Carlos

Ana

10 5

23:50 Marcelo

00:11 Carlos

00:09 Bernardo

00:30 Nicolas

00:10 Ana

Marcelo

Bernardo

Ana

X Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2020
 */