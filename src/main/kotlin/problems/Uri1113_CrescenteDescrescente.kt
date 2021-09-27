package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (true) {
        val numero1 = ler.nextInt()
        val numero2 = ler.nextInt()
        if (numero1 == numero2)
            break

        if (numero1 > numero2)
            println("Decrescente")
        else println("Crescente")
    }
}

/*
URI Online Judge | 1113
Crescente e Decrescente
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.

Entrada
A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.

Saída
Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente, caso contrário imprima a mensagem “Decrescente”.

Exemplo de Entrada	Exemplo de Saída
5 4
7 2
3 8
2 2

Decrescente
Decrescente
Crescente

Formatação e inserção no portal por Cássio Favaretto.
 */