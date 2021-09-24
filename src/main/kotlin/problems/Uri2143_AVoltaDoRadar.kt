package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var testes: Int
    while (true) {
        testes = ler.nextInt()
        if (testes == 0)
            break

        for (i in 0 until testes) {
            val pessoasNaMesa = ler.nextInt()
            if (pessoasNaMesa % 2 != 0)
                println(pessoasNaMesa * 2 - 1)
            else
                println(pessoasNaMesa * 2 - 2)
        }
    }
}

/*
URI Online Judge | 2143
A Volta do Radar
Por Joao Marcos Salvanini Bellini de Moraes, IFSULDEMINAS BR Brazil

Timelimit: 1
Todo ano após a competição que ocorre na cidade de Taxilândia, os participantes e os coaches vão para o célebre restaurante Radar. Porém, os garçons (sempre muito gentis e educados) ficam sobrecarregados devido à quantidade de pessoas, e consequentemente, acabam demorando um pouco para atender a um pedido.

Os participantes ou coaches que sentam nas pontas são os privilegiados, pois são atendidos com somente um pedido, mas os demais precisam sempre pedir duas vezes, pois os garçons (apesar de gentis e educados) são desatentos e se esquecem facilmente dos pedidos. Além disso, há uma superstição entre os participantes e coaches de que se não houver um número par de pessoas que não sentam nas pontas, na próxima competição nenhuma equipe da universidade conseguirá vencer.

Portanto, sua tarefa é determinar a soma da quantidade de pedidos de cada um para saber se vale a pena ir ao Radar. Mas apesar do resultado, lembre-se: sempre vale a pena ir ao Radar!

Entrada
A entrada é composta por T (1 ≤ T ≤ 100) indicando a quantidade de casos de teste e então, T inteiros N (3 ≤ N ≤ 104), indicando a quantidade de pessoas. A mesa é retangular e haverá pelo menos e no máximo uma pessoa em uma das pontas, isto é, se uma ponta estiver vazia, a outra deve ser ocupada, ou senão, as duas pontas estarão ocupadas, mas o número de pessoas que não estão nas pontas sempre será par. O final da entrada é indicado por T = 0.

Saída
Seu programa deverá imprimir a soma da quantidade de pedidos de cada pessoa. Não haverá linha em branco entre os casos de teste.

Exemplo de Entrada	Exemplo de Saída
5

13

37

49

11

9

2

5

17

0

25

73

97

21

17

9

33

Aquecimento para a VI Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2016
 */