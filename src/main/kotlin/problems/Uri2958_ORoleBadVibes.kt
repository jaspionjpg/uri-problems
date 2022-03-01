package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var linhas = ler.nextInt()
    var colunas = ler.nextInt()

    val problemas = Array(linhas * colunas) { ler.next() }

    problemas.sort()
    problemas.reverse()

    for (problema in problemas)
        println(problema)
}

/*
beecrowd | 2958
O Rolê Bad Vibes
Por Samuel Eduardo da Silva, IFSULDEMINAS/UFF BR Brazil

Timelimit: 1
A faculdade é um tempo memorável da vida. Grandes coisas acontecem, mas também muita dor e sofrimento, e nesses momentos bons amigos são necessários.

Sabendo disso, Úrisson, ao entrar na universidade, tratou logo de fazer bons amigos e fundar seu grupo de ajuda, Rolê Bad Vibes, o qual os membros se ajudam com problemas de disciplinas do curso e de vida.

Como são um grupo de pessoas muito inteligentes, bolaram um esquema para resolução dos problemas:

Para cada problema, era dado um valor de 1 a 9 (na escala de criticidade), e uma letra, D ou V, indicando problema de disciplina ou de vida, respectivamente. Com esses dados, colocam em uma matriz, impressa em uma grande cartolina colada na sede do grupo para fácil visualização de todos.

A matriz é uma boa forma de visualizar, porém, ainda causa confusão na hora de escolher os problemas a serem resolvidos no dia, pois os dados ficam muito esparsos. Assim, Úrisson gostaria de gerar um relatório, ordenado desses dados.

O critério adotado é: independente da criticidade, os problemas de vida devem ser resolvidos primeiro, pois concluíram ser muito complicado conciliar esses problemas com os problemas de disciplinas. Depois, basta ordenar por criticidade.

Úrisson, pediu pra você, veterano de programação, criar um programa que gera este relatório.

Entrada
A primeira linha da entrada contém dois inteiros N e M, indicando, respectivamente, o número de linhas e colunas. Nas próximas linhas, é dada a matriz onde cada célula contém dois caracteres, o primeiro indicando o nível de criticidade e o segundo se é um problema de vida ou disciplina.

Saída
Relatório ordenado conforme pedido por Úrisson.

Exemplo de Entrada	Exemplo de Saída
3 3
7V 1D 2D
2D 1V 1V
3V 5V 9D

7V
5V
3V
1V
1V
9D
2D
2D
1D

IX Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2019 / Questão em homenagem a um dos grupos de amigos que mais me ajudaram durante a graduação. Vocês são feras.
 */