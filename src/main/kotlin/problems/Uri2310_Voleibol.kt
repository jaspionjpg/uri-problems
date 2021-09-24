package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val jogadores: Int = ler.nextInt()

    var saques = 0.0
    var bloqueios = 0.0
    var ataques = 0.0

    var saquescertos = 0.0
    var bloqueioscertos = 0.0
    var ataquescertos = 0.0

    for (i in 0 until jogadores) {
        val nome: String = ler.next()
        saques += ler.nextInt()
        bloqueios += ler.nextInt()
        ataques += ler.nextInt()
        saquescertos += ler.nextInt()
        bloqueioscertos += ler.nextInt()
        ataquescertos += ler.nextInt()
    }
    println("Pontos de Saque: %.2f %%.".format(saquescertos / saques * 100))
    println("Pontos de Bloqueio: %.2f %%.".format(bloqueioscertos / bloqueios * 100))
    println("Pontos de Ataque: %.2f %%.".format(ataquescertos / ataques * 100))
}

/*
URI Online Judge | 2310
Voleibol
Por Leonardo Fernandes, IFSC BR Brazil

Timelimit: 1
Um treinador de voleibol gostaria de manter estatísticas sobre sua equipe. A cada jogo, seu auxiliar anota quantas tentativas de saques, bloqueios e ataques cada um de seus jogadores fez, bem como quantos desses saques, bloqueios e ataques tiveram sucesso (resultaram em pontos). Seu programa deve mostrar qual o percentual de saques, bloqueios e ataques do time todo tiveram sucesso.

Entrada
A entrada é dada pelo número de jogadores N (1 ≤ N ≤ 100), seguido pelo nome de cada um dos jogadores. Abaixo do nome de cada jogador, seguem duas linhas com três inteiros cada. Na primeira linha S, B e A (0 ≤ S,B,A ≤ 10000) representam a quantidade de tentativas de saques, bloqueios e ataques e na segunda linha, S1, B1 e A1 (0 ≤ S1 ≤ S; 0 ≤ B1 ≤ B; 0 ≤ A1 ≤ A) com o número de saques, bloqueios e ataques deste jogador que tiveram sucesso.

Saída
A saída deve conter o percentual total de saques, bloqueios e ataques do time todo que resultaram em pontos, conforme mostrado no exemplo.

Exemplo de Entrada	Exemplo de Saída
3
Renan
10 20 12
1 10 9
Jonas
8 7 1
2 7 0
Edson
3 3 3
1 2 3

Pontos de Saque: 19.05 %.
Pontos de Bloqueio: 63.33 %.
Pontos de Ataque: 75.00 %.
 */