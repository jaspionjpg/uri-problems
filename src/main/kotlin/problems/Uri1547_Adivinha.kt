package problems

import java.util.Scanner
import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()
    for (teste in 1..testes) {
        val numalunos = ler.nextInt()
        val numeroSorteado = ler.nextInt()

        val numeros = IntArray(numalunos) { ler.nextInt() }

        var indiceMaisProximo = Int.MIN_VALUE
        var numeroMaisProxmo = Int.MAX_VALUE

        for (aluno in 0 until numalunos) {
            val diferenca = (numeros[aluno] - numeroSorteado).absoluteValue
            if ((numeros[aluno] - numeroSorteado).absoluteValue < numeroMaisProxmo) {
                numeroMaisProxmo = diferenca
                indiceMaisProximo = aluno
            }
        }
        println(indiceMaisProximo + 1)
    }
}

/*
URI Online Judge | 1547
Adivinha
Por Neilor Tonin, URI BR Brazil

Timelimit: 1
O professor Genesio recebeu várias camisetas da OBI (Organização dos Bacharéis Intelectuais) para doar a seus alunos de Ciência da Computação. Para fazer a distribuição destas camisetas ele organizou os alunos de cada turma do curso em pequenos grupos (de no máximo 10 pessoas) e definiu que faria o sorteio de uma camiseta para cada um dos grupos. Como Genesio não quer perder muito tempo com este sorteio, ele pediu que você o ajudasse com um programa que determinasse quem foi o aluno ganhador de acordo com a seguinte regra: O primeiro de cada grupo a acertar um número escolhido pelo professor obviamente ganha a camiseta, mas se ninguém acertar este número, ganha a camiseta o primeiro que chegar o mais próximo deste número.

Não faz diferença quem do grupo o professor escolhe para tentar iniciar a adivinhação. Este sempre será o aluno número 1, e assim sucessivamente.

Entrada
A primeira linha de entrada contém um inteiro N que determina a quantidade de casos de teste, ou de camisetas que serão sorteadas. Cada caso de teste é composto por duas linhas. A primeira linha contém dois valores inteiros QT (4 ≤ QT ≤ 10) e S (1 ≤ S ≤ 100) separados por um espaço, que indicam respectivamente a quantidade de alunos do grupo e o número secreto que deve ser adivinhado. A segunda linha contém cada um dos QT valores, separados por um espaço.

Saída
Para cada caso de teste, seu programa deve imprimir um número inteiro que indica a posição do ganhador da camiseta, conforme as regras descritas acima.

Exemplo de Entrada	Exemplo de Saída
3
7 35
8 26 30 43 36 17 7
4 16
12 16 3 16
10 48
3 7 27 9 50 49 16 47 63 1

5
2
6

Aquecimento para a OBI 2014
 */