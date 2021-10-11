package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val texto = ler.nextLine()
    println("Nao se refuta ciencia com opiniao")
}

/*
URI Online Judge | 3157
Viva a Ciência!
Por Samuel Eduardo da Silva, IFSULDEMINAS/UFF BR Brazil

Timelimit: 1
Oronob é um garoto muito peculiar. Para ele, apenas a sua opinião importa e nada mais. Durante a pandemia do Coronga Virus, ele usa sua opinião para retaliar o que a ciência diz. Ele então, para impulsionar suas opiniões, criou um bot (robô que gera mensagens automáticas) para disparar seus textos para muitas pessoas.

Você conhece Oronob, porém, ao contrário dele, você é sensato e sabe que ciência não se refuta com opinião, além também de entender de programação, então decidiu hackear o bot de Oronob para evitar suas falácias.

Pois bem, crie então um algoritmo que muda o texto das opiniões de Oronob para a real verdade.

Entrada
Um texto S com caracteres alfanuméricos e possíveis espaços entre as palavras.

Limites: 0 < |S| <= 280. ;)

Saída
A verdade.

Exemplos de Entrada	Exemplos de Saída
Li no face que tal remédio cura o Coronga a ciencia coronguista diz que nao

Nao se refuta ciencia com opiniao

Coronga eh criacao narniana para vender vacina

Nao se refuta ciencia com opiniao

Idai que coronga mata importante eh a economia

Nao se refuta ciencia com opiniao

X Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2020
 */