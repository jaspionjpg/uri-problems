package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val lista = Array(10) { ler.next() }
    println(lista[2])
    println(lista[6])
    println(lista[8])
}

/*
URI Online Judge | 2766
Entrada e Saída Lendo e Pulando Nomes
Por Roberto A. Costa Jr, UNIFEI BR Brazil

Timelimit: 1
O seu professor gostaria de fazer um programa com as seguintes características:

Leia 10 nomes, sem espaço em branco;
Imprima o terceiro nome da lista;
Imprima o sétimo nome da lista;
Imprima o nono nome da lista.
Entrada
A entrada consiste vários arquivos de teste. Em cada arquivo de teste tem dez linhas. Em cada linha tem um nome de no máximo 30 caracteres e sem espaço em branco. Conforme mostrado no exemplo de entrada a seguir.

Saída
Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem três linhas conforme os procedimentos 2, 3 e 4. Conforme mostra o exemplo de saída a seguir.

Exemplos de Entrada	Exemplos de Saída
USP

UFPE

UFCG

UFRN

UFRJ
IME

ITA

UNIOESTE

URI

UFG

UFCG

ITA

URI

UnB

UFMG

UNIFEI

UECE

UNICAMP

INATEL

UFRGS

UNIFESO

UFU

PUC

UNIFEI

UFRGS

UFU
 */