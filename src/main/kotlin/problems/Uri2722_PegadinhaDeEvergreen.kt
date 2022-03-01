package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    for (caso in 1..ler.nextLine().toInt()) {
        val primeiraPalavra = ler.nextLine()
        val segundaPalavra = ler.nextLine()

        var indece = 0
        var palavraFinal = ""
        while (true) {
            if (indece < primeiraPalavra.length) {
                var atePrimeiro =
                    if (indece + 2 > primeiraPalavra.length - 1) primeiraPalavra.length  else indece + 2
                palavraFinal += primeiraPalavra.subSequence(indece, atePrimeiro)
            }

            if (indece < segundaPalavra.length) {
                var ateSegundo = if (indece + 2 > segundaPalavra.length - 1) segundaPalavra.length  else indece + 2
                palavraFinal += segundaPalavra.subSequence(indece, ateSegundo)
            }

            indece += 2

            if (indece > primeiraPalavra.length && indece > segundaPalavra.length)
                break
        }

        println(palavraFinal)
    }
}

/*
beecrowd | 2722
Pegadinha de Evergreen
Por Neilor Tonin, URI BR Brazil

Timelimit: 1
Evergreen Bushy, um dos duendes ajudantes de Noel, responsável por inventar muitos dos brinquedos distribuídos por Noel e também muito conhecido por fazer pegadinhas com o bom velhinho, aprontou mais uma neste ano.

Como sempre faz todos os anos, Bushy separou os presentes para cada criança colocando um bilhete com o nome dela. O problema que ele não se limitou a simplesmente colocar o nome correto da criança no presente: ele zoou :) cada um dos nomes misturando as letras segundo uma sequência: duas letras do nome, seguidas por duas letras do sobrenome, seguidas por duas letras do nome e por duas letras do sobrenome e assim por diante.

Bem, como Noel está bem cansado e sem tempo para brincadeiras, pediu a você que é expert em programação para fazer um programa que converta o nome misturado por Evergreen no nome correto de cada criança.

Apenas um fato curioso: a primeira linha do nome misturado sempre terá um número par de caracteres e a segunda linha, sempre terá o mesmo número de caracteres da primeira linha ou um caractere a menos do que a primeira linha.

Entrada
A entrada contém um inteiro N (N < 2000) que indica a quantidade de casos de teste. Cada caso de teste é composto por duas linhas, com no máximo 100 caracteres cada. Estas duas linhas contém o nome que foi misturado por Evergreen Bushy, que é composto basicamente por letras maiúsculas, minúsculas e espaços em branco.

Saída
Com base nas duas linhas de entrada, você deve imprimir o nome correto da criança, seguindo a regra para decifrá-lo conforme descrição acima.

Exemplo de Entrada	Exemplo de Saída
3
Peo lart
drMazaes
RortRaul
bea nta
JumaTenh
cir lio

Pedro Malazartes
Roberta Rantula
Jucimar Telinho

Contest de Natal 2017
 */