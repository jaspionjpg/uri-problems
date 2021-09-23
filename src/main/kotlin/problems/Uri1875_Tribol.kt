package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes: Int = ler.nextInt()
    for (i in 0 until testes) {
        val golsPartida: Int = ler.nextInt()

        var blue = 0
        var red = 0
        var green = 0

        for (j in 0 until golsPartida) {
            val marcou: String = ler.next()
            val sofreu: String = ler.next()

            if (marcou == "G") {
                if (sofreu == "R") {
                    green++
                } else {
                    green++
                    green++
                }
            } else if (marcou == "R") {
                if (sofreu == "B") {
                    red++
                } else {
                    red++
                    red++
                }
            } else if (marcou == "B") {
                if (sofreu == "G") {
                    blue++
                } else {
                    blue++
                    blue++
                }
            }
        }

        if (blue > green && blue > red) {
            println("blue")
        } else if (green > blue && green > red) {
            println("green")
        } else if (red > blue && red > green) {
            println("red")
        } else if (green == red && red == blue) {
            println("trempate")
        } else if (green == red || red == blue || green == blue) {
            println("empate")
        }
    }
}

/*
URI Online Judge | 1875
Tribol
Por Ricardo Martins, IFSULDEMINAS BR Brazil

Timelimit: 1
Na cidade de Triangulândia, o maior sonho de sua população era construir um campo de futebol, mas lá todos os terrenos são triangulares. Se fosse para fazer um campo retangular, uma boa parte do terreno não seria aproveitada para construir o campo. Então, os irmãos Hipo e Tenusa tiveram uma grande ideia: A criação de um novo jogo, derivado do futebol, mas jogado em um campo triangular, e chamaram o jogo de Tribol. As regras eram simples:

Jogam três equipes ao mesmo tempo: Red, Green e Blue.

A partida tem um tempo de trinta minutos.
A equipe que fizer um gol no adversário do sentido anti-horário ao mesmo, é um gol normal.
A equipe que fizer um gol no adversário do sentido horário ao mesmo, vale o dobro.
Se as três equipes fizerem a mesma quantidade de gols, ocorre um trempate
Se as duas equipes que fizerem mais gols tiverem feito a mesma quantidade, ocorre um empate, e o jogo é decidido por pênaltis.
A equipe que fizer mais gols, vence.
Exemplo de partida. Os times estão dispostos no campo igual à imagem abaixo.



A equipe Green faz um gol na equipe Blue e um gol na equipe Red, totalizando 3 gols;
A equipe Blue faz dois gols na equipe Green, totalizando 2 gols;
A equipe Red faz dois gols na equipe Green, totalizando 4 gols e vencendo a partida.
Entrada
Haverá diversos casos de teste. O primeiro número a ser lido será um inteiro C, representando a quantidade de casos de teste. Cada caso de teste se inicia com um número inteiro P, representando a quantidade de gols na partida. A seguir serão lidos P linhas, cada um com dois caracteres M e S, indicando a primeira letra do time que marcou o gol e a primeira letra do time que sofreu o gol, respectivamente.

Saída
Para cada caso de teste, imprima o resultado da partida no tempo normal, baseado nos gols que foram marcados.

Exemplo de Entrada	Exemplo de Saída
3
3
G R
R B
B G
5
G B
G R
B R
B G
R G
1
B G

trempate

empate

blue

V Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2015
 */