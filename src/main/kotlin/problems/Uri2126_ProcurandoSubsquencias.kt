package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var caso = 1
    while (ler.hasNext()) {

        val numeros = ler.next()
        var sequencia = ler.next()
        val ultimaSequencia = sequencia.lastIndexOf(numeros) + 1
        val numeroRepeticoes = sequencia.split(numeros).size - 1

        if (ultimaSequencia > 0) {
            println("Caso #$caso:")
            println("Qtd.Subsequencias: $numeroRepeticoes")
            println("Pos: $ultimaSequencia")
            println()
        } else {
            println("Caso #$caso:")
            println("Nao existe subsequencia")
            println()
        }
        caso++
    }
}

/*
URI Online Judge | 2126
Procurando Subsequências
Por Igor Gomes, UEVA BR Brazil

Timelimit: 1
Dados dois números naturais N1 e N2, diz-se que N1 é subsequência contígua de N2 se todos os dígitos de N1 aparecem, na mesma ordem e de forma contígua, em N2. Crie uma aplicação que leia dois números naturais e diga se o primeiro é uma subsequência contígua do segundo.

Entrada
A entrada é composta por vários casos de teste e termina com final de arquivo (EOF). A primeira linha de cada entrada é composta por um valor natural N1(1 < N1 < 1010), a segunda linha é composta por um valor N2( N1 < N2 < 1032).

Saída
Para cada caso de teste imprima a quantidade de subsequências contíguas e a posição onde a subsequência é iniciada, caso exista mais de uma subsequência, imprima onde é iniciada a última subsequência. Caso não exista subsequência, imprima "Nao existe subsequencia". Mostre o resultado conforme o exemplo de saída.

Exemplo de Entrada	Exemplo de Saída
78954
7895478954789547895447895478954
464133
1331646546874694
12
1231321455123214565423112

Caso #1:
Qtd.Subsequencias: 6
Pos: 27


Caso #2:
Nao existe subsequencia


Caso #3:
Qtd.Subsequencias: 3
Pos: 24
 */