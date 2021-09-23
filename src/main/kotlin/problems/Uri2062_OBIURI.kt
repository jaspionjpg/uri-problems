package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    var numeroPalavras: Int = ler.nextInt()

    var listaPalavras = ArrayList<String>()

    for (indicePalavra in 0 until numeroPalavras) {
        val palavra: String = ler.next()

        val palavraAAdicionar = when {
            palavra.contains("OB") && palavra.length == 3 -> "OBI"
            palavra.contains("UR") && palavra.length == 3 -> "URI"
            else -> palavra
        }
        listaPalavras.add(palavraAAdicionar)
    }
    println(listaPalavras.joinToString(" "))
}

/*
URI Online Judge | 2062
OBI URI
Por Neilor Tonin, URI BR Brasil

Timelimit: 1
Mariazinha criou um exercício para as suas irmãs Paula e Marta: ela distribui um texto e pede que ambas corrijam este texto, sabendo que apenas as palavras OBI e URI podem estar escritas de forma errada, e o erro pode estar apenas na última letra.

Sua tarefa aqui é automatizar este processo, ou seja, criar um programa que faça a correção dos textos distribuídos pela Mariazinha para que ela possa conferir as correções de suas irmãs sem muito trabalho.

Note que se "OB" ou "UR" forem o início ou parte de uma palavra maior, como por exemplo "OBOS" ou "URAT"), estas palavras não devem ser alteradas.

Entrada
A entrada contém duas linhas. A primeira linha contém um valor inteiro N (1 < N < 10000) que indica a quantidade de palavras do texto. A segunda linha contém as palavras do texto, cada uma com o máximo de 20 caracteres ('A'-'Z'), e com no mínimo, uma letra ('A'-'Z').

Saída
Seu programa deverá apresentar o texto que foi distribuído por Mariazinha corrigido, segundo os critérios acima estabelecidos.

Exemplos de Entrada	Exemplos de Saída
2
OBO URU

OBI URI

3
EURO AVOID OBITS

EURO AVOID OBITS

10
URA URO URI URU UROS IBO OBA OBAS OBES OBE

URI URI URI URI UROS IBO OBI OBAS OBES OBI

Aquecimento para a OBI 2016
 */