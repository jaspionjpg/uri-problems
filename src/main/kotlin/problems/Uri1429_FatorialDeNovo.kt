package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val numero = ler.next()
        if (numero == "0")
            break

        var soma = 0
        for (caractere in numero.indices)
            soma += (numero[caractere] - '0') * (somar(numero.length - caractere))
        println(soma)
    }
}

private fun somar(numero: Int): Int {
    var soma = 1
    for (i in 1..numero)
        soma *= i
    return soma
}

/*
URI Online Judge | 1429
Fatorial de Novo!
Por Ines Kereki  Uruguai
Timelimit: 3
Mateus, um calouro de engenharia, está desenvolvendo uma nova notação posicional para representar números inteiros. Ele o apelidou de "A Curious Method" ("Um Método Curioso"), representado pela sigla ACM. A notação ACM usa os mesmos dígitos que a notação decimal, isto é, de 0 a 9.

Para converter um número A da notação ACM para a notação decimal, você deve adicionar k termos, onde k é o número de dígitos de A (na notação ACM), O valor do i-ésimo termo, correspondente ao i-ésimo dígito ai, contando da direita para a esquerda, é ai × i!. Por exemplo, 719ACM é equivalente a 5310, já que 7 × 3! + 1 × 2! + 9 × 1! = 53.

Mateus acabou de iniciar seus estudos sobre teoria dos números, e provavelmente não sabe quais propriedades um sistema numérico deve ter, mas no momento, ele só está interessado em converter um número de ACM para decimal. Você pode ajudá-lo?

Entrada
Cada caso de teste é dado por uma única linha não-nula contendo, no máximo, 5 dígitos, representando um número na notação ACM. A linha não possui zeros no início.

O último caso de teste é representado por uma linha contendo um único zero.

Saída
Para cada caso de teste, escreva uma única linha contendo a representação decimal do número ACM correspondente.

Exemplo de Entrada	Exemplo de Saída
719
1
15
110
102
0

53
1
7
8
8

ACM/ICPC South America Contest 2010.
 */