package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeros = ler.nextInt()

    var consecutivos = 0
    var maiorConsecutivo = 0

    var valor = 0
    for (i in 1..numeros) {
        val numero = ler.nextInt()
        if (numero == valor)
            consecutivos++
        else {
            if (consecutivos > maiorConsecutivo)
                maiorConsecutivo = consecutivos
            consecutivos = 1
            valor = numero
        }
    }
    if (consecutivos > maiorConsecutivo)
        maiorConsecutivo = consecutivos
    println(maiorConsecutivo)
}

/*
URI Online Judge | 2415
Consecutivos
Por OBI - Olimpíada Brasileira de Informática 2012 BR Brazil

Timelimit: 1
Num sorteio que distribui prêmios, um participante inicialmente sorteia um inteiro N e depois N valores. O número de pontos do participante é o tamanho da maior sequência de valores consecutivos iguais. Por exemplo, suponhamos que um participante sorteia N = 11 e, nesta ordem, os valores

30, 30, 30, 30, 40, 40, 40, 40, 40, 30, 30

Então, o participante ganha 5 pontos, correspondentes aos 5 valores 40 consecutivos. Note que o participante sorteou 6 valores iguais a 30, mas nem todos são consecutivos.

Sua tarefa é ajudar a organização do evento, escrevendo um programa que determina o número de pontos de um participante.

Entrada
A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 104), o número de valores sorteados. A segunda linha contém N valores, V1, V2, . . . , VN , (−231 ≤ VI ≤ 231 − 1, para I = 1, 2, . . . , N) na ordem de sorteio, separados por um espaço em branco.

Saída
Seu programa deve imprimir apenas uma linha, contendo apenas um inteiro, indicando o número de pontos do participante.

Exemplos de Entrada	Exemplos de Saída
11

30 30 30 40 40 40 40 40 30 30 30

5

14

1 1 1 20 20 20 20 3 3 3 3 3 3 3

7

OBI - Olimpíada Brasileira de Informática 2012 Fase 1 Nível 1
 */