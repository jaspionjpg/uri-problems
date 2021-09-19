package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val n = ler.nextInt()
    for (i in 0 until n) {
        var esq = 0
        var dir = 0
        for (pares in ler.next()) {
            if (pares == '<') esq++
            if (pares == '>') {
                if (esq > 0) {
                    dir++
                    esq--
                }
            }
        }
        println(dir)
    }
}

/*
URI Online Judge | 1069
Diamantes e Areia
Por Neilor Tonin, URI  Brasil

Timelimit: 1
João está trabalhando em uma mina, tentando retirar o máximo que consegue de diamantes "<>". Ele deve excluir todas as particulas de areia "." do processo e a cada retirada de diamante, novos diamantes poderão se formar. Se ele tem como uma entrada .<...<<..>>....>....>>>., três diamantes são formados. O primeiro é retirado de <..>, resultando  .<...<>....>....>>>. Em seguida o segundo diamante é retirado, restando .<.......>....>>>. O terceiro diamante é então retirado, restando no final .....>>>., sem possibilidade de extração de novo diamante.

Entrada
Deve ser lido um valor inteiro N que representa a quantidade de casos de teste. Cada linha a seguir é um caso de teste que contém até 1000 caracteres, incluindo "<,>, ."

Saída
Você deve imprimir a quantidade de diamantes possíveis de serem extraídos em cada caso de entrada.

Exemplo de Entrada	Exemplo de Saída
2
<..><.<..>>
<<<..<......<<<<....>

3
1

Baseado no problema "Caçador de Diamantes"
 */