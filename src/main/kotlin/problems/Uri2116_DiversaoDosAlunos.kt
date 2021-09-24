package problems

import java.util.Scanner
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var numeroJuilherme = ler.nextInt()
    var numeroJogerio = ler.nextInt()

    for (i in numeroJuilherme downTo 2)
        if (ePrimo(i)) {
            numeroJuilherme = i
            break
        }


    for (i in numeroJogerio downTo 2)
        if (ePrimo(i)) {
            numeroJogerio = i
            break
        }

    println(numeroJogerio * numeroJuilherme)
}

private fun ePrimo(number: Int): Boolean {
    for (n in 2..sqrt(number.toDouble()).toInt()) {
        if (number % n == 0)
            return false
    }
    return true
}

/*
URI Online Judge | 2116
Diversão dos Alunos
Por Thiago Nepomuceno BR Brazil

Timelimit: 1
Juilherme e Jogério, gostam muito de jogos matemáticos. Juilherme acabou de criar mais um jogo matemático para eles se divertirem enquanto assistem essa competição online.

O jogo consiste nos seguintes passos:

1) Juilherme escolhe um número N e Jogério escolhe um número M.
2) Juilherme e Jogério devem então achar dois números primos P1 e P2, de tal forma que eles sejam o mais próximo possível do que numero N e M, respectivamente. Além disso P1 deve ser menor ou igual a N e P2 deve ser menor ou igual a M.
3) A resposta final do desafio é encontrar a multiplicacão de P1 e P2. Quem achar a resposta primeiro é o vencedor.

Como eles irão tentar achar a resposta o mais rápido possível, algumas vezes chegando a resultados incorretos, eles precisam de um programa que entregue a resposta final do jogo, para que possa ser comparada com a resposta encontrada por eles.

Usando as informacoes do jogo, faça um programa que dado os números N e M imprima o resultado final.
Entrada
A entrada do programa consiste de apenas uma linha com N e M (2 <= N, M <= 1000).

Saída
A saída do seu programa deve conter apenas uma linha informando a resposta final do jogo.

Exemplos de Entrada	Exemplos de Saída
10 15

91

50 100

4559

I Contest Farias Brito
 */