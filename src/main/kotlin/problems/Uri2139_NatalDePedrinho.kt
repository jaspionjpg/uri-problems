package problems

import java.time.LocalDate
import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val diasNoAno = 366
    while (ler.hasNext()) {
        val mes: Int = ler.nextInt()
        val dia: Int = ler.nextInt()

        if (mes == 12 && dia == 25)
            println("E natal!")
        else if (mes == 12 && dia == 24)
            println("E vespera de natal!")
        else if (mes == 12 && dia > 25)
            println("Ja passou!")
        else {
            val data = LocalDate.of(2016, mes, dia)
            val diasAteNatal = diasNoAno - 6 - data.dayOfYear
            println("Faltam $diasAteNatal dias para o natal!")
        }
    }
}

/*
URI Online Judge | 2139
Natal de Pedrinho
Por Joao Marcos Salvanini Bellini de Moraes, IFSULDEMINAS BR Brazil

Timelimit: 1
Pedrinho é um garoto que adora festas em família, principalmente o Natal, quando ganha presente dos pais e dos avós. Esse ano, seu pai lhe prometeu um PS4, mas somente se Pedrinho conseguir resolver alguns desafios ao longo do ano, sendo um deles, escrever um programa que calcule quantos dias faltam para o Natal.

Entretanto, Pedrinho tem somente 9 anos e não tem noção alguma de programação, mas sabe que você, primo dele, mexe com "coisas de computador", e dessa forma, pediu para você escrever o programa para ele. Não somente isso, mas prometeu que deixaria você jogar todo final de semana e por quanto tempo quiser!

Entrada
A entrada é composta por vários casos de teste. Cada linha contém o mês e o dia do ano de 2016 (ano bissexto). A entrada termina com fim de arquivo.

Saída
Se for Natal, imprima "E natal!"; se faltar somente um dia, imprima "E vespera de natal!"; se já passou, imprima "Ja passou!". Caso contrário, imprima "Faltam X dias para o natal!", sendo X o número de dias que faltam para o Natal.

Exemplo de Entrada	Exemplo de Saída
12 24

11 24

12 29

1 5

12 25

E vespera de natal!

Faltam 31 dias para o natal!

Ja passou!

Faltam 355 dias para o natal!

E natal!

Aquecimento para a VI Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2016
 */