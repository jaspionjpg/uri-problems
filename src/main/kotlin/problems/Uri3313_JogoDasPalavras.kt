package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    var numeroCaso = 1
    while (true) {
        val palavra = ler.next()
        if (palavra == "*")
            break

        val lista = ArrayList<String>()
        for (i in palavra.indices) {
            val novaPalavra = palavra.substring(i) + palavra.substring(0, i)
            lista.add(novaPalavra)
        }
        val listaOrdenada = lista.sorted()

        println("Caso $numeroCaso: ${listaOrdenada.first()} ${listaOrdenada.last()}")
        numeroCaso++
    }
}

/*
URI Online Judge | 3313
Jogo de Palavras
Por Abner Samuel P. Palmeira, Instituto Federal do Sul de Minas Gerais BR Brazil

Timelimit: 1
Amigoum e Amigodois são amigos de longa data e ambos adoram strings, recentemente eles aprenderam sobre a rotação de uma string. Rotacionar uma string consiste em colocar a última letra no início desta. Por exemplo a string ROTA quando rotacionada se torna AROT, e caso seja rotacionada novamente teremos a string TARO. Amigoum e Amigodois encontraram uma bela string no chão, e agora eles desejam rotacionar essa string

Amigoum quer rotacionar a string de forma que ela seja a menor string lexicográfica, e Amigodois quer rotacioná‐la de forma que ela seja a maior string lexicográfica. Sua tarefa é implementar para os amigos um algoritmo que dado uma string S exiba sua menor e maior rotação lexicográfica

Entrada
Há diversos casos de teste. A entrada de cada caso de teste é dada em várias linhas, contendo uma string não‐vazia de no máximo 105 caracteres que representa a string dos amigos. Cada caractere da string poderá ser uma letra minúscula. O último caso de teste é seguido por uma linha contendo um único asterisco.

Saída
Para cada caso de teste imprima "Caso x:"seguido da menor e da maior string que os amigos podem formar.

Exemplo de Entrada	Exemplo de Saída
eart

rato

*

Caso 1: arte tear

Caso 2: ator tora

11ª Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2021
 */
