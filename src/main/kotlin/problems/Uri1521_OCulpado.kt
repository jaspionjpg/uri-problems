package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val numalunos = ler.nextInt()
        if (numalunos == 0)
            break

        val alunos = IntArray(numalunos) { ler.nextInt() - 1 }
        var alunoAInvestigar = ler.nextInt() - 1

        for (i in 1..numalunos) {
            if (alunos[alunoAInvestigar] == alunoAInvestigar)
                break
            else
                alunoAInvestigar = alunos[alunoAInvestigar]
        }
        println(alunoAInvestigar + 1)
    }
}

/*
URI Online Judge | 1521
O Culpado
Por Cristhian Bonilha, UTFPR BR Brazil

Timelimit: 1
Guerra de bolinha de papel é uma das brincadeiras mais clássicas do tempo do colegial, e algumas pessoas gostam tanto que iniciam essas guerras em plena faculdade. As regras são simples: Mire e acerte alguém com uma bola de papel.

Os professores, por outro lado, não acham tal brincadeira tão produtiva, uma vez que isso tira a atenção da aula sendo dada. Pior ainda, é quando um aluno acerta o professor com a bola de papel.

O professor dessa vez decidiu investigar quem participava da brincadeira, e disse que estaria satisfeito se ao menos um deles fosse descoberto, para servir de exemplo aos outros.

O processo de investigação do professor acontece da seguinte forma: inicia-se perguntando a um aluno K se ele participava da brincadeira ou, caso não participasse, que dissesse quem participava. Se o aluno K se entregasse, a investigação terminaria. Caso contrário, ele diria o número de outro aluno, e o processo se repetiria com o professor fazendo a pergunta para este novo aluno, até que alguém se entregue.

O professor disponibilizou uma lista contendo a resposta de todos os alunos para a sua pergunta, e pediu sua ajuda para descobrir, se ele iniciasse a investigação no aluno K, quem acabaria se entregando?

É garantido que alguém acabará se entregando.

Entrada
Haverá diversos casos de teste. Cada caso de teste inicia com um inteiro N (3 ≤ N ≤ 50).

A seguir, haverão N inteiros ni (1 ≤ ni ≤ N, para todo 1 ≤ i ≤ N), onde cada inteiro ni significa que o aluno i entregou o aluno ni.

Ou seja, se o terceiro número for 4, significa que o terceiro aluno entregou o quarto aluno. Se, ao contrário, o número for o dele mesmo, significa que ele se entregou.

Em seguida haverá um inteiro K (1 ≤ K ≤ N), indicando quem foi o aluno com o qual o professor iniciou sua investigação.

O último caso de teste é identificado quando N = 0, o qual não deve ser processado.

Saída
Para cada caso de teste, deverá ser impressa uma linha, contendo um inteiro, indicando qual o aluno que terminou se entregando.

Exemplo de Entrada	Exemplo de Saída
3
2 3 3
1
3
1 3 2
1
0

3
1
 */