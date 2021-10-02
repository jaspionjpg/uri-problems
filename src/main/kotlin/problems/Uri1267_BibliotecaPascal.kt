package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val alumnis = ler.nextInt()
        val numerojantares = ler.nextInt()
        if (alumnis + numerojantares == 0)
            break
        val jantares = Array(numerojantares) { BooleanArray(alumnis) { ler.nextInt() == 1 } }

        var existe = false
        for (j in 0 until alumnis) {
            var somaPresencas = 0
            for (i in 0 until numerojantares)
                if (jantares[i][j])
                    somaPresencas++
            if (somaPresencas == numerojantares) {
                existe = true
                break
            }
        }

        if (existe)
            println("yes")
        else println("no")
    }
}

/*
URI Online Judge | 1267
Biblioteca Pascal
Por Ricardo Anido  Brasil

Timelimit: 1
A Universidade Pascal é uma das mais antigas do país e precisa renovar seu edifício da biblioteca, porque depois de todos esses séculos o edifício começou a mostrar os efeitos de suportar o peso da enorme quantidade de livros que abriga.

Para ajudar na renovação, a Associação de Antigos Alunos da Universidade decidiu organizar uma série de jantares para angariação de fundos, para os quais todos os alunos foram convidados. Estes eventos provaram ser um enorme sucesso e vários foram organizados durante o ano passado. (Uma das razões para o sucesso desta iniciativa parece ser o fato de que os alunos que passaram pelo sistema de ensino Pascal tem boas lembranças daquele tempo e gostariam de ver a Biblioteca da Universidade renovada.)

Os organizadores mantiveram uma planilha indicando quais alunos participaram de cada jantar. Agora eles querem sua ajuda para determinar se algum aluno ou aluna participou de todos os jantares.

Entrada
A entrada contém vários casos de teste. A primeira linha de um caso de teste contém dois inteiros N e D, respectivamente, indicando o número de Alumni e o número de jantares (dinners em inglês) organizados (1 ≤ N ≤ 100 e 1 ≤ D ≤ 500). Alumni são identificados por inteiros de 1 a N. Cada uma das próximas D linhas descreve os participantes de um jantar, e contém N inteiros Xi indicando se o alumnus/alumna participará (Xi = 1) ou não (Xi = 0) daquele jantar. O fim da entrada é determinado por N = D = 0.

Saída
Para cada caso de teste da entrada seu programa deve produzir uma linha de saída, contendo ou a palavra ‘yes’, no caso de existir existe pelo menos um alumnus/alumna que participou de todas as jantares, ou a palavra ‘no’ caso contrário. A saída deve ser escrita na saída padrão.

Alumna: um ex-aluno do sexo feminino de uma escola particular, faculdade ou universidade.
Alumnus: um ex-aluno do sexo masculino de uma escola particular, faculdade ou universidade.
Alumni: os ex-alunos de ambos os sexos de uma determinada escola, faculdade ou universidade.

Exemplo de Entrada	Exemplo de Saída
3 3
1 1 1
0 1 1
1 1 1
7 2
1 0 1 0 1 0 1
0 1 0 1 0 1 0
0 0

yes
no

ACM/ICPC South America Contest 2005
 */