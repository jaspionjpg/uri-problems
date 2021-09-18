package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val numero = ler.nextInt()
        if (numero == 0)
            break

        var soma = 0
        var vezes = 0

        var incorretos = mutableMapOf<String, Int>()

        for (i in 1..numero) {
            val exercicio = ler.next()
            val valor = ler.nextInt()
            val resultado = ler.next()

            if (resultado == "correct") {
                soma += valor
                vezes++
                soma += (incorretos[exercicio] ?: 0) * 20
            } else {
                incorretos[exercicio] = incorretos[exercicio]?.plus(1) ?: 1
            }
        }

        println("$vezes $soma")
    }
}

/*
URI Online Judge | 1367
Ajude!
Maratona de Programacao da SBC, Warm-Up  Brasil

Timelimit: 1
Então, nós temos que admitir: precisamos da sua ajuda. Esse ano as coisas não estao correndo tão tranquilamente quanto queríamos, e nós não conseguimos finalizar o sistema do software da competição a tempo. Uma parte vital está faltando, e como você sabe, nós precisamos desse sistema funcionando até essa tarde, para a verdadeira competição. A parte que está faltando é a que computa a pontuação dos times, dada a lista de submissões desse time.

Por favor, por favor, alguém nos ajude!

Entrada
A entrada contém vários casos de teste. A primeira linha de caso de teste contém um único inteiro N indicando o número de submissões do caso de teste (1 ≤ N ≤ 300). Cada uma das N linhas seguintes descrevem uma submissão; cada uma dessas linhas contém um identificador de problema (uma única letra entre 'A' e 'Z'), seguida por um inteiro T representando o tempo em minutos (0 ≤ T ≤ 300), seguido por um julgamento (a palavra "correct", correto, ou a palavra "incorrect", incorreto).

A entrada está em ordem crescente de tempo, e haverá no máximo um julgamento "correct" para cada problema. O final da entrada é indicado por N = 0. A entrada deve ser lida da entrada padrão.

Saída
Para cada caso de teste a entrada do seu programa deve imprimir uma linha contendo dois inteiros S e P, separados por um espaço, onde S é o número de problemas distintos com o julgamento "correct" e P é o tempo no qual cada problema distinto foi julgado pela primeira vez como "correct", somado a 20 para cada julgamento "incorrect" recebido nesse problema (desde que no final o problema tenha sido julgado como "correct"). A saída deve ser escrita na saída padrão.

Exemplo de Entrada	Exemplo de Saída
3
A 120 incorrect
A 130 incorrect
A 200 incorrect
5
A 100 correct
B 110 incorrect
B 111 correct
C 200 correct
D 300 incorrect
0

0 0
3 431

Maratona de Programacao da SBC 2004.

 */