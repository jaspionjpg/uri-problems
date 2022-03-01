package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numero = ler.next()

    if (numero.contains("13")) println("$numero es de Mala Suerte")
    else println("$numero NO es de Mala Suerte")
}

/*
beecrowd | 3300
Números Má Sorte Recarregados
Por Tomas Peiretti, UTN - FRSF AR Argentina

Timelimit: 1
Um número número 3 é de má sorte se contém um 1 seguido por um 3 entre seus dígitos. Por exemplo, o número 341329 é de má sorte, enquanto o número 26771 não é.

Dado um inteiro N, seu programa terá que determinar se N é azarado ou não.

Entrada
A entrada consiste em um número positivo N (0 <= N <= 10^100).

Saída
Imprima a mensagem "N es de Mala Suerte" se N é de má sorte, caso contrário imprima "N NO es de Mala Suerte".

Exemplo de Entrada	Exemplo de Saída
13

13 es de Mala Suerte

12321

12321 NO es de Mala Suerte

Fonte: Cheeto - OmegaUp
 */