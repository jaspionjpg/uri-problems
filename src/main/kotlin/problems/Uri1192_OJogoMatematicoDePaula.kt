package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val n: Int = ler.nextInt()
    for (i in 0 until n) {
        val situacao: String = ler.next()

        val numero1 = situacao[0] - '0'
        val numero2 = situacao[2] - '0'

        if (numero1 == numero2)
            println(numero1 * numero2)
        else if (situacao[1].isLowerCase())
            println(numero1 + numero2)
        else
            println(numero2 - numero1)
    }
}

/*
URI Online Judge | 1192
O jogo Matemático de Paula
Por Neilor Tonin, URI  Brasil

Timelimit: 2
Paula simplesmente adora matemática. Seu maior passatempo é ficar inventando jogos ou atividades que a envolvam para brincar com seus amiguinhos. Obviamente, nem todos eles não são tão apaixonados assim por matemática e têm muita dificuldade para resolver as brincadeiras propostas por ela. Agora Paula inventou um pequeno passatempo que envolve 3 caracteres: um dígito numérico, uma letra e outro dígito numérico.

Se a letra for maiúscula, deve-se subtrair o primeiro dígito do segundo. Se a letra for minúscula, deve-se somar ambos os dígitos e se os DÍGITOS forem iguais, deve-se desconsiderar a letra e mostrar o produto entre os dois dígitos. Ela pediu para seu amigo Marcelo, que é bom em programação, para criar um programa para que encontre a solução para cada uma das sequências que Paula lhe apresentar.

Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N, indicando o número de casos de teste que virão a seguir. Cada caso de teste é uma sequência de três caracteres criada por Paula. Esta sequência contém na primeira posição um caractere de '0' a '9', na segunda posição uma letra maiúscula ou minúscula do alfabeto e na terceira posição outro caractere de '0' a '9'.

Saída
Para cada caso de teste, deve ser impressa uma linha com um valor inteiro que representa a solução da sequência proposta por Paula.

Exemplo de Entrada	Exemplo de Saída
5
4A5
3A3
4f2
2G4
7Z1

1
9
6
2
-6
 */