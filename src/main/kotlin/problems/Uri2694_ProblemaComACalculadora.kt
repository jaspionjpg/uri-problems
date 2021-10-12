package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()
    for (teste in 1..testes) {
        val codigo = ler.next()
        val soma = codigo.substring(2, 4).toInt() + codigo.substring(5, 8).toInt() + codigo.substring(11, 13).toInt()
        println(soma)
    }
}

/*
URI Online Judge | 2694
Problema com a Calculadora
Por Neilor Tonin, URI BR Brazil

Timelimit: 1
Joãozinho tem que ajudar seu pai. Um relatório específico com alguns números está saindo com caracteres indesejáveis no meio. A ideia é apenas somar os 3 valores que aparecem em cada linha sempre na mesma posição, ignorando as letras e apresentar esta soma. Não existem espaços em branco na linha.

Entrada
A primeira linha de entrada contém um inteiro N (N < 100000). Seguem N linhas com exatos 14 caracteres que devem ser lidas e delas extraídos e somados os três números existentes.

Saída
Para cada linha de entrada, seu programa deve apresentar um valor numérico inteiro, que é a soma dos 3 números existentes na linha.

Exemplo de Entrada	Exemplo de Saída
3
Ab23s249ttu21
At01v021kkk12
xx14l134mjm01

293
34
149
 */