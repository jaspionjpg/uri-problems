package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (true) {
        val paginasLidasPorDia = ler.nextInt()
        if (paginasLidasPorDia == 0)
            break
        val diasAdiantadosCaso = ler.nextInt()
        val quantidadeParaAdiantar = ler.nextInt()

        val paginasLidasAMaisNoMesmoTempo = diasAdiantadosCaso * quantidadeParaAdiantar
        val paginasLidasAMais = quantidadeParaAdiantar - paginasLidasPorDia

        val total = (paginasLidasPorDia * paginasLidasAMaisNoMesmoTempo) / paginasLidasAMais
        if (total > 1) println("$total paginas")
        else println("$total pagina")
    }
}

/*
URI Online Judge | 1542
Lendo Livros
Por Normandes Jr, UFU BR Brazil

Timelimit: 3
Você começou a competir com seu amigo para ver quem consegue ler mais livros em menos tempo. Seu amigo lia muito mais que você, até o dia que você percebeu que ele lia somente livros muito finos.

Então você resolveu contar as páginas dos livros, aumentando também a quantidade de páginas lidas por dia. Agora você lê 5 páginas por dia e termina 16 dias antes do que se estivesse lendo 3 páginas por dia. Neste cenário, quantas páginas tem o livro?

Entrada
A entrada é composta de vários casos de testes. Cada caso de teste é composto de três números Q (0 < Q < 20), D (0 < D < 20) e P (0 < P < 20) separados por um espaço. Sendo que Q é a quantidade de páginas lidas por dia. D é o número de dias que você adiantaria a leitura caso estivesse lendo a quantidade de páginas informada pelo número P. Um único valor zero indica o fim da entrada.

Saída
Para cada caso de teste deverá ser impresso a quantidade de páginas do livro. (Utilize o plural corretamente e não use acentos). Este número deverá ser um inteiro, o qual representa a quantidade de página. Este valor deverá ser truncado caso necessário.

Exemplo de Entrada	Exemplo de Saída
3 16 5
0

120 paginas

Maratona Algar Telecom XIII
 */