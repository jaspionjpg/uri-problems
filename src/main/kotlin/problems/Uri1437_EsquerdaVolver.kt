package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val numcomandos = ler.nextInt()
        if (numcomandos == 0)
            break

        val comandos = ler.next()

        var posicao = 0
        for (comando in comandos)
            if (comando == 'D')
                posicao++
            else posicao--

        val valor = when (posicao % 4) {
            0 -> "N"
            1 -> "L"
            2 -> "S"
            3 -> "O"
            -1 -> "O"
            -2 -> "S"
            -3 -> "L"
            else -> "0"
        }
        println(valor)
    }
}

/*
URI Online Judge | 1437
Esquerda, Volver!
Por Ricardo Anido  Brasil
Timelimit: 1
Este ano o sargento está tendo mais trabalho do que de costume para treinar os recrutas. Um deles é muito atrapalhado, e de vez em quando faz tudo errado – por exemplo, ao invés de virar à direita quando comandado, vira à esquerda, causando grande confusão no batalhão. O sargento tem fama de durão e não vai deixar o recruta em paz enquanto este não aprender a executar corretamente os comandos. No sábado à tarde, enquanto todos os outros recrutas estão de folga, ele obrigou o recruta a fazer um treinamento extra. Com o recruta marchando parado no mesmo lugar, o sargento emitiu uma série de comandos "Esquerda, Volver!" e "Direita, Volver!". A cada comando, o recruta deve girar sobre o mesmo ponto e dar um quarto de volta na direção correspondente ao comando. Por exemplo, se o recruta está inicialmente com o rosto voltado para a direção norte, após um comando de "esquerda volver!" ele deve ficar com o rosto voltado para a direção oeste. Se o recruta está inicialmente com o rosto voltado para o leste, após um comando "Direita, volver!" ele deve ter o rosto voltado para o sul. No entanto, durante o treinamento, em que o recruta tinha inicialmente o rosto voltado para o norte, o sargento emitiu uma série tão extensa de comandos, e tão rapidamente, que até ele ficou confuso, e não sabe mais para qual direção o recruta deve ter seu rosto voltado após executar todos os comandos. Você pode ajudar o sargento?
Entrada
A entrada contém vários casos de teste. A primeira linha de um caso de teste contém um inteiro N que indica o número de comandos emitidos pelo sargento (1 ≤ N ≤ 1000)). A segunda linha contém N caracteres, descrevendo a série de comandos emitidos pelo sargento. Cada comando é representado por uma letra: 'E' (para "Esquerda, volver!") e 'D' (para "direita, volver!"). O final da entrada é indicado por N = 0.

A entrada deve ser lida da entrada padrão.

Saída
Para cada caso de teste da entrada seu programa deve produzir uma única linha da saída, indicando a direção para a qual o recruta deve ter sua face voltada após executar a série de comandos, considerando que no início o recruta tem a face voltada para o norte. A linha deve conter uma letra entre 'N', 'L', 'S' e 'O', representando respectivamente as direções norte, leste, sul e oeste.

A saída deve ser escrita na saída padrão.

Exemplo de Entrada	Exemplo de Saída
3
DDE
2
EE
0

L
S

Maratona de Programacao da SBC 2006.
 */