package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val lista = mutableMapOf<String, String>()

    while (ler.hasNext()) {
        val nome = ler.nextLine()
        lista[nome.toLowerCase()] = nome
    }

    val nomeNormal = lista[lista.toSortedMap().lastKey()]

    println(nomeNormal)
}

/*
URI Online Judge | 2023
A Última Criança Boa
Por M.C. Pinto, UNILA BR Brazil

Timelimit: 1
Papai Noel classifica todas as crianças do mundo em duas listas: uma das boazinhas e outra das malcriadas. Ele gostaria de saber qual das crianças do mundo é a última da lista de boazinhas, se usar a ordem alfabética. Para isso, ele pediu a todos seus elfos ajudantes que escrevessem os nomes das crianças boas em uma folha.

Entretanto, cada elfo escreveu os nomes de um jeito: maiúscula no início e minúsculas depois, todas maiúsculas, todas minúsculas, e todo tipo de combinação entre maiúsculas e minúsculas.

Papai Noel quer sua ajuda para, dada a lista de nome das crianças boas, dizer qual delas é a última.

Entrada
A entrada possui várias linhas. Em cada linha há o nome de uma criança boa. Nenhum elfo escreveu os nomes com acentos. O maior nome tem no máximo 80 caracteres. Não existem mais de 1000 crianças na lista. Todos os nomes são distintos. A lista de nomes termina com EOF.

Saída
A saída é dada em uma linha. O nome da criança que fica na última posição da lista deve ser mostrado. Mostre o nome exatamente como foi lido na entrada. Use a ordem alfabética dos nomes para ordenar, mas considere maiúsculas e minúsculas como iguais.

Exemplos de Entrada	Exemplos de Saída
ana
Julio
gABRIEL
VANESSA
cArLoS

VANESSA

abraao
aRi
abelardo
amanda

aRi

Joaquim Jose da Silva Xavier
Pedro de Alcantara Joao Carlos Leopoldo Salvador Bibiano Francisco Xavier Miguel
Pedro de Alcantara Francisco Antonio Joao Carlos Xavier de Paula Miguel Cipriano
Pedro Raymundo

Pedro Raymundo

Contest de Natal 2015.
 */