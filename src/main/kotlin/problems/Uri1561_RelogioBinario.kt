package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNext()) {
        var (hora, minuto) = ler.next().split(":").map { it.toInt() }

        val ponteirohora = listOf(8, 4, 2, 1)
        val ponteirominuto = listOf(32, 16, 8, 4, 2, 1)

        val relogiohora = Array(4) { " " }
        val relogiominuto = Array(6) { " " }

        for (i in ponteirohora.indices)
            if (hora >= ponteirohora[i]) {
                relogiohora[i] = "o"
                hora -= ponteirohora[i]
            }

        for (i in ponteirominuto.indices)
            if (minuto >= ponteirominuto[i]) {
                relogiominuto[i] = "o"
                minuto -= ponteirominuto[i]
            }

        println(" ____________________________________________")
        println("|                                            |")
        println("|    ____________________________________    |_")
        println("|   |                                    |   |_)")
        println("|   |   8         4         2         1  |   |")
        println("|   |                                    |   |")
        println("|   |   ${relogiohora[0]}         ${relogiohora[1]}         ${relogiohora[2]}         ${relogiohora[3]}  |   |")
        println("|   |                                    |   |")
        println("|   |                                    |   |")
        println("|   |   ${relogiominuto[0]}     ${relogiominuto[1]}     ${relogiominuto[2]}     ${relogiominuto[3]}     ${relogiominuto[4]}     ${relogiominuto[5]}  |   |")
        println("|   |                                    |   |")
        println("|   |   32    16    8     4     2     1  |   |_")
        println("|   |____________________________________|   |_)")
        println("|                                            |")
        println("|____________________________________________|")
        println()
    }
}

/*
URI Online Judge | 1561
Relógio Binário
Por Gabriel Dalalio, ITA BR Brazil

Timelimit: 1
Alguns programadores gostam de ser estranhos e usam relógios binários como o relógio da imagem abaixo:



Há também programadores que gostam de inventar questões para competições online, porém não gostam de escrever textos detalhados e longos para as questões.

Sua tarefa nesse problema é desenhar o relógio da imagem em um dado horário.

Entrada
A entrada é composta por vários casos de teste. Cada caso de teste é composto por uma linha conténdo um horário no formato HH:MM (0 ≤ HH < 12 e 0 ≤ MM < 60). A entrada termina com final de arquivo (EOF).

Saída
Para cada teste, a saída é composta por um desenho do relógio no horário dado na entrada (o desenho deve seguir o mesmo formato dos desenho dos exemplos). Imprima uma linha em branco após cada desenho.

Exemplo de Entrada	Exemplo de Saída
04:16
07:31
08:32
00:00

 ____________________________________________
|                                            |
|    ____________________________________    |_
|   |                                    |   |_)
|   |   8         4         2         1  |   |
|   |                                    |   |
|   |             o                      |   |
|   |                                    |   |
|   |                                    |   |
|   |         o                          |   |
|   |                                    |   |
|   |   32    16    8     4     2     1  |   |_
|   |____________________________________|   |_)
|                                            |
|____________________________________________|

 ____________________________________________
|                                            |
|    ____________________________________    |_
|   |                                    |   |_)
|   |   8         4         2         1  |   |
|   |                                    |   |
|   |             o         o         o  |   |
|   |                                    |   |
|   |                                    |   |
|   |         o     o     o     o     o  |   |
|   |                                    |   |
|   |   32    16    8     4     2     1  |   |_
|   |____________________________________|   |_)
|                                            |
|____________________________________________|

 ____________________________________________
|                                            |
|    ____________________________________    |_
|   |                                    |   |_)
|   |   8         4         2         1  |   |
|   |                                    |   |
|   |   o                                |   |
|   |                                    |   |
|   |                                    |   |
|   |   o                                |   |
|   |                                    |   |
|   |   32    16    8     4     2     1  |   |_
|   |____________________________________|   |_)
|                                            |
|____________________________________________|

 ____________________________________________
|                                            |
|    ____________________________________    |_
|   |                                    |   |_)
|   |   8         4         2         1  |   |
|   |                                    |   |
|   |                                    |   |
|   |                                    |   |
|   |                                    |   |
|   |                                    |   |
|   |                                    |   |
|   |   32    16    8     4     2     1  |   |_
|   |____________________________________|   |_)
|                                            |
|____________________________________________|


Contest Dalalio 2014
 */