package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val altura = ler.nextInt()
        val comprimento = ler.nextInt()
        if (altura + comprimento == 0)
            break

        val blocos = IntArray(comprimento) { ler.nextInt() }

        var vezesLazer = 0
        for (alturaAtual in altura downTo 1) {
            var vazio = false

            for (bloco in blocos) {
                if (!vazio && bloco < alturaAtual) {
                    vezesLazer++
                    vazio = true
                } else if (bloco >= alturaAtual) {
                    vazio = false
                }
            }
        }

        println(vezesLazer)
    }
}

/*
URI Online Judge | 1107
Escultura à Laser
Maratona de Programação da SBC  Brasil

Timelimit: 1
Desde a sua invenção, em 1958, os raios laser têm sido utilizados em uma imensa variedade de aplicações, como equipamentos eletrônicos, instrumentos cirúrgicos, armamentos, e muito mais.



A figura acima mostra um diagrama esquemático de um equipamento para esculpir, com laser, um bloco de material maciço. Na figura vemos um emissor laser que se desloca horizontalmente para a direita e para a esquerda com velocidade constante. Quando o emissor é ligado durante o deslocamento, uma camada de espessura constante é removida do bloco, sendo vaporizada pelo laser.

A figura abaixo ilustra o processo de escultura a laser, mostrando um exemplo de (a) um bloco, com 5 mm de altura por 8 mm de comprimento, no início do processo, (b) o formato que se deseja que o bloco esculpido tenha, e (c) a sequência de remoção das camadas do bloco durante o processo, considerando que a cada varredura uma camada de espessura de 1 mm é removida.

Na primeira varredura, o pedaço numerado como 1 é removido; na segunda varredura, o pedaço numerado como 2 é removido, e assim por diante. Durante o processo de remoção, o laser foi ligado um total de 7 vezes, uma vez para cada pedaço de bloco removido.



Escreva um programa que, dados a altura do bloco, o comprimento do bloco, e a forma final que o bloco deve ter, determine o número total vezes de que o laser deve ser ligado para esculpir o bloco.

Entrada
A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas. A primeira linha de um caso de teste contém dois números inteiros A e C, separados por um espaço em branco, indicando respectivamente a altura (1 ≤ A ≤ 104) e o comprimento (1 ≤ C ≤ 104) do bloco a ser esculpido, em milímetros. A segunda linha contém C números inteiros Xi, cada um indicando a altura final, em milímetros, do bloco entre as posições i e i + 1 ao longo do comprimento (0 ≤ Xi ≤ A, para 0 ≤ i ≤ C - 1). Considere que a cada varredura uma camada de espessura 1 milímetro é removida do bloco ao longo dos pontos onde o laser está ligado.

O final da entrada é indicado por uma linha que contém apenas dois zeros, separados por um espaço em branco.

Saída
Para cada caso de teste da entrada seu programa deve imprimir uma única linha, contendo um número inteiro, indicando o número de vezes que o laser deve ser ligado para esculpir o bloco na forma indicada.

Exemplo de Entrada	Exemplo de Saída
5 8
1 2 3 2 0 3 4 5
3 3
1 0 2
4 3
4 4 1
0 0

7
3
3

Maratona de Programação da SBC 2009
 */