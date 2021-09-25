package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val salario = ler.nextDouble()

    val tabelaReajuste = listOf(
        0.0..400.0 to 15.0,
        400.01..800.00 to 12.0,
        800.01..1200.0 to 10.0,
        1200.01..2000.00 to 7.0,
        2000.01..Double.MAX_VALUE to 4.0
    )

    var (_, reajuste) = tabelaReajuste.first { (condicao, _) -> condicao.contains(salario) }

    println("Novo salario: %.2f".format(salario * (1 + reajuste / 100)))
    println("Reajuste ganho: %.2f".format(salario * reajuste / 100))
    println("Em percentual: %.0f %%".format(reajuste))
}

/*
URI Online Judge | 1048
Aumento de Salário
Por Neilor Tonin, URI  Brasil

Timelimit: 1
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:


Salário	Percentual de Reajuste
0 - 400.00
400.01 - 800.00
800.01 - 1200.00
1200.01 - 2000.00
Acima de 2000.00

15%
12%
10%
7%
4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
400.00

Novo salario: 460.00
Reajuste ganho: 60.00
Em percentual: 15 %

800.01

Novo salario: 880.01
Reajuste ganho: 80.00
Em percentual: 10 %

2000.00

Novo salario: 2140.00
Reajuste ganho: 140.00
Em percentual: 7 %
 */