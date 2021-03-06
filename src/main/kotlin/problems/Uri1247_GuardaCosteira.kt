package problems

import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNextInt()) {
        val distanciaInicial = ler.nextDouble()
        val velocidadeFugitivo = ler.nextDouble()
        val velocidadeGuarda = ler.nextDouble()

        var distancia = sqrt(distanciaInicial.pow(2) + 12.0.pow(2))

        if (distancia / velocidadeGuarda <= 12.0 / velocidadeFugitivo)
            println("S")
        else
            println("N")
    }
}

/*
URI Online Judge | 1247
Guarda Costeira
Maratona de Programação da SBC 2011  Brasil

Timelimit: 1
"Pega ladrão! Pega ladrão!" Roubaram a bolsa de uma inocente senhora que caminhava na praia da Nlogônia e o ladrão fugiu em direção ao mar. Seu plano parece obvio: ele pretende pegar um barco e escapar!

O fugitivo, que a essa altura já está a bordo de sua embarcação de fuga, pretende seguir perpendicularmente à costa em direção ao limite de aguas internacionais, que fica a 12 milhas náuticas de distância, onde estará são e salvo das autoridades locais. Seu barco consegue percorrer essa distância a uma velocidade constante de VF nós.

A Guarda Costeira pretende interceptá-lo, e sua embarcacão tem uma velocidade constante de VG nós. Supondo que ambas as embarcações partam da costa exatamente no mesmo instante, com uma distância de D milhas náuticas entre elas, será possível a Guarda Costeira alcançar o ladrão antes do limite de aguas internacionais?

Assuma que a costa da Nlogônia é perfeitamente retilínea e o mar bastante calmo, de forma a permitir uma trajetória tão retilínea quanto a costa.

Entrada
A entrada é composta por diversos casos de teste e termina com final de arquivo (EOF). Cada caso de teste é descrito em um linha contendo três inteiros, D (1 ≤ D ≤ 100), VF (1 ≤ VF ≤ 100) e VG (1 ≤ VG ≤ 100), indicando respectivamente a distância inicial entre o fugitivo e a Guarda Costeira, a velocidade da embarcação do fugitivo e a velocidade da embarcação da Guarda Costeira.

Saída
Para cada caso de teste imprima uma linha contendo ‘S’ se for possível que a Guarda Costeira alcance o fugitivo antes que ele ultrapasse o limite de águas internacionais ou ‘N’ caso contrário.

Exemplo de Entrada	Exemplo de Saída
5 1 12
12 10 7
12 9 10
10 5 5
9 12 15

S
N
N
N
S

Maratona de Programação da SBC 2011
 */