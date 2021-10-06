package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (true) {
        val altura = ler.nextInt()
        val largura = ler.nextInt()
        if (altura + largura == 0)
            break

        val linhas = ArrayList<String>()
        for (i in 1..altura)
            linhas.add(ler.next())

        val novaaltura = ler.nextInt()
        val novalargura = ler.nextInt()
        val proporcaoaltura = novaaltura / altura
        val proporcaolargura = novalargura / largura

        for (linha in 0 until altura) {
            var stringue = ""
            for (caractere in linhas[linha])
                for (colunas in 1..proporcaolargura)
                    stringue += caractere

            for (colunas in 1..proporcaoaltura)
                println(stringue)
        }
        println()
    }
}

/*
URI Online Judge | 1516
Imagem
Por Cristhian Bonilha, UTFPR BR Brazil

Timelimit: 1
Rafael encontrou um novo hobbie: fazer desenhos usando caracteres do teclado. Por mais simples ou limitada que essa nova forma de arte possa parecer, basta criatividade para se fazer os mais diferentes tipos de desenhos.

Após fazer alguns desenhos, Rafael imaginou como seriam se eles fossem redimensionados, porém ter que refazer todo o desenho pareceu meio cansativo. Para isso, Rafael pediu sua ajuda.

Em um redimensionamento, uma imagem com N linhas e M colunas passa a ter A linhas e B colunas, e, dado que as novas dimensões da imagem redimensionada é maior do que as dimensões da imagem original, alguns caracteres terão que se repetir.

Digamos que A seja 3 vezes maior que N. Nesse caso, cada linha terá que se repetir 3 vezes, para que a imagem seja redimensionada de forma correta.

Dado um desenho feito por Rafael, imprima como seria se o desenho fosse redimensionado para uma determinada nova dimensão.

Entrada
Haverá diversos casos de teste. Cada caso de teste inicia com dois inteiros N e M (1 ≤ N, M ≤ 50), representando, respectivamente, a altura e a largura do desenho de Rafael.

A seguir haverá N linhas, contendo M caracteres cada, representando o desenho feito por Rafael. Após, haverá dois inteiros A e B (N < A ≤ 100, M < B ≤ 100, A é múltiplo de N, e B é multiplo de M), representando, respectivamente, a nova altura e largura que Rafael deseja que seu desenho tenha.

O último caso de teste é indicado quando N = M = 0, o qual não deverá ser processado.

Saída
Para cada caso de teste, imprima A linhas, contendo B caracteres cada, representando o desenho de Rafael redimensionado.

Após cada caso de teste, imprima uma linha em branco.

Exemplo de Entrada	Exemplo de Saída
3 3
###
#__
###
6 9
0 0

#########
#########
###______
###______
#########
#########


Contest Bonilha 2014
 */