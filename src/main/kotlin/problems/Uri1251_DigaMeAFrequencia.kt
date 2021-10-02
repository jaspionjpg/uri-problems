package problems

import java.util.Collections
import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val comparator: (o1: MutableMap.MutableEntry<Char, Int>, o2: MutableMap.MutableEntry<Char, Int>) -> Int =
        { letra1, letra2 ->
            if (letra1.value == letra2.value)
                letra2.key.toInt() - letra1.key.toInt()
            else letra1.value - letra2.value
        }

    var testes = 0
    while (ler.hasNextLine()) {
        if (testes != 0)
            println()

        val frase = ler.nextLine()

        var letras = mutableMapOf<Char, Int>()
        for (caractere in frase)
            letras[caractere] = (letras[caractere] ?: 0) + 1

        val comparator: (o1: MutableMap.MutableEntry<Char, Int>, o2: MutableMap.MutableEntry<Char, Int>) -> Int =
            { letra1, letra2 ->
                if (letra1.value == letra2.value)
                    letra2.key.toInt() - letra1.key.toInt()
                else letra1.value - letra2.value
            }

        var letrasOrdenadas = letras.entries.toList()

        Collections.sort(letrasOrdenadas, comparator)

        for (letra in letrasOrdenadas) {
            println("${letra.key.toInt()} ${letra.value}")
        }
        testes++
    }
}

/*
URI Online Judge | 1251
Diga-me a Frequência
Por Shahriar Manzoor,  Bangladesh

Timelimit: 1
Dada uma linha de texto, você deve encontrar as frequências de cada um dos caracteres presentes nela. As linhas fornecidas não conterão nenhum dos primeiros 32 ou dos últimos 128 caracteres da tabela ASCII. É claro que não estamos levando em conta o caracter de fim de linha.

Entrada
A entrada contém vários casos de teste. Cada caso de teste é composto por uma única linha de texto com até 1000 caracteres.

Saída
Imprima o valor ASCII de todos os caracteres presentes e a sua frequência de acordo com o formato abaixo. Uma linha em branco deverá separar 2 conjuntos de saída. Imprima os caracteres ASCII em ordem ascendente de frequência. Se dois caracteres estiverem presentes com a mesma quantidade de frequência, imprima primeiro o caracter que tem valor ASCII maior. A entrada é terminada por final de arquivo (EOF).

Exemplo de Entrada	Exemplo de Saída
AAABBC
122333

67 1
66 2
65 3

49 1
50 2
51 3

I/O by Neilor
 */