package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val mapa = mapOf(
        "vertebrado" to mapOf(
            "ave" to mapOf("carnivoro" to "aguia", "onivoro" to "pomba"),
            "mamifero" to mapOf("herbivoro" to "vaca", "onivoro" to "homem")
        ),
        "invertebrado" to mapOf(
            "inseto" to mapOf("hematofago" to "pulga", "herbivoro" to "lagarta"),
            "anelideo" to mapOf("hematofago" to "sanguessuga", "onivoro" to "minhoca")
        )
    )

    val definicao1 = ler.next()
    val definicao2 = ler.next()
    val definicao3 = ler.next()
    println(mapa[definicao1]!![definicao2]!![definicao3])
}

/*
URI Online Judge | 1049
Animal
Por Neilor Tonin, URI  Brasil

Timelimit: 1
Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.



Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.

Exemplos de Entrada	Exemplos de Saída
vertebrado
mamifero
onivoro

homem

vertebrado
ave
carnivoro

aguia

invertebrado
anelideo
onivoro

minhoca
 */