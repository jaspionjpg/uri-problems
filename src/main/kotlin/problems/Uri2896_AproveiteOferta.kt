package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeroDeTestes = ler.nextInt()

    for (i in 1..numeroDeTestes) {
        val garrafasCompradas = ler.nextInt()
        val garrafasParaTrocar = ler.nextInt()

        val garrafasGanhas = garrafasCompradas / garrafasParaTrocar
        val garrafasSobraram = garrafasCompradas % garrafasParaTrocar
        println(garrafasGanhas + garrafasSobraram)
    }
}

/*
URI Online Judge | 2896
Aproveite a Oferta
Por Paulo E. D. Pinto, UERJ- Universidade do Estado do Rio de Janeiro BR Brazil

Timelimit: 1
Um supermercado está fazendo uma promoção de venda de refrigerantes. Se um dia você comprar refrigerantes e levar os cascos vazios no dia seguinte, ela troca cada conjunto de K garrafas vazias  por uma garrafa cheia. Um cliente quer aproveitar ao máximo essa oferta e por isso comprou várias garrafas no primeiro dia da promoção. Agora ele quer saber quantas garrafas terá ao final do segundo dia da promoção, se usá-la ao máximo.

Faça um programa para calcular isso.

Entrada
A primeira linha de entrada contém inteiro T (1 ≤ T ≤ 10000) , que indica o número de casos de teste. Em cada uma das T linhas a seguir vêm dois inteiros N e K (1 ≤ K, N ≤ 10000),  respectivamente o número de refrigerantes comprados e o número de garrafas vazias para ganhar uma cheia.

Saída
Para cada caso de teste imprima o número de garrafas que o cliente terá no segundo dia, se aproveitar ao máximo a oferta.

Exemplo de Entrada	Exemplo de Saída
3
7 4
4 7
4000 7

4
4
574

 */