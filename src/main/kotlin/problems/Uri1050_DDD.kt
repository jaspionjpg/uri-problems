package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val listaDdds = mapOf(
        61 to "Brasilia",
        71 to "Salvador",
        11 to "Sao Paulo",
        21 to "Rio de Janeiro",
        32 to "Juiz de Fora",
        19 to "Campinas",
        27 to "Vitoria",
        31 to "Belo Horizonte"
    )

    val ddd = ler.nextInt()

    println(listaDdds[ddd] ?: "DDD nao cadastrado")
}

/*[URI Online Judge | 1050
DDD
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:




Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
DDD nao cadastrado

Entrada
A entrada consiste de um único valor inteiro.

Saída
Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.

Exemplo de Entrada	Exemplo de Saída
11

Sao Paulo

 */