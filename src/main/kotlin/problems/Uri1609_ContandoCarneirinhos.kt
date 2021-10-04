package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()

    for (teste in 1..testes) {
        val numCarneiros = ler.nextInt()

        val carneiros = mutableSetOf<Int>()

        for (carneiro in 1..numCarneiros)
            carneiros.add(ler.nextInt())

        println(carneiros.size)
    }
}

/*
URI Online Judge | 1609
Contando Carneirinhos
Por Bruno Adami, Universidade de São Paulo - São Carlos BR Brazil

Timelimit: 1
Para dormir você resolveu contar carneirinhos. O sono está demorando muito para vir e você percebeu que alguns carneirinhos estão se repetindo! Cada um deles é identificado por um número inteiro único, desta forma você vai evitar contar os repetidos.

Dado a sequência dos carneirinhos, imprima quantos de verdade você contou, ou seja, imprima o número de carneirinhos distintos.

Entrada
Na primeira linha você terá um inteiro T (T = 100*) indicando o número de casos de teste.

Na primeira linha de cada caso teremos o número inteiro N (1 ≤ N ≤ 100* ou 1 ≤ N ≤ 104​**), indicando o número de carneirinhos. Na próxima linha teremos N inteiros separados por espaço indicando a sequência de carneirinhos.

Os identificadores dos carneiros irão de 0 até 109, inclusive.

*Ocorre em aproximadamente 90% dos casos de teste;

**Ocorre nos demais casos de teste.

Saída
Imprima o número de carneirinhos distintos para cada caso.

Exemplo de Entrada	Exemplo de Saída
3

3

1 2 3

3

1 2 1

5

100 1 1 0 0

3

2

3

Seletiva USP São Carlos - Segunda Prova 2014
 */