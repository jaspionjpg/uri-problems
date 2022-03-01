package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val felicidade = ler.nextInt()

    val repeticoes = "a".repeat(felicidade)

    println("Ent${repeticoes}o eh N${repeticoes}t${repeticoes}l!")
}

/*
beecrowd | 2926
Então é Natal!
Por Jessica Dagostini, beecrowd BR Brazil

Timelimit: 1
Você sempre fica tão animado nesta época do ano que adora falar sobre isso o tempo todo! Neste ano, você tem gritado aos quatro ventos: Então é natal!! Colocando toda essa felicidade pra fora, você montou novamente um programa neste ano que, colocando um índice I de felicidade, seu grito de "Então é Natal!" é cada vez mais animado!

Entrada
A entrada é composta por um inteiro I (1 < I ≤ 104) que representa o seu índice de felicidade.

Saída
A saída é composta pela frase "Entao eh Natal!", sendo repetidas I vezes as letras a da frase. Uma quebra de linha é necessária após a impressão da frase.

Exemplo de Entrada	Exemplo de Saída
5

Entaaaaao eh Naaaaataaaaal!

Contest de Natal 2018
 */