package problems

import kotlin.math.pow

fun main(args: Array<String>) {
    var total = 0.0
    for (i in 3..39 step 2) {
        val somaAtual = i.toDouble() / 2.0.pow(i / 2)
        total += somaAtual
    }
    println("%.2f".format(1 + total))
}

/*
URI Online Judge | 1156
Sequência S II
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?

Entrada
Não há nenhuma entrada neste problema.

Saída
A saída contém um valor correspondente ao valor de S.
O valor deve ser impresso com dois dígitos após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
Agradecimentos a Cassio F.
 */