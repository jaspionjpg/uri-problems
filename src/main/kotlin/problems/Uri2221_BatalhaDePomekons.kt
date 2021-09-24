package problems

import java.util.Scanner

fun main(args: Array<String>) {
    data class Pomekon(
        val ataque: Double, val defesa: Double, val bonus: Boolean
    )

    val ler = Scanner(System.`in`)
    val testes: Int = ler.nextInt()
    for (i in 0 until testes) {
        val bonus: Int = ler.nextInt()
        val pomekonDoDabriel = Pomekon(ler.nextDouble(), ler.nextDouble(), ler.nextInt() % 2 == 0)
        val pomekonDoGuarte = Pomekon(ler.nextDouble(), ler.nextDouble(), ler.nextInt() % 2 == 0)

        val valorGolpeDabriel =
            (pomekonDoDabriel.ataque + pomekonDoDabriel.defesa) / 2 + if (pomekonDoDabriel.bonus) bonus else 0
        val valorGolpeGuarte =
            (pomekonDoGuarte.ataque + pomekonDoGuarte.defesa) / 2 + if (pomekonDoGuarte.bonus) bonus else 0

        if (valorGolpeDabriel == valorGolpeGuarte) println("Empate")
        else if (valorGolpeGuarte > valorGolpeDabriel) println("Guarte")
        else println("Dabriel")
    }
}

/*
URI Online Judge | 2221
Batalha de Pomekons
Por Gabriel Duarte, UNIFESO BR Brazil

Timelimit: 1
Depois de capturar muitos Pomekons, Dabriel e Guarte resolveram batalhar. A forma de duelo é simples, cada treinador coloca um Pomekon na batalha e vence quem tem o Pomekon com maior valor de golpe, que é definido da seguinte maneira:


O Bônus será dado ao Pomekon do treinador que estiver em um level de valor par.

Neste problema será dado a você o valor do bônus aplicado, os valores de ataque e defesa do Pomekon de Dabriel e Guarte e seus respectivos níveis, cabe a você informar o ganhador da batalha.

Entrada
A entrada é composta por diversas instâncias. A primeira linha da entrada contém um inteiro T indicando o número de instâncias. Cada instância começa com um inteiro B (0 ≤ B ≤ 100), que indica o valor do bônus aplicado. Nas duas linhas seguintes terão três inteiros Ai, Di e Li (1 ≤ Ai, Di ≤ 100, 1 ≤ Li ≤ 50), representado o valor de ataque do Pomekon, o valor de defesa e o level do treinador. A primeira linha representa o Pomekon de Dabriel e a segunda o de Guarte.

Saída
Para instância na entrada você deverá imprimir o nome do treinador que irá vencer a batalha, em caso de empate imprima: "Empate", sem aspas.

Exemplo de Entrada	Exemplo de Saída
3
5
12 23 15
42 12 20
2
52 1 11
1 52 1
3
95 12 22
5 51 21
Guarte
Empate
Dabriel

II Maratona de programação do IFCE-Aracati
 */