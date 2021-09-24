package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    var soma = 0.0
    var testes = 0
    while (true) {
        val pesoEsquerdo = ler.nextDouble()
        val pesoDireito = ler.nextDouble()
        val repeticoes = ler.nextDouble()
        if (pesoEsquerdo == 0.0 && pesoDireito == 0.0 && repeticoes == 0.0)
            break

        val esq = pesoEsquerdo * (1 + repeticoes / 30)
        val dir = pesoDireito * (1 + repeticoes / 30)

        val mediaEsqDir = (esq + dir) / 2
        soma += mediaEsqDir

        when {
            mediaEsqDir < 13 -> println("Nao vai da nao")
            mediaEsqDir < 14 -> println("E 13")
            mediaEsqDir < 40 -> println("Bora, hora do show! BIIR!")
            mediaEsqDir <= 60 -> println("Ta saindo da jaula o monstro!")
            else -> println("AQUI E BODYBUILDER!!")
        }
        testes++
    }

    if (soma / testes > 40)
        println("\nAqui nois constroi fibra rapaz! Nao e agua com musculo!")
}

/*
URI Online Judge | 2144
Bodybuilder
Por Joao Marcos Salvanini Bellini de Moraes, IFSULDEMINAS BR Brazil

Timelimit: 1
BemBem é um famoso fisiculturista da região. Ele está sempre buscando o desempenho perfeito em seus treinos na academia para competir com seus rivais. Seu amigo Frenco o auxilia da melhor maneira possível, ajudando-o a buscar o trapézio descendente e controlando-o para que ele não derrube todas as árvores do Parque Ibirapuera. Apesar disso, BemBem chamou você para o ajudar em uma tarefa específica: determinar a média de sua 1RM (uma repetição máxima). Para tal, você poderá usar a fórmula abaixo:


W = Peso a ser levantado.
R = Número de repetições.

Porém, BemBem possui menos força em um braço do que no outro, o que o faz levantar menos peso em um deles, motivo pelo qual ele lhe pediu ajuda, alegando que "o maluco está doente". Ajude-o e torne-se um codebuilder!

Entrada
A entrada é composta pelos inteiros W1 (peso levantado pelo braço esquerdo: 1 ≤ W1 ≤ 60), W2 (peso levantado pelo braço direito: 1 ≤ W2 ≤ 100) e R (número de repetições: 1 ≤ R ≤ 12). A entrada termina com W1 = W2 = R = 0.

Saída
Seu programa deverá imprimir um bordão correspondente à média M (ponto flutuante) da 1RM de BemBem, de acordo com a tabela abaixo:


No final, se a média de todos os casos for maior do que 40, imprima uma linha em branco e então, "Aqui nois constroi fibra rapaz! Nao e agua com musculo!".

Exemplo de Entrada	Exemplo de Saída
1 2 1
50 84 6
30 49 8
11 12 5
16 30 10
44 55 11
0 0 0

Nao vai da nao
AQUI E BODYBUILDER!!
Ta saindo da jaula o monstro!
E 13
Bora, hora do show! BIIR!
AQUI E BODYBUILDER!!
Aqui nois constroi fibra rapaz! Nao e agua com musculo!

Aquecimento para a VI Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2016
 */