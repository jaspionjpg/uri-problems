package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val quantidadeCriancas = ler.nextInt()
        if (quantidadeCriancas == 0)
            break

        val criancas = ArrayList<Pair<String, Int>>()
        for (i in 0 until quantidadeCriancas) {
            val nome = ler.next()
            val numeroCrianca = ler.nextInt()
            criancas.add(nome to numeroCrianca)
        }

        val criancasNaBrincadeira = BooleanArray(quantidadeCriancas) { true }

        var aEliminar = criancas[0].second
        var contador = 0

        var indice = 0

        var criancaseliminadas = 0
        while (criancaseliminadas < quantidadeCriancas - 1) {

            if (aEliminar % 2 != 0) indice++
            else indice--
            if (indice >= quantidadeCriancas)
                indice = 0
            else if (indice < 0)
                indice = quantidadeCriancas - 1

            if (criancasNaBrincadeira[indice]) {
                contador++

                if (contador == aEliminar) {
                    criancasNaBrincadeira[indice] = false
                    aEliminar = criancas[indice].second
                    contador = 0
                    criancaseliminadas++
                }
            }
        }
        val indexGanhador = criancasNaBrincadeira.indexOfFirst { brincando -> brincando }
        println("Vencedor(a): ${criancas[indexGanhador].first}")
    }
}

/*
URI Online Judge | 1167
Acampamento de Férias
Por Neilor Tonin, URI  Brasil

Timelimit: 2
Nas férias de Julho, várias escolas de uma mesma região resolveram se organizar e levaram uma parte de seus alunos para um acampamento de férias por uma semana. Nestes acampamentos os alunos são divididos em chalés coletivos por gênero e idade, sempre com um supervisor ou supervisora que, além de dormirem com o grupo no chalé, também são responsáveis por criar e executar várias atividades interessantes e animadas, para todas as idades. Dentre as diversas atividades podem-se citar jogos, excursões, Gincana Musical, Gincanas Noturnas, etc. No primeiro dia de acampamento, devido à forte chuva, as atividades recreativas ficaram limitadas e as crianças foram levadas para o ginásio de esportes. Foi realizada uma gincana e uma das atividades da mesma consistiu em agrupar as crianças em um círculo (organizado no sentido anti-horário) do qual seriam retiradas uma a uma até que sobrasse apenas uma criança, que seria a vencedora.

No momento em que entra no círculo, cada criança recebe uma pequena ficha que contém um valor de 1 a 500. Depois que o círculo é formado, conta-se, iniciando na criança que está ao lado da primeira que entrou no círculo, o número correspondente à ficha que a primeira detém. A criança onde o número contado cair, deve ser retirada do grupo, e a contagem inicia novamente segundo a ficha da criança que acabou de ser eliminada. Para ficar mais interessante, quando o valor que consta na ficha é par, a contagem é feita no sentido horário e quando o valor que consta na ficha é ímpar, a contagem é feita no sentido anti-horário.

A brincadeira fez muito sucesso e o administrador do acampamento pediu para que sua equipe desenvolva um programa para que no próximo evento ele saiba previamente qual criança irá ser a vencedora de cada grupo, com base nas informações fornecidas.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém um inteiro N (1 ≤ N ≤ 100), indicando a quantidade de crianças que farão parte de cada círculo e participarão da brincadeira. Em seguida, as N linhas de cada caso de teste conterão duas informações, o Nome e o Valor (1 ≤ Valor ≤ 500) que consta na ficha de cada criança, separados por um espaço, na ordem de entrada na formação do círculo inicial.

Obs: O Nome de cada criança não deverá ultrapassar 30 caracteres e contém apenas letras maiúsculas e minúsculas, sem acentos, e o caractere “_”. O final da entrada é indicado pelo número zero.

Saída
Para cada caso de teste, deve-se apresentar a mensagem Vencedor(a): xxxxxx, com um espaço após o sinal ":" indicando qual é a criança do grupo que venceu a brincadeira.

Exemplo de Entrada	Exemplo de Saída
3
Fernanda 7
Fernando 9
Gustavo 11
5
Maria 7
Pedro 9
Joao_Vitor 5
Isabel 12
Laura 8
3
Maria 4
Pedro 3
Joao 2
0

Vencedor(a): Fernanda
Vencedor(a): Pedro
Vencedor(a): Pedro

XIII Maratona de Programação IME-USP, 2009.
 */