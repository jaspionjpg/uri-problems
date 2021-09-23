package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val mapinha = mapOf(1 to "Rolien", 2 to "Naej", 3 to "Elehcim", 4 to "Odranoel")

    val casosTeste: Int = ler.nextInt()
    for (i in 0 until casosTeste) {
        val numeroFeedbacks: Int = ler.nextInt()
        for (l in 0 until numeroFeedbacks) {
            val feedback: Int = ler.nextInt()
            println(mapinha[feedback])
        }
    }
}

/*
URI Online Judge | 1546
Feedback
Por Jean Bez, URI BR Brazil

Timelimit: 1
Muitos alunos de diversas universidades conhecem o portal de programação IRU. Este portal possui milhares de problemas de programação disponíveis. Diariamente a equipe do IRU recebe diversos feedbacks (elogios, bugs, dúvidas, sugestões, ...) que precisam primeiramente ser atribuídos para membros da equipe resolver.

Como a equipe é muito ocupada e não tem tempo para classificar estes feedbacks, você foi convidado a escrever um programa que faça isso e mostre quem será o membro responsável por resolver e responder o feedback.

Os membros responsáveis em cada setor são:

Elogios: Rolien
Bugs: Naej
Dúvidas: Elehcim
Sugestões: Odranoel
Entrada
O primeiro valor a ser lido é o número de casos de teste N (1 < N < 100). Cada caso de teste representa um dia de trabalho respondendo feedbacks. Cada caso de teste inicia com K (1 < K < 50), indicando o número de feedbacks recebidos naquela data. Seguem K linhas indicando a categoria de cada um dos feedbacks, conforme mostrado acima (1, 2, 3 ou 4).

Saída
Para cada caso de teste você deve imprimir o nome do membro da equipe responsável por responder o feedback.

Exemplo de Entrada	Exemplo de Saída
2
4
1
1
3
4
3
3
3
2

Rolien
Rolien
Elehcim
Odranoel
Elehcim
Elehcim
Naej

Aquecimento para a OBI 2014
 */