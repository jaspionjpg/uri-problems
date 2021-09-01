package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    var contador = 1
    while (ler.hasNext()) {
        val aporte = ler.nextDouble()
        val capitalInicial = ler.nextDouble()

        val porcentagem = (capitalInicial / aporte - 1) * 100
        println("Projeto $contador:")
        println("Percentual dos juros da aplicacao: ${String.format("%.2f", porcentagem)} %")
        println()
        contador++
    }
}

/*
URI Online Judge | 2170
Juros do Projeto
Por Igor Gomes, UEVA BR Brazil

Timelimit: 1
Em um projeto de investimento, cujo o valor inicial do capital é de X, renderá, após um período um valor Y . Deseja-se saber qual a Taxa Interna de Retorno do investimento, pois dessa forma poderá ser verificado o percentual dos juros.

Entrada
Existem vários projetos a serem analisados, e para cada projeto é dado o aporte de capital inicial (1 < X < 1020), e o seu retorno (X < Y < 1020).

Saída
Para cada projeto mostre o valor dos juros para cada aplicação. Mostre conforme o exemplo de saída.

Exemplo de Entrada	Exemplo de Saída
20000 35000
2500 5000
7535 160000

Projeto 1:
Percentual dos juros da aplicacao: 75.00 %

Projeto 2:
Percentual dos juros da aplicacao: 100.00 %

Projeto 3:
Percentual dos juros da aplicacao: 2023.42 %
 */