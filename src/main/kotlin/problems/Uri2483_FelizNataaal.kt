package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val felicidade = ler.nextInt()
    print("Feliz nat")
    for (i in 0 until felicidade)
        print("a")
    println("l!")
}

/*URI Online Judge | 2483
Feliz Nataaal!
Por Jessica Dagostini, URI Online Judge BR Brazil

Timelimit: 1
Você fica tão feliz no natal que tem vontade de gritar para todo mundo: "Feliz natal!!". Pra colocar toda essa felicidade pra fora, você montou um programa que, colocado um índice I de felicidade, seu grito de natal é mais animado.

Entrada
A entrada é composta por um inteiro I (1 < I ≤ 104) que representa o índice de felicidade.

Saída
A saída é composta pela frase "Feliz natal!", sendo repetidas I vezes a última letra a da frase. Uma quebra de linha é necessária após a impressão da frase.

Exemplo de Entrada	Exemplo de Saída
5

Feliz nataaaaal!

Contest de Natal 2016.

 */