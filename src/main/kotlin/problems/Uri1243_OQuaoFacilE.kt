package problems

import java.util.Scanner
import kotlin.math.ceil

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNextLine()) {
        val linha = ler.nextLine().trim()

        var somaCaracteres = 0
        var palavrasContabilizadas = 0

        val palavras = linha.split(" ")
        for (i in palavras.indices) {
            if (!palavras[i].contains(Regex("[0-9]")))
                if (palavras[i].contains(".")) {
                    if (palavras[i].length > 1 && palavras[i].indexOf(".") == palavras[i].length - 1) {
                        palavrasContabilizadas++
                        somaCaracteres += palavras[i].replace(".", "").length
                    }
                } else {
                    somaCaracteres += palavras[i].length
                    palavrasContabilizadas++
                }
        }
        if (palavrasContabilizadas == 0)
            palavrasContabilizadas = 1

        val media = ceil((somaCaracteres / palavrasContabilizadas).toDouble()).toInt()
        if (media <= 3)
            println(250)
        else if (media <= 5)
            println(500)
        else
            println(1000)
    }
}

/*
URI Online Judge | 1243
O Quão Fácil é...
Por TopCoder*  EUA

Timelimit: 1
TopCoder decidiu automatizar o processo de atribuição de níveis de dificuldade para os problemas. Os desenvolvedores do TopCoder concluíram que a dificuldade do problema esta relacionado apenas ao comprimento médio das palavras do enunciado do problema. Se o comprimento médio das palavras do enunciado é menor ou igual a 3, o problema recebe dificuldade de 250 pontos. Se o comprimento médio das palavras do enunciado for 4 ou 5, o problema recebe dificuldade de 500 pontos. Se o comprimento médio das palavras do enunciado for maior ou igual a 6, o problema recebe dificuldade de 1000 pontos.


Definições:

Símbolo: um conjunto de carateres ligados em ambos os lados por espaços, ou pelo início da descrição do problema, ou ainda pelo fim da descrição do problema.

Palavra: um símbolo que contenha apenas letras a-z ou A-Z, e pode terminar com um único ponto.

Comprimento da palavra: número de letras de uma palavra (um ponto não é uma letra).


Exemplos de símbolos que são palavras (aspas duplas apenas para exemplificar): "AB", "ab".

Exemplo de símbolos que não são palavras: "ab..", "a.b", ".ab", "a.b.", "a2b.", ".".


O comprimento médio das palavras é dado pela soma dos tamanhos das palavras do enunciado dividido pelo numero de palavras, a divisão é feita por números inteiros. Se o número de palavras for zero, então o comprimento médio das palavras é zero.


Sua tarefa é dado o enunciado do problema, computar a sua classificação de dificuldade do problema, que poderá ser 250, 500, ou 1000.

Entrada
A entrada contém vários casos de teste. Cada caso de teste é composto por uma linha que contém o enunciado de um problema, é uma string que contém entre 1 e 50 caracteres ('A'-'Z', 'a'-'z', '0'-'9', ' ', '.'), inclusive. O final da entrada é determinado por EOF.

Saída
Compute o comprimento médio das palavras do enunciado do problema, e mostre a classificação do problema, para mais detalhes olhe o exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
This is a problem statement
523hi.
Implement a class H5 which contains some method.
 no9 . wor7ds he8re. hj..

500
250
500
250

* Este problema é de autoria do TopCoder (www.topcoder.com/tc) e foi adaptado por Jeferson T. para utilização (autorizada) no URI OJ.
* A reprodução não autorizada deste problema sem o consentimento por escrito de TopCoder, Inc. é estritamente proibida.
 */