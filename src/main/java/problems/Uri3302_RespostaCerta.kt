package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val numeroPerguntas = ler.nextInt()
    for (i in 1..numeroPerguntas)
        println("resposta $i: ${ler.nextInt()}")
}

/*
URI Online Judge | 3302
Resposta Certa
Por Ricardo Martins, Instituto Federal do Sul de Minas Gerais BR Brazil

Timelimit: 1
Roumes era um aluno acima da média. Nas provas de matemática, ele sempre tirava nota máxima, acertando todas as contas, mas o segredo dele não estava em fazer contas corretamente. Ele interpretava o que via no ambiente a sua volta e conseguia deduzir as respostas para as questões. Você também pode ser alguém especial, igual a Roumes.

Entrada
A entrada consiste em vários casos de teste. Cada caso contém um número N, representando a quantidade de perguntas. Nas N linhas seguintes, aparece o que você viu para chegar na resposta.

Saída
Para cada pergunta feita, imprima a palavra ‘resposta’, seguida por um espaço, depois pelo número da pergunta, por dois pontos, um espaço e a resposta.

Exemplos de Entrada	Exemplos de Saída
3
10
20
30

resposta 1: 10
resposta 2: 20
resposta 3: 30

2
40
50

resposta 1: 40
resposta 2: 50

11ª Olimpíada Interna de P
 */