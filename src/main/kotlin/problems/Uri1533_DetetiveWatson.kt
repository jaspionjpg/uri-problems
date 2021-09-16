package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val numero = ler.nextInt()
        if (numero == 0)
            break
        val lista = ArrayList<Int>()
        for (i in 1..numero) {
            lista.add(ler.nextInt())
        }
        val listaOrdenada = lista.sorted()
        println(lista.indexOf(listaOrdenada[numero - 2]) + 1)
    }
}

/*
URI Online Judge | 1533
Detetive Watson
Por Cristhian Bonilha, UTFPR BR Brazil

Timelimit: 1
John Watson, mesmo após anos trabalhando ao lado de Sherlock Holmes, nunca conseguiu entender como ele consegue descobrir quem é o assassino com tanta facilidade. Em uma certa noite, porém, Sherlock bebeu mais do que devia e acabou contando o segredo a John.

“Elementar, meu caro Watson”, disse Sherlock Holmes. “Nunca é o mais suspeito, mas sim o segundo mais suspeito”. Após descobrir o segredo, John decidiu resolver um crime por conta própria, só para testar se aquilo fazia sentido ou se era apenas conversa de bêbado.

Dada uma lista com N inteiros, representando o quanto cada pessoa é suspeita, ajude John Watson a decidir quem é o assassino, de acordo com o método citado.

Entrada
Haverá diversos casos de teste. Cada caso de teste inicia com um inteiro N (2 ≤ N ≤ 1000), representando o número de suspeitos.

Em seguida haverá N inteiros distintos, onde o i-ésimo inteiro, para todo 1 ≤ i ≤ N, representa o quão suspeita a i-ésima pessoa é, de acordo com a classificação dada por John Watson. Seja V o valor do i-ésimo inteiro, 1 ≤ V ≤ 10000.

O último caso de teste é indicado quando N = 0, o qual não deverá ser processado.

Saída
Para cada caso de teste imprima uma linha, contendo um inteiro, representando o indice do assassino, de acordo com o método citado.

Exemplo de Entrada	Exemplo de Saída
3
3 5 2
5
1 15 3 5 2
0

1
4

Maratona Algar Telecom XIII
 */