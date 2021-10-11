package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()

    for (teste in 1..testes) {
        val numcandidatos = ler.nextInt()
        val votos = ler.nextInt()

        val contagemVotos = IntArray(numcandidatos)

        for (i in 1..votos)
            contagemVotos[ler.nextInt() - 1]++

        var valor = Int.MIN_VALUE
        var indice = -1
        for (i in 0 until numcandidatos) {
            if (contagemVotos[i] > valor) {
                valor = contagemVotos[i]
                indice = i
            } else if (contagemVotos[i] == valor) {
                indice = -1
            }
        }

        if (indice != -1 && contagemVotos[indice] > votos / 2)
            println(indice + 1)
        else println(-1)
    }
}

/*
URI Online Judge | 1615
Insatisfação nas Eleições
Por Bruno Adami, Universidade de São Paulo - São Carlos BR Brazil

Timelimit: 1
Uma eleição foi feita em uma pequena cidade de M habitantes, onde havia N candidatos. As pessoas escreviam o número do candidato em um pedaço de papel, e inseriam na urna.

Ao final da eleição, se um candidato receber uma quantidade estritamente maior do que 50% dos votos, ele é considerado o vencedor. Caso contrário um segundo turno de eleições é feito.

Como o processo de contagem manual é muito lento, você deve desenvolver um programa que decide qual o candidato vencedor ou se nenhum recebeu votos suficientes e um segundo turno será necessário.

Entrada
Na primeira linha você terá um inteiro T (T ≤ 100) indicando o número de casos de teste.

Para cada caso de teste, na primeira linha você terá os números inteiros N (1 ≤ N ≤ 10) e M (1 ≤ M ≤ 103* ou 1 ≤ M ≤ 5*104**). Na próxima linha, M inteiros seguirão separados por espaços, indicando o candidato em que cada pessoa votou, ou seja, o número escrito em cada pedaço de papel dentro da urna.

*Ocorre em aproximadamente 90% dos casos de teste;

**Ocorre nos demais casos de teste.

Saída
Para cada caso, imprima o número do candidato vencedor, ou -1 caso haverá segundo turno.

Exemplo de Entrada	Exemplo de Saída
3

2 3

1 1 2

2 5

1 2 2 1 2

3 4

1 2 3 1

1

2

-1

Seletiva USP São Carlos - Segunda Prova 2014
 */