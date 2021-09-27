package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val frase = ler.nextLine()

    val palavras = frase.split(" ")
    val palavrasCorrigidas = ArrayList<String>()

    for (palavra in palavras) {
        if (palavra.length > 3)
            if (palavra.substring(0, 2).equals(palavra.substring(2, 4), true)) {
                palavrasCorrigidas.add(palavra.substring(2))
                continue
            }
        palavrasCorrigidas.add(palavra)
    }
    println(palavrasCorrigidas.joinToString(" "))
}

/*
URI Online Judge | 2815
Digitador Gago
Por Neilor Tonin, URI BR Brasil

Timelimit: 1
Francisco Iote é uma gago diferente. Ele não somente fala repetindo sílabas como estranhamente quando digita um texto ele repete algumas sílabas, tornando a leitura muito chata. Ele repete apenas sílabas que tenham exatamente 2 letras e nunca repete uma sílaba que não seja a primeira sílaba da palavra. Ele também repete apenas uma vez, ou seja a palavra bola, por exemplo, pode aparecer como bola ou bobola, nunca bobobola.

Você foi chamado como perito para traduzir alguns textos excritos por Francisco eliminando as redundâncias de texto por ele geradas.

Entrada
A entrada é composta por apenas uma linha com até 1000 palavras, cada uma delas com no máximo 15 caracteres. Esta linha de texto deve ser corrigida eliminando-se as redundâncias, conforme exemplo abaixo.

Saída
Seu programa deve gerar uma versão do texto fornecido por Francisco que não contenha as repetições descritas acima.

Exemplos de Entrada	Exemplos de Saída
Juca comprou fafarinha na memercearia e papagou 4 reais o quilo. A mamae de Juca pediu para ele comprar mamais 2 quilos.

Juca comprou farinha na mercearia e pagou 4 reais o quilo. A mae de Juca pediu para ele comprar mais 2 quilos.

O papassarinho vovoou para bem longe.

O passarinho voou para bem longe.

Aquecimento OBI 2018 Fase Estadual
 */