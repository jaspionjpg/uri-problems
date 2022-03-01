package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        var tamanho = ler.nextInt()
        if (tamanho == 0)
            break

        var linha = tamanho / 2
        var coluna = tamanho / 2

        printar(tamanho, linha, coluna)

        var somador = 1

        eterno@ while (true) {
            for (contador in if (somador > 0) 0 until somador else somador until 0) {
                if (somador > 0) coluna++ else coluna--
                if (coluna == tamanho)
                    break@eterno
                printar(tamanho, linha, coluna)
            }
            for (contador in if (somador > 0) 0 until somador else somador until 0) {
                if (somador > 0) linha++ else linha--
                if (linha == tamanho)
                    break@eterno
                printar(tamanho, linha, coluna)
            }
            if (somador > 0) somador++ else somador--
            somador *= -1
        }
    }
}

private fun printar(tamanho: Int, linha: Int, coluna: Int) {
    (0 until tamanho).forEach { i ->
        val stringLinha = Array(tamanho) { j ->
            if (i == tamanho - 1 - linha && j == coluna) "X" else "O"
        }.joinToString("")
        println(stringLinha)
    }
    println("@")
}

/*
beecrowd | 1868
Espiral Quadrada
Por Ricardo Martins, IFSULDEMINAS BR Brazil

Timelimit: 1
A empresa Animações Livres de Falhas, ou ALF, realiza as mais diversas animações usando apenas caracteres na tela. Um dia, foram desafiados a fazer uma animação de uma Espiral Quadrada. Esta deverá proceder da seguinte forma:

*Sempre exibirá uma tabela quadrada, com N linhas e N colunas, com um caractere em seu respectivo lugar, sem espaços entre os mesmos;

*Esta quantidade N será sempre ímpar;

*O primeiro quadro desta animação será com um caractere ‘X’ no centro da tabela e o restante da mesma ocupado com caracteres ‘O’;

*Nos quadros seguintes, o caractere ‘X’ será deslocado para os outros locais da tabela, substituindo onde o mesmo estava com ‘O’, exibindo sempre uma vez o ‘X’ em cada quadro. O deslocamento será no formato de uma espiral quadrada, realizando o deslocamento para direita, para cima, para esquerda e para baixo. Veja um exemplo de todos os quadros da animação com N = 5:



Escreva um programa que, dado um número inteiro, imprima todos os quadros da animação da espiral quadrada.

Entrada
Haverá diversos casos de teste. Cada caso de teste inicia com um inteiro N (1 ≤ N ≤ 25), indicando o tamanho da tela.

O último caso de teste é indicado quando N = 0, sendo que este caso não deverá ser processado.

Saída
Para cada caso de teste imprima N x N tabelas, cada uma separada com um ‘@’, seguindo as regras da animação como descritas anteriormente.

Exemplo de Entrada	Exemplo de Saída
3

1

0

OOO

OXO

OOO

@

OOO

OOX

OOO

@

OOX

OOO

OOO

@

OXO

OOO

OOO

@

XOO

OOO

OOO

@

OOO

XOO

OOO

@

OOO

OOO

XOO

@

OOO

OOO

OXO

@

OOO

OOO

OOX

@

X

@

V Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2015
 */