package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    var testes = 0
    while (true) {
        val numeropalavras = ler.nextInt()
        if (numeropalavras == 0)
            break

        if (testes != 0)
            println()

        var maiorPalavra = 0
        val palavras = ArrayList<String>()
        for (i in 1..numeropalavras) {
            val palavra = ler.next()
            palavras.add(palavra)
            if (palavra.length > maiorPalavra)
                maiorPalavra = palavra.length
        }

        for (palavra in palavras) {
            val brancos = CharArray(maiorPalavra - palavra.length) { ' ' }.joinToString("")
            println("$brancos$palavra")
        }
        testes++
    }
}

/*
URI Online Judge | 1273
Justificador
Por TopCoder*  EUA

Timelimit: 1
Nós temos algumas palavras e queremos justificá-las à direita, ou seja, alinhar todas elas à direita. Crie um programa que, após ler várias palavras, reimprima estas palavras com suas linhas justificadas à direita.

Entrada
A entrada contém diversos casos de testes. A primeira linha de cada caso de teste conterá um inteiro N (1 ≤ N ≤ 50), que indicará o número de palavras que virão a seguir. Cada uma das N palavras contém no mínimo uma letra e no máximo 50 letras maiúsculas (‘A’-‘Z’). O fim da entrada é indicado por N = 0.

Saída
Para cada caso de teste imprima as palavras inserindo tantos espaços quanto forem necessários à esquerda de cada palavra, para que elas apareçam todas alinhadas à direita e na mesma ordem da entrada. Deixe uma linha em branco entre os casos de teste. Não deixe espaços sobrando no final de cada linha nem imprima espaços desnecessários à esquerda, de modo que pelo menos uma das linhas impressa em cada texto inicie com uma letra.

Exemplo de Entrada	Exemplo de Saída
3
BOB
TOMMY
JIM
4
JOHN
JAKE
ALAN
BLUE
4
LONGEST
A
LONGER
SHORT
0

  BOB
TOMMY
  JIM

JOHN
JAKE
ALAN
BLUE

LONGEST
      A
 LONGER
  SHORT

* Este problema é de autoria do TopCoder (www.topcoder.com/tc) e foi adaptado por bitfreeze para utilização (autorizada) no URI OJ.
* A reprodução não autorizada deste problema sem o consentimento por escrito de TopCoder, Inc. é estritamente proibida.
 */