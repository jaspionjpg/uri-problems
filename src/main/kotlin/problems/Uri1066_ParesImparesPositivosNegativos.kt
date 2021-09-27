package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val listaNumeros = ArrayList<Int>()
    for (i in 1..5)
        listaNumeros.add(ler.nextInt())

    val pares = listaNumeros.count { numero -> numero % 2 == 0 }
    val impares = listaNumeros.count { numero -> numero % 2 != 0 }
    val positivos = listaNumeros.count { numero -> numero > 0 }
    val negativos = listaNumeros.count { numero -> numero < 0 }

    println("$pares valor(es) par(es)")
    println("$impares valor(es) impar(es)")
    println("$positivos valor(es) positivo(s)")
    println("$negativos valor(es) negativo(s)")
}

/*
URI Online Judge | 1066
Pares, Ímpares, Positivos e Negativos
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.

Exemplo de Entrada	Exemplo de Saída
-5
0
-3
-4
12

3 valor(es) par(es)
2 valor(es) impar(es)
1 valor(es) positivo(s)
3 valor(es) negativo(s)
 */