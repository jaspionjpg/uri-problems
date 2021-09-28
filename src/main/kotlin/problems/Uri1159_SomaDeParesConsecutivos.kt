package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val numero = ler.nextInt()
        if (numero == 0)
            break

        var soma = 0
        for (num in numero until numero + 2 * 5) {
            if (num % 2 == 0)
                soma += num
        }
        println(soma)
    }
}

/*
URI Online Judge | 1159
Soma de Pares Consecutivos
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá parar quando o valor de X for igual a 0). Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X , se for par. Se o valor de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da operação: 4+6+8+10+12, enquanto que se o valor de entrada for 11, por exempo, a saída deve ser 80, que é a soma de 12+14+16+18+20.

Entrada
O arquivo de entrada contém muitos valores inteiros. O último valor do arquivo é zero.

Saída
Imprima a saida conforme a explicação acima e o exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
4
11
0

40
80
 */