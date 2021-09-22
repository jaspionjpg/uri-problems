package problems

import java.math.RoundingMode
import java.util.Scanner;

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes: Int = ler.nextInt()
    for (i in 0 until testes) {
        val pessoasNaTurma: Int = ler.nextInt()
        val mediasAlunos = IntArray(pessoasNaTurma)

        for (pessoaTurma in 0 until pessoasNaTurma)
            mediasAlunos[pessoaTurma] = ler.nextInt()

        val mediaGeral = mediasAlunos.average()
        val alunosAcimaDaMedia = mediasAlunos.count { mediasAlunos -> mediasAlunos > mediaGeral }

        val porcentagemAcimaDaMedia = alunosAcimaDaMedia.toDouble() * 100.0 / pessoasNaTurma.toDouble()
        println("${porcentagemAcimaDaMedia.toBigDecimal().setScale(3, RoundingMode.HALF_EVEN)}%")
    }
}

/*
URI Online Judge | 1214
Acima da Média
Por Gordon V. Cormack  Canada

Timelimit: 1
Sabe-se que 90% dos calouros tem sempre a expectativa de serem acima da média no início de suas graduações. Você deve checar a realidade para ver se isso procede.



Entrada
A entrada contém muitos casos de teste. A primeira linha da entrada contém um inteiro C, indicando o número de casos de teste. Seguem C casos de teste ou instâncias. Cada caso de teste inicia com um inteiro N, que é o número de pessoas de uma turma (1 ≤ N ≤ 1000). Seguem N inteiros, separados por espaços, cada um indicando a média final (um inteiro entre 0 e 100) de cada um dos estudantes desta turma.

Saída
Para cada caso de teste imprima uma linha dando o percentual de estudantes que estão acima da média da turma, com o valor arredondado e com 3 casas decimais.

Exemplo de Entrada	Exemplo de Saída
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91

40.000%
57.143%
33.333%
66.667%
55.556%
 */