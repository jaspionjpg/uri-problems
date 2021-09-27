package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (true) {
        val numeroDeCartas = ler.nextInt()
        if (numeroDeCartas == 0)
            break

        val deck = ArrayList<Int>()
        for (numeroCarta in 1..numeroDeCartas)
            deck.add(numeroCarta)

        val ordemDescarte = IntArray(numeroDeCartas - 1)
        for (i in 0 until numeroDeCartas - 1) {
            ordemDescarte[i] = deck.first()
            deck.removeAt(0)
            deck.add(deck.size, deck.first())
            deck.removeAt(0)
        }
        println("Discarded cards: ${ordemDescarte.joinToString()}")
        println("Remaining card: ${deck[0]}")
    }
}

/*
URI Online Judge | 1110
Jogando Cartas Fora
Folclore, adaptado por Piotr Rudnicki  Canada

Timelimit: 1
Dada uma pilha de n cartas enumeradas de 1 até n com a carta 1 no topo e a carta n na base.  A seguinte operação é ralizada enquanto tiver 2 ou mais cartas na pilha.

Jogue fora a carta do topo e mova a próxima carta (a que ficou no topo) para a base da pilha.

Sua tarefa é encontrar a sequência de cartas descartadas e a última carta remanescente.

Cada linha de entrada (com exceção da última) contém um número n ≤ 50. A última linha contém 0 e não deve ser processada. Cada número de entrada produz duas linhas de saída. A primeira linha apresenta a sequência de cartas descartadas e a segunda linha apresenta a carta remanescente.

Entrada
A entrada consiste em um número indeterminado de linhas contendo cada uma um valor de 1 até 50. A última linha contém o valor 0.

Saída
Para cada caso de teste, imprima duas linhas. A primeira linha apresenta a sequência de cartas descartadas, cada uma delas separadas por uma vírgula e um espaço. A segunda linha apresenta o número da carta que restou. Nenhuma linha tem espaços extras no início ou no final. Veja exemplo para conferir o formato esperado.

Exemplo de Entrada	Exemplo de Saída
7
19
10
6
0

Discarded cards: 1, 3, 5, 7, 4, 2
Remaining card: 6
Discarded cards: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 4, 8, 12, 16, 2, 10, 18, 14
Remaining card: 6
Discarded cards: 1, 3, 5, 7, 9, 2, 6, 10, 8
Remaining card: 4
Discarded cards: 1, 3, 5, 2, 6
Remaining card: 4

Adaptação, entradas e saídas by Neilor Tonin
 */