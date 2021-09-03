package problems

import java.util.Collections
import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val n = ler.nextInt()
        val m = ler.nextInt()

        if (n == 0 && m == 0)
            break

        var lista = ArrayList<Valor>()
        for (i in 1..n) {
            val numero = ler.nextInt()
            lista.add(
                Valor(
                    numero,
                    (numero % m),
                    numero % 2 == 0
                )
            )
        }

        Collections.sort(lista) { n1, n2 ->
            if (n1.mod == n2.mod) {
                if (n1.par != n2.par)
                    if (n1.par) 1
                    else -1
                else if (!n1.par)
                    if (n2.numero > n1.numero) 1 else -1 // descrecente
                else if (n1.numero > n2.numero) 1 else -1 // crescente
            } else
                if (n1.mod > n2.mod) 1 else -1
        }

        println("$n $m")
        lista.forEach {
            println(it.numero)
        }
    }

    println("0 0")
}

class Valor(
    val numero: Int,
    val mod: Int,
    val par: Boolean
)
/*
URI Online Judge | 1252
Sort! Sort!! e Sort!!!
Por Shahriar Manzoor,  Bangladesh

Timelimit: 2
Hmm! Aqui você foi solicitado a fazer uma simples ordenação. A você serão dado N números e um inteiro positivo M. Você terá que ordenar estes N números em ordem ascendente de seu módulo M. Se houver um empate entre um número ímpar e um número par (para os quais o seu módulo M dá o mesmo valor) então o número impar irá preceder o número par. Se houver um empate entre dois números ímpares (para os quais o seu módulo M dá o mesmo valor), então o maior número ímpar irá preceder o menor número ímpar. Se houve um empate entre dois números pares (para os quais o seu módulo M dá o mesmo valor), então o menor número par irá preceder o maior número par. Para o resto de valores negativos siga a regra de linguagem de programação C: um número negativo nunca pode ter módulo maior do que zero. Por exemplo, -100 MOD 3 = -1, -100 MOD 4 = 0, etc.

Entrada
A entrada contém vários casos de teste. Cada caso de teste inicia com dois inteiros  N (0 < N ≤ 10000) e M (0 < M ≤ 10000) que denotam quantos números existirão neste conjunto. Cada uma das próximas N linhas conterá um número cada. Estes números deverão caber em um inteiro de 32 bits com sinal. A entrada é terminada por uma linha que conterá dois valores nulos (0) e não deve ser processada.

Saída
A primeira linha de cada conjunto de saída irá contér os valores de N e M. As próximas N linhas irão contér N números, ordenados de acordo com as regras acima mencionadas. Imprima os dois últimos zeros da entrada para a saída padrão.

Exemplo de Entrada	Exemplo de Saída
15 3
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
3 3
9
12
10
0 0

15 3
15
9
3
6
12
13
7
1
4
10
11
5
2
8
14
3 3
9
12
10
0 0

Agradecimento especial a Syed Monowar Hossain. Tradução, entrada e saída por Neilor.
 */