package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var maiorPalavra = ""
    while (true) {
        val frase: String = ler.nextLine()
        if (frase == "0")
            break

        val palavras = frase.split(" ")
        val listaTamanhos = IntArray(palavras.size)

        for (indice in palavras.indices) {
            if (palavras[indice].length >= maiorPalavra.length)
                maiorPalavra = palavras[indice]

            listaTamanhos[indice] = palavras[indice].length
        }
        println(listaTamanhos.joinToString("-"))
    }
    println("\nThe biggest word: $maiorPalavra")
}

/*
URI Online Judge | 2108
Contando Caracters
Por Leandro Matheus & Leticia Mayumi, IFPR BR Brazil

Timelimit: 3
Matheus estava conversando com a sua noiva via mensagem de texto, quando ela lhe enviou a seguinte mensagem:

1-4-3

Ele não entendeu a mensagem, então ele perguntou o que isso significava, e ela respondeu que era 'I Love You" e logo ele percebeu que cada número separado por um ' - ' é a quantidade de caracteres de cada uma das palavras que compõem a frase. Com isso, ele teve a ideia de criar um programa que inserindo determinada frase, ele calcula a quantidade de caracteres de cada uma das palavras e separa os valores por ' - '. Mas ele ainda teve a ideia de que o programa deveria receber várias frases linha por linha e ainda no final da execução do programa, a palavra com a maior quantidade de letras deveria ser exibida.

Entrada
A entrada consiste de vários casos de teste. A primeira linha de um caso de teste contém uma 1 ≤ String ≤ 100 com uma única palavra ou um conjunto de palavras que formam uma frase. Os casos de teste serão processados quando o número 0 for recebido. Não pode haver mais que um espaço separando cada palavra.

Saída
Para cada caso de teste, exiba o número de caracteres de cada palavra que compõe a frase recebida. Separe a quantidade de caracteres de cada palavra por um ' - '. Exiba também a palavra com a maior quantidade de caracteres de todas as frases recebidas.

Obs: Se possuir palavras com números identicos de caracteres, cosiderar a última recebida.

Exemplo de Entrada	Exemplo de Saída
i love you
squirtle squirtle squirtle
chondrocraniums
coal is so dark
lacing your dreams
te t e te t e te t e te
0

1-4-3
8-8-8
15
4-2-2-4
6-4-6
2-1-1-2-1-1-2-1-1-2

The biggest word: chondrocraniums

LM.
 */