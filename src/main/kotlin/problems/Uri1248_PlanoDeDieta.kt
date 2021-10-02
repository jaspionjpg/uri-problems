package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextLine().toInt()
    for (teste in 1..testes) {
        val dieta = ler.nextLine().toCharArray().toMutableList()
        val cafeDaManha = ler.nextLine().toList()
        val almoco = ler.nextLine().toList()

        if (cafeDaManha.any { alimento -> !dieta.contains(alimento) } ||
            almoco.any { alimento -> !dieta.contains(alimento) }) {
            println("CHEATER")
            continue
        }

        dieta.removeAll(cafeDaManha)
        dieta.removeAll(almoco)

        println(dieta.sorted().joinToString(""))
    }
}

/*
URI Online Judge | 1248
Plano de Dieta
Por TopCoder*  EUA

Timelimit: 1
O doutor deu a você a sua dieta, na qual cada caractere corresponde a algum alimento que você deveria comer. Você também sabe o que você tem comido no café da manha e no almoço, nos quais cada caractere corresponde a um tipo de alimento que você deveria ter comido aquele dia. Você decidiu que irá comer todo o restante de sua dieta durante o jantar, e você quer imprimi-la como uma String (ordenada em ordem alfabética). Se você trapaceou de algum modo (ou por comer muito de tipo de alimento, ou por comer algum alimento que não está no plano de dieta), você deveria imprimir a cadeia "CHEATER" (significa trapaceiro), sem as aspas.

Entrada
A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Cada caso de teste é composto por três linhas, cada uma delas com uma string com até 26 caracteres de 'A'-'Z' ou vazia, representando respectivamente os alimentos da dieta, do café da manhã e do almoço.

Saída
Para cada caso de teste imprima uma string que representa os alimentos que você deveria consumir no jantar, ou "CHEATER" caso você tenha trapaceado na sua dieta.

Exemplo de Entrada	Exemplo de Saída
5
ABCD
AB
C
ABEDCS


EDSMB
MSD
A



IWANTSODER
SOW
RAT

D
ABCDES
CHEATER

DEIN
* Este problema é de autoria do TopCoder (www.topcoder.com/tc) e foi adaptado por Wisllay Vitrio para utilização (autorizada) no URI OJ.
* A reprodução não autorizada deste problema sem o consentimento por escrito de TopCoder, Inc. é estritamente proibida.
 */