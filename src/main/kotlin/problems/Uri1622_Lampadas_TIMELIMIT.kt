package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (true) {
        val numlampadas = ler.nextInt()
        val pesquisas = ler.nextInt()

        if (numlampadas + pesquisas == 0)
            break

        val lampadas = ler.next().map { it == 'o' }
        for (pesquisa in 1..pesquisas) {
            var lampadasPesquisa = lampadas.toMutableList()

            val salto = ler.nextInt()
            val vezes = ler.nextInt()

            var indice = 0
            for (i in 1..vezes) {
                val indiceAtual = indice % numlampadas
                lampadasPesquisa[indiceAtual] = !lampadasPesquisa[indiceAtual]
                indice += salto
            }

            val lampadasStringue = lampadasPesquisa.map { if (it) 'o' else 'x' }.joinToString("")
            println(lampadasStringue)
        }
    }
}

/*
URI Online Judge | 1622
Lâmpadas
Por Cristhian Bonilha, UTFPR BR Brazil

Timelimit: 1
No último trabalho da escola, você desenvolveu um projeto um tanto quanto curioso. Trata-se de N lâmpadas dispostas uma ao lado da outra, enumeradas de 1 até N, da esquerda para a direita, e de um único interruptor. Quando este interruptor é pressionado, ele troca o estado de uma das lâmpadas (se está ligada, ela desliga, e vice-versa).

O diferencial do seu projeto está no comportamento desse interruptor. Em vez de trocar o estado de apenas uma lâmpada em particular, ele intercala entre as lâmpadas em que ele vai agir, funcionando da seguinte maneira: na primeira vez ele troca o estado da lâmpada número 1; na segunda, e nas próximas vezes, ele troca o estado da lâmpada que está K posições à direita da anterior. Se ele chegar no final da sequência, ele continua a contar da posição 1.

Ou seja, seja N = 8 e K = 3, se pressionarmos o interruptor 4 vezes ele vai agir nas lâmpadas 1, 4, 7 e 2, respectivamente.

Você ficou um pouco intrigado com sua própria invenção, e resolveu fazer alguns testes. Dado o estado inicial de cada uma das N lâmpadas (ligado ou desligado), o valor de K e um número M de vezes que o interruptor foi pressionado, diga o estado final das N lâmpadas.

Entrada
Haverá diversos casos de teste. Cada caso de teste inicia com dois inteiros N e Q (3 ≤ N ≤ 100, 1 ≤ Q ≤ 1000), representando o número de lâmpadas e o número de consultas, respectivamente.

Em seguida haverá uma linha com N caracteres, representando o estado das N lâmpadas. O i-ésimo caractere indica o estado da i-ésima lâmpada, estando ela ligada (caractere "o") ou desligada (caractere "x"), para todo 1 ≤ i ≤ N.

Em seguida haverá Q linhas, cada uma com dois inteiros K e M (1 ≤ K < N, 1 ≤ M ≤ 10⁶), indicando o tamanho do “salto” que seu interruptor dá (conforme o enunciado), e o número de vezes que o mesmo foi pressionado, respectivamente. A cada consulta o interruptor inicia na posição 1.

O último caso de teste é indicado quando N = Q = 0, o qual não deverá ser processado.

Saída
Para cada consulta imprima uma linha, contendo N caracteres cada, onde o i-ésimo caractere indica o estado da i-ésima lâmpada, estado ela ligada (caractere "o") ou desligada (caractere "x").

Exemplo de Entrada	Exemplo de Saída
8 3
xxxxxxxx
3 3
3 4
3 7
11 3
xooxoxxxxox
5 6
10 43
9 1000
0 0

oxxoxxox
ooxoxxox
oooooxoo
ooooxoxxxxo
xxoxoxxxxox
oxooxooooxo

XIV Contest Algar Telecom 2014
 */