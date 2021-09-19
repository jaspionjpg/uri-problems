package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var segundos = ler.nextLong()

    val horas = segundos / 3600
    segundos -= horas * 3600
    val minutos = segundos / 60
    segundos -= minutos * 60

    println("$horas:$minutos:$segundos")
}

/*

URI Online Judge | 1019
Conversão de Tempo
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

Exemplo de Entrada	Exemplo de Saída
556

0:9:16

1

0:0:1

140153

38:55:53
 */