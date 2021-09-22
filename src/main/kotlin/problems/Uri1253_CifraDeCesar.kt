package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes: Int = ler.nextInt()
    for (i in 0 until testes) {
        val linha = ler.next()
        val numeroafrente: Int = ler.nextInt()

        var novaFrase = ""

        for (letra in linha)
            novaFrase += if (letra - numeroafrente < 'A')
                (letra - numeroafrente + 26)
            else (letra - numeroafrente)

        println(novaFrase)
    }
}

/*
URI Online Judge | 1253
Cifra de César
By TopCoder*  USA

Timelimit: 1
Júlio César usava um sistema de criptografia, agora conhecido como Cifra de César, que trocava cada letra pelo equivalente em duas posições adiante no alfabeto (por exemplo, 'A' vira 'C', 'R' vira 'T', etc.). Ao final do alfabeto nós voltamos para o começo, isto é 'Y' vira 'A'. Nós podemos, é claro, tentar trocar as letras com quaisquer número de posições.

Entrada
A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Cada caso de teste é composto por duas linhas. A primeira linha contém uma string com até 50 caracteres maiúsculos ('A'-'Z'), que é a sentença após ela ter sido codificada através desta Cifra de César modificada. A segunda linha contém um número que varia de 0 a 25 e que representa quantas posições cada letra foi deslocada para a direita.

Saída
Para cada caso de teste de entrada, imprima uma linha de saída com o texto decodificado (transformado novamente para o texto original) conforme as regras acima e o exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
6
VQREQFGT
2
ABCDEFGHIJKLMNOPQRSTUVWXYZ
10
TOPCODER
0
ZWBGLZ
25
DBNPCBQ
1
LIPPSASVPH
4

TOPCODER
QRSTUVWXYZABCDEFGHIJKLMNOP
TOPCODER
AXCHMA
CAMOBAP
HELLOWORLD

* This problem is of authory and propriety of TopCoder (www.topcoder.com/tc) and adapted by Vanessa Leite for authorized use in URI OJ.
* Unauthorized reproduction of this problem statement without the prior written consent of TopCoder, Inc. is strictly prohibited.
 */