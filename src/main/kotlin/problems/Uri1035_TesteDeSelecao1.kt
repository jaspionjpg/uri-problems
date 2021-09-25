package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val a = ler.nextInt()
    val b = ler.nextInt()
    val c = ler.nextInt()
    val d = ler.nextInt()

    if ((b > c) && (d > a) && ((c + d) > (a + b)) && (c >= 0 && d >= 0) && (a % 2 == 0))
        println("Valores aceitos");
    else
        println("Valores nao aceitos");
}

/*
URI Online Judge | 1035
Teste de Seleção 1
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Saída
Mostre a respectiva mensagem após a validação dos valores.

Exemplo de Entrada	Exemplo de Saída
5 6 7 8

Valores nao aceitos

2 3 2 6

Valores aceitos
 */