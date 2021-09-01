package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (ler.hasNext()) {
        val numero = ler.nextInt()

        for (i in 1..numero) {
            for (j in 1..numero) {
                if (i + j - 1 == numero)
                    print(2)
                else if (i == j)
                    print(1)
                else
                    print(3)
            }
            println()
        }
    }
}

/*
URI Online Judge | 1534
Matriz 123
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia um valor inteiro N que é o tamanho da matriz que deve ser impressa conforme o modelo fornecido.

Entrada
A entrada contém vários casos de teste e termina com EOF. Cada caso de teste é composto por um único inteiro N (3 ≤ N < 70), que determina o tamanho (linhas e colunas) de uma matriz que deve ser impressa.

Saída
Para cada N lido, apresente a saída conforme o exemplo fornecido.

Exemplo de Entrada	Exemplo de Saída
4
7

1332
3123
3213
2331
1333332
3133323
3313233
3332333
3323133
3233313
2333331
 */