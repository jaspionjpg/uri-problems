package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    var testes = 1
    while (ler.hasNextLine()) {
        val parAlvo = ler.nextLine()
        val pares = ler.nextLine().split(" ")

        if (testes != 1)
            println()

        var listaPares = mutableMapOf("M" to 0, "F" to 0)

        for (indicePar in 0 until pares.size step 2) {
            if (pares[indicePar] == parAlvo) {
                listaPares[pares[indicePar + 1]] = listaPares[pares[indicePar + 1]]!! + 1
            }
        }

        println("Caso $testes:")
        println("Pares Iguais: ${listaPares["M"]!! + listaPares["F"]!!}")
        println("F: ${listaPares["F"]}")
        println("M: ${listaPares["M"]}")
        testes++
    }
}

/*
URI Online Judge | 1218
Getline Three - Calçados
Por Neilor Tonin, URI  Brasil

Timelimit: 1
Agora que Mangojata resolveu alguns problemas que utilizavam getline, acha que está apta a dar um passo adiante. Ela está prestes a fazer um novo programa para auxiliar a sua irmã, Overlaine. Overlaine é vendedora de calçados e por um acidente, misturou todos os pares de calçados que tinha para vender. Ela quer informar um número qualquer N e contar quantos calçados de uma determinada caixa são deste tamanho (N). O problema é que Overlaine não tem a menor idéia de quantos calçados existem em cada caixa. A única coisa que sabe é que cada calçado pode ter numeração de 20 a 44, podendo ser masculino ou feminino.

Entrada
A entrada contém vários casos de teste e termina com EOF (Fim de Arquivo). Cada caso de teste consiste de duas linhas de entrada. A primeira linha contém uma numeração N (20 ≤ N ≤ 44) de calçado que Overlaine informa e a segunda linha contém o número de cada par que está dentro da caixa seguido de M ou F indicando se o par é de calçado Masculino ou Feminino.

Saída
Para cada caso de teste imprima quatro linhas, conforme exemplo abaixo. A primeira linha deve apresentar a mensagem “Caso n:”, onde n é o número do caso de teste. A segunda linha deve informar quantos pares da caixa de calçados são iguais ao número que Overlaine quer encontrar, com mensagem correspondente. Seguem duas linhas com a quantidade respectiva de calçados Femininos (F) e Masculinos (M), com mensagem correspondente.

Imprima uma linha em branco entre as saídas de dois casos de teste consecutivos.

Exemplo de Entrada	Exemplo de Saída
23
23 F 28 M 23 F 40 M 36 F 23 M 23 F 24 M 23 M
28
22 M 23 F 28 M 32 F

Caso 1:
Pares Iguais: 5
F: 3
M: 2

Caso 2:
Pares Iguais: 1
F: 0
M: 1
 */