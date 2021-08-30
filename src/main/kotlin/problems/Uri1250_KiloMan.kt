package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeroDeTestes = ler.nextInt()

    var vezesAtingido = 0

    for (i in 1..numeroDeTestes) {
        val numeroTiros = ler.nextInt()

        val listaTiros = ArrayList<Int>()

        for (i in 1..numeroTiros) {
            val alturaTiro = ler.nextInt() // entre 1 ate 7
            listaTiros.add(alturaTiro)
        }
        val sequenciaPulos = ler.next() // J = pulo | S = parado

        sequenciaPulos.forEachIndexed { index, c ->
            if (c == 'J' && listaTiros[index] > 2) vezesAtingido++
            if (c == 'S' && listaTiros[index] < 3) vezesAtingido++
        }
        println(vezesAtingido)
        vezesAtingido = 0
    }
}

/*
URI Online Judge | 1250
KiloMan
Por TopCoder*  EUA

Timelimit: 1
Você chegou a um dos últimos chefões no novo jogo de ação 2-D de deslocamento lateral, KiloMan. O chefão tem uma arma grande que pode atirar projéteis em várias alturas. Para cada tiro, KiloMan pode ficar parado ou pular. Se ele ficar parado e o tiro estiver na altura 1 ou 2, ele será atingido. Se ele pular e o tiro estiver a uma altura maior que 2, então ele também será atingido. Caso contrário, ele não é atingido. Dada a altura de cada tiro e a sequência de pulos, quantas vezes KiloMan será atingido?

Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N que indica o número de casos de teste. Cada caso de teste é composto por 3 linhas. A primeira linha contém um inteiro T (1 ≤ T ≤ 50) que indica o número de tiros. A segunda linha contém T inteiros, que representam a sequência das alturas às quais os tiros estão sendo disparados. Cada elemento da sequência será entre 1 e 7, inclusive. A terceira linha da entrada contém a string "pulos", que representa a sequência de pulos que KiloMan tentará; 'J' significa que ele irá pular e 'S' significa que ele ficará parado. Por exemplo, se o primeiro número da sequência de tiros for 3 e o primeiro caractere de "pulos" for 'J', então KiloMan pulará assim que o chefão atirar a uma altura 3 (e, portanto, ele será atingido).

Saída
Para cada caso, seu programa deve imprimir um inteiro representando o número de vezes que KiloMan é atingido.

Exemplo de Entrada	Exemplo de Saída
4
9
1 3 2 3 3 1 2 2 1
JJSSSJSSJ
49
1 1 1 1 1 1 1 2 2 2 2 2 2 2 3 3 3 3 3 3 3 4 4 4 4 4 4 4 5 5 5 5 5 5 5 6 6 6 6 6 6 6 7 7 7 7 7 7 7
SSSSSSSSSSSSSSJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ
4
1 2 2 1
SJJS
1
1
J

4
49
2
0

* Este problema é de autoria do TopCoder (www.topcoder.com/tc) e foi adaptado por Julio B. para utilização (autorizada) no URI OJ.
* A reprodução não autorizada deste problema sem o consentimento por escrito de TopCoder, Inc. é estritamente proibida.
 */