package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()

    val numLed = mapOf(
        '1' to 2,
        '2' to 5,
        '3' to 5,
        '4' to 4,
        '5' to 5,
        '6' to 6,
        '7' to 3,
        '8' to 7,
        '9' to 6,
        '0' to 6
    )

    for (teste in 1..testes) {
        val somaDeLeds = ler.next().map { caractere -> numLed[caractere]!! }.sum()
        println("$somaDeLeds leds")
    }
}
/*
URI Online Judge | 1168
LED
Autor Desconhecido
Timelimit: 1
João quer montar um painel de leds contendo diversos números. Ele não possui muitos leds, e não tem certeza se conseguirá montar o número desejado. Considerando a configuração dos leds dos números abaixo, faça um algoritmo que ajude João a descobrir a quantidade de leds necessário para montar o valor.




Entrada
A entrada contém um inteiro N, (1 ≤ N ≤ 1000) correspondente ao número de casos de teste, seguido de N linhas, cada linha contendo um número (1 ≤ V ≤ 10100) correspondente ao valor que João quer montar com os leds.

Saída
Para cada caso de teste, imprima uma linha contendo o número de leds que João precisa para montar o valor desejado, seguido da palavra "leds".

Exemplo de Entrada	Exemplo de Saída
3
115380
2819311
23456

27 leds
29 leds
25 leds

Agradecimentos a Cassio F.
 */