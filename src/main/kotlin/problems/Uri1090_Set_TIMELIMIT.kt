package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val cartas = ArrayList<Carta>()

        val numeroDeTestes = ler.nextInt()
        if (numeroDeTestes == 0)
            break

        for (i in 1..numeroDeTestes) {
            val numeroDaCartas = ler.next()
            val formaGeometrica = ler.next()

            val carta = when {
                formaGeometrica.startsWith("circulo") -> Carta(getNum(numeroDaCartas), Forma.CIRCULO)
                formaGeometrica.startsWith("triangulo") -> Carta(getNum(numeroDaCartas), Forma.TRIANGULO)
                formaGeometrica.startsWith("quadrado") -> Carta(getNum(numeroDaCartas), Forma.QUADRADO)
                else -> Carta(getNum(numeroDaCartas), Forma.QUADRADO)
            }

            var cartasIguais = ArrayList<Carta>()
            var formasIguaisNumerosDiferentes =
                mapOf(1 to ArrayList<Carta>(), 2 to ArrayList<Carta>(), 3 to ArrayList<Carta>())
            formasIguaisNumerosDiferentes[carta.numero]?.add(carta)

            var formasDiferentesNumerosIguais =
                mapOf(
                    Forma.CIRCULO to ArrayList<Carta>(),
                    Forma.TRIANGULO to ArrayList<Carta>(),
                    Forma.QUADRADO to ArrayList<Carta>()
                )
            formasDiferentesNumerosIguais[carta.forma]?.add(carta)

            var diferentes = ArrayList<Carta>()

            var achou = false
            asdf@ for (cartaRestante in cartas) {
                if (carta.numero == cartaRestante.numero) {
                    if (carta.forma == cartaRestante.forma) {
                        cartasIguais.add(cartaRestante)
                        if (cartasIguais.size == 2) {
                            cartas.removeAll(cartasIguais)
                            achou = true
                            break
                        }
                    } else {
                        formasDiferentesNumerosIguais[cartaRestante.forma]?.add(cartaRestante)
                        if (formasDiferentesNumerosIguais.filter { it.value.isNotEmpty() }.size == 3) {
                            cartas.remove(formasDiferentesNumerosIguais[Forma.QUADRADO]!![0])
                            cartas.remove(formasDiferentesNumerosIguais[Forma.TRIANGULO]!![0])
                            cartas.remove(formasDiferentesNumerosIguais[Forma.CIRCULO]!![0])
                            achou = true
                            break
                        }
                    }
                } else {
                    if (carta.forma == cartaRestante.forma) {
                        formasIguaisNumerosDiferentes[cartaRestante.numero]?.add(cartaRestante)
                        if (formasIguaisNumerosDiferentes.filter { it.value.isNotEmpty() }.size == 3) {
                            cartas.remove(formasIguaisNumerosDiferentes[1]!![0])
                            cartas.remove(formasIguaisNumerosDiferentes[2]!![0])
                            cartas.remove(formasIguaisNumerosDiferentes[3]!![0])
                            achou = true
                            break
                        }
                    } else {
                        diferentes.add(cartaRestante)

                        for (j in 0 until diferentes.size) {
                            for (k in j + 1 until diferentes.size) {
                                if (diferentes[j].forma != diferentes[k].forma && diferentes[j].numero != diferentes[k].numero) {
                                    cartas.remove(diferentes[j])
                                    cartas.remove(diferentes[k])
                                    achou = true
                                    break@asdf
                                }
                            }
                        }
                    }
                }
            }
            if (!achou)
                cartas.add(carta)
        }
        println((numeroDeTestes - cartas.size) / 3)
    }
}

fun getNum(valor: String) =
    when (valor) {
        "um" -> 1
        "dois" -> 2
        "tres" -> 3
        else -> -1
    }

data class Carta(
    val numero: Int,
    val forma: Forma
)

enum class Forma {
    TRIANGULO,
    QUADRADO,
    CIRCULO
}
/*
URI Online Judge | 1090
Set
Por Fábio Dias Moreira  Brasil

Timelimit: 1
Set é um jogo jogado com um baralho no qual cada carta pode ter uma, duas ou três figuras. Todas as figuras em uma carta são iguais, e podem ser círculos, quadrados ou triângulos. Um set é um conjunto de três cartas em que, para cada característica (número e figura), ou as três cartas são iguais, ou as três cartas são diferentes.

Por exemplo, na figura abaixo, (a) é um set válido, já que todas as cartas têm o mesmo tipo de figura e todas elas têm números diferentes de figuras. Em (b), tanto as figuras quanto os números são diferentes para cada carta. Por outro lado, (c) não é um set, já que as duas últimas cartas têm a mesma figura, mas esta é diferente da figura da primeira carta.

a
bola
bola bola
bola bola bola

b
triangulo
quadrado quadrado quadrado
bola bola

c
quadrado
triangulo triangulo triangulo
triangulo triangulo

O objetivo do jogo é formar o maior número de sets com as cartas que estão na mesa; cada vez que um set é formado, as três cartas correspondentes são  removidas de jogo. Quando há poucas cartas na mesa, é fácil determinar o maior número de sets que podem ser formados; no entanto, quando há muitas cartas há muitas  combinações possíveis. Seu colega quer treinar para o campeonato mundial de Set, e por isso pediu que você fizesse um programa que calcula o maior número de sets que podem ser formados com um determinado conjunto de cartas.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém um inteiro N (3 ≤ N ≤ 3 x 104), indicando o número de cartas na mesa; cada uma das N linhas seguintes contém a descrição de uma carta.

A descrição de uma carta é dada por duas palavras separadas por um espaço; a primeira palavra é "um" ou "dois"   ou "tres" e indica quantas figuras aquela carta possui. A segunda palavra é, “circulo” (ou “circulos”), “quadrado” (ou “quadrados”) ou “triangulo” (ou “triangulos”) indica qual tipo de figura está naquela carta.

O final da entrada é indicado por uma linha contendo um zero.

Saída
Para cada caso de teste da entrada seu programa deve imprimir uma única linha na saída, contendo um número inteiro, indicando o maior número de sets que podem ser formados com as cartas dadas.

Exemplo de Entrada	Exemplo de Saída
3
um circulo
dois circulos
tres circulos
3
um triangulo
tres quadrados
dois circulos
6
dois quadrados
dois quadrados
dois quadrados
dois quadrados
dois quadrados
dois quadrados
4
um quadrado
tres triangulos
um quadrado
dois triangulos
0

1
1
2
0

Maratona de Programação da SBC 2008.
 */
