package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val ficha1 = ler.nextInt()
    val ficha2 = ler.nextInt()
    val ficha3 = ler.nextInt()
    var possivelRetornar = false

    if (ficha1 + ficha2 - ficha3 == 0) possivelRetornar = true
    if (ficha2 + ficha3 - ficha1 == 0) possivelRetornar = true
    if (ficha1 + ficha3 - ficha2 == 0) possivelRetornar = true
    if (ficha1 - ficha2 == 0) possivelRetornar = true
    if (ficha1 - ficha3 == 0) possivelRetornar = true
    if (ficha2 - ficha3 == 0) possivelRetornar = true

    if (possivelRetornar) println("S")
    else println("N")
}

/*
URI Online Judge | 2235
Andando no Tempo
Por Maratona de Programação SBC BR Brazil

Timelimit: 1
Imagine que você tenha uma máquina do tempo que pode ser usada no máximo três vezes, e a cada uso da máquina você pode escolher voltar para o passado ou ir para o futuro. A máquina possui três créditos fixos; cada crédito representa uma certa quantidade de anos, e pode ser usado para ir essa quantidade de anos para o passado ou para o futuro. Você pode fazer uma, duas ou três viagens, e cada um desses três créditos pode ser usado uma vez apenas. Por exemplo, se os créditos forem 5, 12 e 9, você poderia decidir fazer duas viagens: ir 5 anos para o futuro e, depois, voltar 9 anos para o passado. Dessa forma, você terminaria quatro anos no passado, em 2012. Também poderia fazer três viagens, todas indo para o futuro, usando os créditos em qualquer ordem, terminando em 2042.

Neste problema, dados os valores dos três créditos da máquina, seu programa deve dizer se é ou não possível viajar no tempo e voltar para o presente, fazendo pelo menos uma viagem e, no máximo, três viagens; sempre usando cada um dos três créditos no máximo uma vez.

Entrada
A entrada consiste de uma linha contendo os valores dos três créditos A, B e C (1 ≤ A, B, C ≤ 1000).

Saída
Seu programa deve imprimir uma linha contendo o caracter “S” se é poss ível viajar e voltar para o presente, ou “N” caso contrário.

Exemplos de Entrada	Exemplos de Saída
22 5 22

S

31 110 79

S

45 8 7

N

Maratona de Programação SBC 2016
 */