package problems

import java.util.Collections
import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var testes = 0
    while (true) {
        val numeroJogadores = ler.nextLine().toInt()
        if (numeroJogadores == 0)
            break

        if (testes != 0)
            println()

        var jogadores = ArrayList<Triple<String, String, String>>()
        for (i in 1..numeroJogadores) {
            val nome = ler.nextLine()
            val (cor, tamanhoCamisa) = ler.nextLine().split(" ")
            jogadores.add(Triple(nome, cor, tamanhoCamisa))
        }

        Collections.sort(jogadores, Comparator { o1, o2 ->
            val (nome1, cor1, tamanho1) = o1
            val (nome2, cor2, tamanho2) = o2

            if (cor1 != cor2)
                cor1.compareTo(cor2)
            else if (tamanho1 != tamanho2)
                tamanho2.compareTo(tamanho1)
            else nome1.compareTo(nome2)
        })

        for (jogador in jogadores) {
            val (nome, cor, tamanho) = jogador
            println("$cor $tamanho $nome")
        }
        testes++
    }
}

/*
URI Online Judge | 1258
Camisetas
Por Neilor Tonin, URI  Brasil

Timelimit: 1
O professor Rolien organizou junto às suas turmas de Ciência da Computação a confecção de uma camiseta polo que fosse ao mesmo tempo bonita e barata. Após algumas conversas, ficou decidido com os alunos que seriam feitas somente camisetas da cor preta, o que facilitaria a confecção. Os alunos poderiam escolher entre o logo do curso e os detalhes em branco ou vermelho. Assim sendo, Rolien precisa de sua ajuda para organizar as listas de quem quer a camiseta em cada uma das turmas, relacionando estas camisetas pela cor do logo do curso, tamanho (P, M ou G) e por último pelo nome.

Entrada
A entrada contém vários casos de teste. Cada caso de teste inicia com um valor N, (1 ≤ N ≤ 60) inteiro e positivo, que indica a quantidade de camisetas a serem feitas para aquela turma. As próximas N*2 linhas contém informações de cada uma das camisetas (serão duas linhas de informação para cada camiseta). A primeira linha irá conter o nome do estudante e a segunda linha irá conter a cor do logo da camiseta ("branco" ou "vermelho") seguido por um espaço e pelo tamanho da camiseta "P" "M" ou "G". A entrada termina quando o valor de N for igual a zero (0) e esta valor não deverá ser processado.

Saída
Para cada caso de entrada deverão ser impressas as informações ordenadas pela cor dos detalhes em ordem ascendente, seguido pelos tamanhos em ordem descendente e por último por ordem ascendente de nome, conforme o exemplo abaixo.

Obs.: Deverá ser impressa uma linha em branco entre dois casos de teste.

Exemplo de Entrada	Exemplo de Saída
9
Maria Jose
branco P
Mangojata Mancuda
vermelho P
Cezar Torres Mo
branco P
Baka Lhau
vermelho P
JuJu Mentina
branco M
Amaro Dinha
vermelho P
Adabi Finho
branco G
Severina Rigudinha
branco G
Carlos Chade Losna
vermelho P
3
Maria Joao
branco P
Marcio Guess
vermelho P
Maria Jose
branco P
0

branco P Cezar Torres Mo
branco P Maria Jose
branco M JuJu Mentina
branco G Adabi Finho
branco G Severina Rigudinha
vermelho P Amaro Dinha
vermelho P Baka Lhau
vermelho P Carlos Chade Losna
vermelho P Mangojata Mancuda

branco P Maria Joao
branco P Maria Jose
vermelho P Marcio Guess
 */