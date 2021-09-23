package problems

import java.util.Collections
import java.util.Scanner

fun main(args: Array<String>) {
    data class Rena(
        var nome: String,
        var peso: Int,
        var idade: Int,
        var altura: Double
    )

    val ler = Scanner(System.`in`)
    val testes: Int = ler.nextInt()

    for (i in 1..testes) {
        val renas = ArrayList<Rena>()
        var totalRenas = ler.nextInt()
        val renasAPuxarTreno = ler.nextInt()

        for (rena in 0 until totalRenas) {
            val nome: String = ler.next()
            val peso: Int = ler.nextInt()
            val idade: Int = ler.nextInt()
            val altura: Double = ler.nextDouble()

            renas.add(Rena(nome, peso, idade, altura))
        }

        Collections.sort(renas) { o1: Rena, o2: Rena ->
            if (o1.peso != o2.peso)
                o2.peso.compareTo(o1.peso)
            else if (o1.idade != o2.idade)
                o1.idade.compareTo(o2.idade)
            else if (o1.altura !== o2.altura)
                o1.altura.compareTo(o2.altura)
            else
                o1.nome.compareTo(o2.nome, ignoreCase = true)
        }

        println("CENARIO {$i}")
        for (rena in 0 until renasAPuxarTreno)
            println("${rena + 1} - ${renas[rena].nome}")
    }
}

/*
URI Online Judge | 1766
O Elfo das Trevas
Por Jean Bez, URI Online Judge BR Brazil

Timelimit: 2
O estábulo onde ficam as renas foi intencionalmente aberto pelo Elfo das Trevas permitindo que cada uma delas corresse e voasse livremente pela fábrica do Papai Noel, causando o maior transtorno. Os elfos estão tentando desesperadamente fazer o possível para deixar o trenó pronto para embarque. Você ficou responsável por colocar cada rena na sua posição correta assim que ela é capturada por um dos outros elfos.



Você sabe que o estábulo segue uma organização baseada na ordem que as renas irão ocupar no trenó. Desta forma, na hora da partida todas podem ser facilmente posicionadas. Diferentemente do que muitos pensam, as renas são posicionadas em uma fila única à frente no trenó. Nem todas as renas do estábulo são utilizadas em cada viagem, isto depende da carga total do trenó.

Você conseguiu a lista com as características que são utilizadas para determinar a ordem de rena. Elas devem ser ordenadas primeiramente de forma decrescente por peso. Caso duas ou mais apresentarem o mesmo peso elas devem ser ordenadas de forma ascendente pela idade, após pela altura e caso ainda persista empate, pelo nome.

Utilizando seu computador mágico de última geração você quer escrever um programa que ordene as renas, de acordo com as características informadas, e exiba somente o número exato de renas que serão utilizadas no trenó (de forma ordenada).

Entrada
Este problema possui diversos casos de teste. A primeira linha de entrada contém um inteiro T (1 ≤ T ≤ 105) que indica o número de casos de teste a seguir. A primeira linha de cada caso de teste contém dois inteiros N e M (5 ≤ N, M ≤ 103) que indicam respectivamente o número total de renas e o número de renas que irão puxar o trenó. Na sequência serão informados uma string S seguida por 2 inteiros P (1 ≤ P ≤ 300) e I (1 ≤ I ≤ 300) e por um número de ponto flutuante A (0.00 ≤ A ≤ 3.00), indicando respectivamente o nome, o peso, a idade e a altura de cada uma das renas. O nome de cada uma das renas é composto somente por uma palavra com até 100 caracteres.

Saída
Para cada caso de teste você deverá exibir a mensagem "CENARIO {i}", onde i indica o caso de teste atual, seguido da posição e o nome de cada umas das M renas que irão puxar o trenó, ordenadas conforme descrito acima.

Exemplo de Entrada	Exemplo de Saída
1
9 5
Rudolph 50 100 1.12
Dasher 10 121 1.98
Dancer 10 131 1.14
Prancer 7 142 1.36
Vixen 50 110 1.42
Comet 50 121 1.21
Cupid 50 107 1.45
Donner 30 106 1.23
Blitzen 50 180 1.84

CENARIO {1}
1 - Rudolph
2 - Cupid
3 - Vixen
4 - Comet
5 - Blitzen

Contest de Natal 2014
 */
