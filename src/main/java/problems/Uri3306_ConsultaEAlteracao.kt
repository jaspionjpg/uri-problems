package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val tamanhoVetor = ler.nextInt()
    val quantidadeQueries = ler.nextInt()

    val vetor = IntArray(tamanhoVetor)
    for (i in 0 until tamanhoVetor)
        vetor[i] = ler.nextInt()

    for (i in 0 until quantidadeQueries) {
        val tipoConsulta = ler.nextInt()

        val a = ler.nextInt()
        val b = ler.nextInt()

        if (tipoConsulta == 1) {
            val v = ler.nextInt()

            for (i in a..b) {
                vetor[i - 1] += v
            }
        } else {
            println(minimoMultiploComum(vetor, a, b))
        }
    }
}

fun minimoMultiploComum(vetor: IntArray, inicio: Int, fim: Int): Int {
    val vetorAComparar = vetor.copyOfRange(inicio - 1, fim)
    var maximosMultiplos = 1
    var minimoMultiploComum = 2
    eterno@ while (true) {
        var achouMultiplo = false
        var todosMultiplos = true

        for (indice in vetorAComparar.indices) {
            if (vetorAComparar[indice] == 1)
                break@eterno
            if (vetorAComparar[indice] % minimoMultiploComum == 0) {
                achouMultiplo = true
                vetorAComparar[indice] /= minimoMultiploComum
            } else
                todosMultiplos = false
        }
        if (!achouMultiplo)
            minimoMultiploComum++
        if (todosMultiplos)
            maximosMultiplos *= minimoMultiploComum
    }
    return maximosMultiplos
}
/*

URI Online Judge | 3306
Consulta e Alteração
Por Abner Samuel P. Palmeira, Instituto Federal do Sul de Minas Gerais BR Brazil

Timelimit: 1
Dado um vetor com N elementos responda Q queries dos tipos:

1 A B V: Somar V em todos os elementos da posição A até a posição B do vetor.

2 A B: Retorna o Máximo Divisor Comum de todos os elementos das posições A até B no vetor

Entrada
A entrada consiste em diversos casos de teste. A primeira linha de cada caso de teste contém dois inteiros N Q, representando respectivamente o tamanho do vetor e a quantidade de queries. A segunda linha da entrada contém N inteiros representando os elementos do vetor. As próximas Q linhas contém as queries como descrito anteriormente.

Limites:

1 ≤ N; Q ≤ 105

Saída
Para cada query do tipo dois imprima o MDC de todas as posições do vetor que estão no intervalo AB

Exemplos de Entrada	Exemplos de Saída
7 4
1 8 4 16 6 13 20
2 2 4
2 5 7
1 5 7 1
2 5 7

4
1
7

5 1
4 6 8 10 12
2 1 5

2

11ª Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2021

 */