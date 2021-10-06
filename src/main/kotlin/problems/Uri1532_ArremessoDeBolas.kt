package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (true) {
        val distancia = ler.nextInt()
        val velocidadeMax = ler.nextInt()

        if (distancia + velocidadeMax == 0)
            break

        var possivel = false
        for (velocidadeAtual in velocidadeMax downTo 1) {
            possivel = `éPossivelCairNoBuraco?`(velocidadeAtual, distancia)
            if (possivel)
                break
        }
        if (possivel)
            println("possivel")
        else println("impossivel")
    }
}

private fun `éPossivelCairNoBuraco?`(velocidadeMax: Int, distancia: Int): Boolean {
    var contador = 0

    var possivel = false
    for (velocidade in velocidadeMax downTo 1) {
        for (pulos in 1..velocidade) {
            contador += velocidade
            if (contador == distancia)
                possivel = true
        }

    }
    return possivel
}

/*
URI Online Judge | 1532
Arremesso de Bolas
Por Cristhian Bonilha, UTFPR BR Brazil

Timelimit: 1
Seus amigos inventaram uma nova competição: Arremesso de bolas. O objetivo é simples, basta arremessar uma bola de forma que ela caia dentro de um buraco N metros a sua frente.

Quando a bola é arremessada, digamos que à uma velocidade inteira V, ela permanece no ar por V metros e então quica. Ela repete esse processo V vezes. Após ela quicar V vezes, ela muda sua velocidade para V-1, e o processo anterior se repete, até que a velocidade seja igual a 0.

Por exemplo, se a bola for arremessada a uma velocidade igual a 3, ela quicará nos seguintes pontos: 3, 6, 9, 11, 13, 14; conforme pode ser visto na imagem.



Você consegue arremessar a bola à uma velocidade inteira menor ou igual a V. Dada a distância do buraco, diga se é possível que você arremesse a bola e que ela quique exatamente no buraco, acertando-o.

Entrada
Haverá diversos casos de teste. Cada caso de teste contém dois inteiros, N e V (1 ≤ N ≤ 1000, 1 ≤ V ≤ 30), representando a distância do buraco e a velocidade máxima com a qual você consegue arremessar a bola.

O último caso de teste é indicado quando N = V = 0, o qual não deverá ser processado.

Saída
Para cada caso de teste, imprima uma linha contendo a palavra “possivel” (sem aspas), caso seja possível arremessar a bola a uma velocidade menor ou igual a V de forma que ela quique no buraco, ou “impossivel”, caso contrário.

Exemplo de Entrada	Exemplo de Saída
14 3
13 3
12 3
5 3
30 4
0 0

possivel
possivel
impossivel
possivel
possivel

Maratona Algar Telecom XIII
 */