package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var testes = 1

    while (true) {
        val dobraduras = ler.nextInt()
        if (dobraduras == -1)
            break

        var coiso = 2
        for (i in 1..dobraduras) {
            coiso = coiso * 2 - 1
        }


        println("Teste $testes")
        println(Math.pow(coiso.toDouble(), 2.0).toInt())
        println()
        testes++
    }
}

/*
beecrowd | 2229
Dobradura
Por OBI - Olimpíada Brasileira de Informática 2002 BR Brazil

Timelimit: 1
Zezinho tem aulas de Iniciação Artística em sua escola, e recentemente aprendeu a fazer dobraduras em papel. Ele ficou fascinado com as inúmeras possibilidades de se dobrar uma simples folha de papel. Como Zezinho gosta muito de matemática, resolveu inventar um quebra-cabeça envolvendo dobraduras. Zezinho definiu uma operação de dobradura D que consiste em dobrar duas vezes uma folha de papel quadrada de forma a conseguir um quadrado com 1/4 do tamanho original, conforme ilustrado na figura.



Depois de repetir N vezes esta operação de dobradura D sobre o papel, Zezinho cortou o quadrado resultante com um corte vertical e um corte horizontal, conforme a figura abaixo.



Zezinho lançou então um desafio aos seus colegas: quem adivinha quantos pedaços de papel foram produzidos?

Entrada
A entrada é composta de vários conjuntos de teste. Cada conjunto de teste é composto de uma única linha, contendo um número inteiro N (-1 ≤ N ≤ 15) que indica o número de vezes que a operação de dobradura D foi aplicada. O final da entrada é indicado por  N = -1.

Saída
Para cada conjunto de teste da entrada seu programa deve produzir três linhas na saída. A primeira linha deve conter um identificador do conjunto de teste, no formato “Teste n”, onde n é numerado a partir de 1. A segunda linha deve conter o número de pedaços de papel obtidos depois de cortar a dobradura, calculado pelo seu programa. A terceira linha deve ser deixada em branco. A grafia mostrada no Exemplo de Saída, abaixo, deve ser seguida rigorosamente.

Exemplo de Entrada	Exemplo de Saída
1

0

-1

Teste 1

9


Teste 2

4


OBI - Olimpíada Brasileira de Informática 2002
 */