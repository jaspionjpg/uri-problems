package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var nota1 = -1.0
    while (true) {
        val nota = ler.nextDouble()
        if (nota in 0.0..10.0)
            if (nota1 == -1.0)
                nota1 = nota
            else {
                println("media = %.2f".format((nota1 + nota) / 2))
                break
            }
        else println("nota invalida")
    }
}

/*
URI Online Judge | 1117
Validação de Nota
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

Entrada
A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas válidas.

Saída
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. O valor deve ser apresentado com duas casas após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
-3.5
3.5
11.0
10.0

nota invalida
nota invalida
media = 6.75

Agradecimentos a Cássio F.
 */