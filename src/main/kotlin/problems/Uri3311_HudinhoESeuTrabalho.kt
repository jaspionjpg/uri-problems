package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val nomes = Array(ler.nextInt()) { indice -> ler.next() }

    nomes.sortBy {
        it[0]
    }

    for (nome in nomes) {
        println(nome)
    }
}

/*
beecrowd | 3311
Hudinho e o seu Trabalho
Por Amanda Beatriz Augusta da Silva, Instituto Federal do Sul de Minas Gerais BR Brazil

Timelimit: 1
Hudinho iniciou um novo emprego em uma empresa antiga na cidade em que reside. A empresa está há 30 anos no mercado e as fichas de clientes sempre foram feitas manualmente. No primeiro dia de trabalho, Hudinho tem dificuldade para encontrar as fichas dos clientes, pois essas não estão organizadas. Ele pensou organizar em ordem alfabética, mas é uma atividade que demanda muito tempo de seu dia para fazer manualmente. Sua missão é ajudar Hudinho a otimizar o tempo de trabalho, ordenando as fichas pela primeira letra do nome dos clientes. O resto é com ele, afinal, Hudinho também tem que trabalhar, né?!

Entrada
A primeira linha da entrada contém dois inteiros N indicando a quantidade de fichas. As N linhas seguintes indicam os respectivos nomes nas fichas, na ordem em que foram encontradas

Saída
A saída contém N linhas dos nomes ordenados pela primeira letra e depois na ordem em que apareceram.

Exemplo de Entrada	Exemplo de Saída
28

Amanda

Hudson

Breno

Dimas

Douglas

Elyssa

Fabiana

Gabriel

Gerivaldo

Guilherme

Anelize

Hercules

Higor

Hyerre

Ivan

Jean

Paulo

Mikael

Vicente

Wilian

Lucas

Mateus

Thiago

Robson

Thuani

Widimarque

Deive

Anderson

Amanda

Anelize

Anderson

Breno

Dimas

Douglas

Deive

Elyssa

Fabiana

Gabriel

Gerivaldo

Guilherme

Hudson

Hercules

Higor

Hyerre

Ivan

Jean

Lucas

Mikael

Mateus

Paulo

Robson

Thiago

Thuani

Vicente

Wilian

Widimarque

11ª Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2021
 */