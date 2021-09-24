package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val alimentos = mapOf(
        "suco de laranja" to 120, "morango fresco" to 85,
        "mamao" to 85, "goiaba vermelha" to 70,
        "manga" to 56, "laranja" to 50,
        "brocolis" to 34
    )

    while (true) {
        val repeticoes = ler.nextLine().toInt()
        if (repeticoes == 0)
            break

        var gramas = 0
        for (i in 0 until repeticoes) {
            val (quantidade, nome) = ler.nextLine().split(Regex(" "), 2)
            gramas += alimentos[nome]!! * quantidade.toInt()
        }

        if (gramas < 110)
            println("Mais ${110 - gramas} mg")
        else if (gramas > 130)
            println("Menos ${gramas - 130} mg")
        else
            println("$gramas mg")
    }
}

/*
URI Online Judge | 2486
C Mais ou Menos?
Por João Marcos Salvanini Bellini de Moraes, IFSULDEMINAS BR Brazil

Timelimit: 1
Ultimamente, diversas pessoas estão indo à Dra. Cláudia Café com Leite para saber se estão consumindo a quantidade recomendada diária de vitamina C. Isso tem a deixado exausta, e por isso ela lhe pediu para escrever um programa que, dado o consumo diário de alimentos ricos em vitamina C por uma pessoa, indique o quanto essa pessoa deve consumir a mais ou a menos para atingir o recomendado.

Para tal, você poderá utilizar a tabela a seguir:

Alimentos ricos em Vitamina C	Quantidade de Vitamina C
suco de laranja	120 mg
morango fresco	85 mg
mamao	85 mg
goiaba vermelha	70 mg
manga	56 mg
laranja	50 mg
brocolis	34 mg
Considere que o consumo diário recomendado de vitamina C está entre 110 mg e 130 mg, inclusive.

Entrada
Cada caso de teste é composto um inteiro T (1 ≤ T ≤ 7) indicando que a pessoa consome diariamente T alimentos entre os 7 alimentos da tabela. Em seguida, haverá T linhas com um inteiro N e um alimento (totalmente em caixa baixa e sem acentuações), indicando que a pessoa consome uma quantidade N daquele alimento. A entrada termina com T = 0.

Saída
Para cada caso de teste (T), se o consumo ultrapassou o limite recomendado, imprima "Menos X mg", em que X representa a quantidade a menos a ser consumida para atingir o limite recomendado; se o consumo não atingiu o recomendado, imprima "Mais X mg", em que X representa a quantidade a mais para atingir o recomendado; se o consumo está dentro do intervalo recomendado, imprima "X mg", em que X representa a quantidade consumida diariamente pela pessoa.

Exemplo de Entrada	Exemplo de Saída
2
2 suco de laranja
3 mamao
1
3 brocolis
2
1 manga
1 laranja
1
1 suco de laranja
0

Menos 365 mg

Mais 8 mg

Mais 4 mg

120 mg

The Last Contest 2016 - IFSULDEMINAS
 */