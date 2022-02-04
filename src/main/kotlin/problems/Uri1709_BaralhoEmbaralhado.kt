package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val tamanhoBaralho = ler.nextInt()
    var contador = 1
    var posicao = 2
    while (posicao != 1) {
        if (posicao <= tamanhoBaralho / 2)
            posicao += posicao
        else
            posicao -= (tamanhoBaralho - posicao + 1)
        contador++
    }

    println(contador)
}

/*
[3, 0, 4, 1, 5, 2]
[1, 3, 5, 0, 2, 4]
[0, 1, 2, 3, 4, 5]

[4, 0, 5, 1, 6, 2, 7, 3]
[6, 4, 2, 0, 7, 5, 3, 1]
[7, 6, 5, 4, 3, 2, 1, 0]
[3, 7, 2, 6, 1, 5, 0, 4]
[1, 3, 5, 7, 0, 2, 4, 6]
[0, 1, 2, 3, 4, 5, 6, 7]

 */


/*
beecrowd | 1709
Baralho Embaralhado
Por Vinícius "Cabessa" Fernandes dos Santos BR Brazil

Timelimit: 1
Um baralho contém um número par 2n de cartas a1, a2,..., a2n, todas distintas (a1 < a2 ... < a2n). O baralho encontra-se perfeitamente ordenado, ou seja, a primeira carta é a1, a segunda carta é a2, e assim por diante, até a última carta, que é a2n.

Um croupier então executa repetidamente um procedimento de embaralhar, que consiste de dois passos:

O baralho é divido ao meio;
As cartas das duas metades são então intercaladas, de maneira que se a sequência de cartas do baralho no início do passo 1 é x1, x2, ..., x2n, então ao final do passo 2 a sequência de cartas se torna xn+1, x1, xn+2, x2,..., x2n, xn.
Dado o número de cartas do baralho, escreva um programa que determine quantas vezes o procedimento de embaralhar descrito acima deve ser re petido de forma que o baralho volte a ficar ordenado.

Entrada
A única linha da entrada contém um inteiro par P (2 ≤ P ≤ 2 x 105 ), indicando o número de cartas do baralho (note que o valor P corresponde ao valor 2n na descrição acima).

Saída
Seu programa deve produzir uma única linha contendo um único inteiro, o número mínimo de vezes que o processo de embaralhamento deve ser repetido para que o baralho fique novamente ordenado.

Exemplo de Entrada	Exemplo de Saída
6

3

Maratona de Programacao da SBC 2014
 */