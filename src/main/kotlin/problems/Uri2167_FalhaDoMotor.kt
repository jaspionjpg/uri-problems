package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val medidasVelocidadeMotor = ler.nextInt()

    var numeroAnterior = 0
    var indiceQueda = 0
    for (indice in 1..medidasVelocidadeMotor) {
        val rotacoesPorMinuto = ler.nextInt()

        if (indiceQueda == 0) {
            if (rotacoesPorMinuto < numeroAnterior) {
                indiceQueda = indice
            }
            numeroAnterior = rotacoesPorMinuto
        }
    }
    println(indiceQueda)
}

/*
URI Online Judge | 2167
Falha do Motor
Por M.C. Pinto, UNILA BR Brazil

Timelimit: 1
Ao observar a curva de velocidade de um motor, o engenheiro Zé percebeu que sempre ocorria uma queda quando as medidas eram feitas em intervalos de 10 ms. Mas esta queda acontecia em medidas diferentes a cada novo teste do motor.

Zé ficou curioso com essa falta de padrão e quer saber, para cada teste do motor, qual a primeira medida em que ocorre uma queda de velocidade.

Entrada
A entrada é um teste do motor e é dada em duas linhas. A primeira tem o número N de medidas de velocidade do motor (1 < N ≤ 100). A segunda linha tem N inteiros: o número de RPM (rotações por minuto) Ri de cada medida (0 ≤ Ri ≤ 10000, para todo Ri, tal que 1 ≤ i ≤ N). Uma medida é considerada uma queda se é menor que a medida anterior.

Saída
A saída é o índice da medida em que houve a primeira queda de velocidade no teste. Caso não aconteça uma queda de velocidade a saída deve ser o número zero.

Exemplos de Entrada	Exemplos de Saída
3
1 4 2

3

5
100 199 199 198 0

4

4
1 2 2 2

0

Prova 2 (D2) de Programação de Computadores 2016/1 da UNILA
 */