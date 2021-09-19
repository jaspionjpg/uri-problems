package problems

import java.util.Scanner
import kotlin.math.ceil

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val cidades = ler.nextInt()
    val capacidade = ler.nextInt()

    val valores = Array(cidades) { 0 }
    val verificados = Array(cidades) { false }
    val lista = Array(cidades) { Array<Int?>(cidades) { null } }

    for (i in 0 until cidades) {
        val ouro = ler.nextInt()
        valores[i] = ouro
    }

    for (i in 1 until cidades) {
        val cidadeA = ler.nextInt() - 1
        val cidadeB = ler.nextInt() - 1
        val comprimento = ler.nextInt()

        lista[cidadeA][cidadeB] = comprimento
        lista[cidadeB][cidadeA] = comprimento
    }

    print(pegarMovimentacoes(0, lista, verificados, valores, capacidade).first)
}

private fun pegarMovimentacoes(
    indiceAtual: Int,
    lista: Array<Array<Int?>>,
    verificados: Array<Boolean>,
    valores: Array<Int>,
    capacidade: Int
): Pair<Int, Int> {
    var caminhos = 0
    var quantidade = 0

    verificados[indiceAtual] = true
    for (indice in 0 until lista[indiceAtual].size) {
        if (verificados[indice] || lista[indiceAtual][indice] == null)
            continue

        var (caminhosFilhos, quantidadesFilhos) = pegarMovimentacoes(indice, lista, verificados, valores, capacidade)

        quantidade += quantidadesFilhos + valores[indice]
        val movimentos = ceil((quantidadesFilhos.toDouble() + valores[indice]) / capacidade)
        caminhos += movimentos.toInt() * 2 * lista[indiceAtual][indice]!! + caminhosFilhos
    }

    return caminhos to quantidade
}

/*

URI Online Judge | 2666
Imposto Real
Por Maratona de Programção da SBC, ACM ICPC 2017 BR Brazil

Timelimit: 1
O reino de Nlogônia é rico, o povo é educado e feliz, mas o Rei é um tirano quando o assunto se refere a impostos. A cada final de ano, cada cidade do país deve pagar uma determinada quantidade de quilos de ouro em impostos. Chegado o momento de coletar os impostos, o Rei envia sua carruagem real para recolher o ouro devido, usando as estradas do reino.

Cada estrada liga duas cidades diferentes e pode ser percorrida nas duas direções. A rede de estradas é tal que é possível ir de qualquer cidade para qualquer outra cidade, possivelmente passando por cidades intermediárias, mas há apenas um caminho entre duas cidades diferentes.

Em cada cidade há um cofre real, utilizado para armazenamento de ouro de impostos. Os cofres reais são imensos, de forma que cada cofre tem capacidade de armazenar todo o ouro devido por todo o reino. A carruagem sai da capital, percorrendo as estradas do reino, visitando as cidades para recolher o ouro devido, podendo usar qualquer cofre real para armazenar temporariamente uma parte do imposto recolhido, se necessário. Ao final da coleta, todo o ouro devido por todas as cidades deve estar armazenado no cofre real da capital.

Ávaro como é o Rei, ele contratou o seu time para, dados a quantidade de ouro a ser recolhido em cada cidade (em kg), a lista das estradas do reino, com os respectivos comprimentos (em km) e a capacidade de carga da carruagem real (em kg), determine qual é a mínima distância que a carruagem deve percorrer para recolher todo o ouro devido.

Entrada
A primeira linha contém dois inteiros N e C indicando respectivamente o número de cidades e a capacidade de carga da carruagem (2 ≤ N ≤ 104 e 1 ≤ C ≤ 100). A capital do reino é identificada pelo número 1, as outras cidades são identificadas por inteiros de 2 a N . A segunda linha contém N inteiros Ei representando a quantidade de imposto devido por cada cidade i (0 ≤ Ei ≤ 100 para 1 ≤ i ≤ N ). Cada uma das N-1 linhas seguintes contém três inteiros A , B e C , indicando que uma estrada liga a cidade A e a cidade B (1 ≤ A, B ≤ N ) e tem comprimento C (1 ≤ C ≤ 100).

Saída
Seu programa deve produzir uma única linha com um inteiro representando a menor distância que a carruagem real deve percorrer para recolher todo o imposto devido, em km.

Exemplos de Entrada	Exemplos de Saída
6 10

0 10 10 10 10 10

1 4 7

5 1 2

3 5 3

2 5 2

6 5 2

44

3 10

10 10 12

1 2 5

2 3 7

58

5 9

5 2 6 3 6

1 2 1

2 3 1

2 4 1

2 5 1

10

Maratona de Programção da SBC-ACM ICPC 2017

 */