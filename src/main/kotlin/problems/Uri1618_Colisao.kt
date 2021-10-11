package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val testes = ler.nextInt()
    for (teste in 1..testes) {
        val quadrado = Array(4) { ler.nextInt() to ler.nextInt() }
        val robo = ler.nextInt() to ler.nextInt()

        if (robo.second <= quadrado[2].second &&
            robo.second >= quadrado[0].second &&
            robo.first >= quadrado[0].first &&
            robo.first <= quadrado[2].first
        ) println(1)
        else println(0)
    }
}

/*
URI Online Judge | 1618
Colisão
Por Jony Teixeira de Melo, Centro Universitário do Triângulo BR Brazil

Timelimit: 1
Você recebeu a missão de verificar se o robô invadiu uma área retangular formada por quatro pontos cardeais (A,B,C e D). Serão informados os quatro pontos de um plano cardeal conforme a figura. A área será formada pela ligação dos quatro pontos da seguinte forma A-B, B-C, C-D e D-A. Será informado ainda a coordenada X,Y do robô.



Entrada
A entrada é composta de vários casos de testes. A primeira linha é formada por um número N indicando o total de casos de testes. As próximas N linhas são constituídas por 10 números inteiros (Ax, Ay, Bx, By, Cx, Cy, Dx, Dy, RX, RY) representando cada um dos vértices A, B, C e D e pela posição X, Y do robô. Cada valor é separado por um espaço em branco.

Saída
A saída deverá imprimir para cada caso de testes o número 1, se o robô estiver dentro da área (considerar as bordas da figura como parte da área da figura), e imprimir o número 0 caso contrário.

Exemplo de Entrada	Exemplo de Saída
5

3 6 6 6 6 5 3 5 5 4

1 1 7 1 7 7 1 7 4 2

1 4 7 4 7 6 1 6 5 5

6 2 9 2 9 6 6 6 1 7

4 3 9 3 9 5 4 5 10 7

0

1

1

0

0

XIV Contest Algar Telecom 2014
 */