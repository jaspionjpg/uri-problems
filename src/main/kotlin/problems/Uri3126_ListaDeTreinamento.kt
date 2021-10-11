package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeros = ler.nextInt()

    var candidatos = 0
    for (i in 1..numeros)
        if (ler.nextInt() == 1)
            candidatos++
    println(candidatos)
}

/*
URI Online Judge | 3126
Lista de Treinamento
Por Vinicius Coelho BR Brazil

Timelimit: 1
A SAP está promovendo em sua sede um evento para treinar candidatos para entrevistas, sendo este ministrado pelo ilustre chefe Pietro e realizado em parceria com algumas universidades no país. Para isso, foi criado um formulário onde os interessados preencheriam alguns dados básicos como:

Nome completo;
Universidade; e
E-mail para contato.
A quantidade de interessados surpreendeu e muito os organizadores, sendo necessária a criação de crachás para acesso ao evento. Chegado o evento, diversas filas de credenciamento foram dispostas na entrada do prédio, cada uma contendo uma lista com os candidatos inscritos. Contudo, muitas pessoas não compareceram, sobrando assim muitos crachás. A equipe organizadora deseja saber quantas pessoas puderam comparecer, mas como estão cansados demais, eles pediram a sua ajuda para essa tarefa.

Entrada
A primeira linha do caso de teste é dada por um inteiro C (1 <= C <= 1000), representando a número de candidatos inscritos. A linha seguinte consiste de C inteiros, indicando com o valor 1 se o candidato Ci participou do evento, ou 0 se o candidato não compareceu.

Saída
A saída devem conter um único inteiro, contendo a quantidade de candidatos que compareceram ao evento.

Exemplo de Entrada	Exemplo de Saída
10
1 1 1 1 0 1 1 1 1 0

8

8
1 0 0 1 1 0 1 1

5
 */