package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (true) {
        val numeroParticipantes = ler.nextInt()
        val numeroProblemas = ler.nextInt()
        if (numeroProblemas + numeroParticipantes == 0)
            break

        val quantasProblemasCadaParticipanteResolveu = IntArray(numeroParticipantes)
        val quantasVezesEsseProblemaFoiSolucionado = IntArray(numeroProblemas)

        for (numeroParticipante in 0 until numeroParticipantes) {
            for (numeroProblema in 0 until numeroProblemas) {
                val resolveu = ler.nextInt() == 1
                if (resolveu) {
                    quantasProblemasCadaParticipanteResolveu[numeroParticipante]++
                    quantasVezesEsseProblemaFoiSolucionado[numeroProblema]++
                }
            }
        }

        var casosValidos = 0

        // condicao 1
        if (quantasProblemasCadaParticipanteResolveu.all { quantosOParticipanteResolveu -> quantosOParticipanteResolveu != numeroProblemas })
            casosValidos++
        // condicao 2
        if (quantasVezesEsseProblemaFoiSolucionado.all { vezesSolucionado -> vezesSolucionado > 0 })
            casosValidos++
        // condicao 3
        if (quantasVezesEsseProblemaFoiSolucionado.all { vezesSolucionado -> vezesSolucionado != numeroParticipantes })
            casosValidos++
        // condicao 4
        if (quantasProblemasCadaParticipanteResolveu.all { quantosOParticipanteResolveu -> quantosOParticipanteResolveu > 0 })
            casosValidos++

        println(casosValidos)
    }
}

/*
URI Online Judge | 1514
Competição
Por Cristhian Bonilha, UTFPR BR Brazil

Timelimit: 1
A maioria dos programadores que chegam a escrever competições com exercícios de programação concordam em quatro características que toda competição deve alcançar. Embora nem todas sejam sempre alcançadas, quanto mais melhor. As características são as seguintes:

Ninguém resolveu todos os problemas.
Todo problema foi resolvido por pelo menos uma pessoa (não necessariamente a mesma).
Não há nenhum problema resolvido por todos.
Todos resolveram ao menos um problema (não necessariamente o mesmo).
Rafael organizou uma competição alguns dias atrás, e está preocupado com quantas dessas características ele conseguiu alcançar com a competição.

Dadas as informações sobre a competição, com o número de participantes, número de problemas, e qual participante resolveu quais problemas, descubra o número de características que foram alcançadas nesta competição.

Entrada
Haverá diversos casos de teste. Cada caso de teste inicia com dois inteiros N e M (3 ≤ N, M ≤ 100), indicando, respectivamente, o número de participantes e o número de problemas.

Em seguida, haverá N linhas com M inteiros cada, onde o inteiro da linha i e coluna j é 1 caso o competidor i resolveu o problema j, ou 0 caso contrário.

O último caso de teste é indicado quando N = M = 0, o qual não deverá ser processado.

Saída
Para cada caso de teste, imprima uma linha contendo um inteiro, representando quantas das características citadas foram alcançadas na competição.

Exemplo de Entrada	Exemplo de Saída
3 3
1 1 0
0 1 0
0 0 0
3 3
1 1 0
0 1 0
0 0 1
0 0

2
4

Contest Bonilha 2014
 */