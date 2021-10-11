package problems

import java.util.Scanner

val listaPegar = listOf(
    -1 to 0,
    0 to -1, 0 to 1,
    1 to 0
)

var linhas = 0
var colunas = 0
var mapa = Array(0) { CharArray(0) }

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        linhas = ler.nextInt()
        colunas = ler.nextInt()
        if (linhas + colunas == 0)
            break

        mapa = Array(linhas) { ler.next().toCharArray() }

        for (linha in mapa.indices)
            for (coluna in mapa[linha].indices)
                if (mapa[linha][coluna] == 'T')
                    listaPegar.forEach { (slinha, scoluna) ->
                        progredir(linha + slinha, coluna + scoluna)
                    }

        mapa.forEach {
            println(it.joinToString(""))
        }
        println()
    }
}

private fun progredir(linha: Int, coluna: Int) {
    if (linha < linhas && linha > -1 && coluna < colunas && coluna > -1)
        if (mapa[linha][coluna] == 'A') {
            mapa[linha][coluna] = 'T'
            listaPegar.forEach { (slinha, scoluna) ->
                progredir(linha + slinha, coluna + scoluna)
            }
        }
}

/*
URI Online Judge | 1583
Contaminação
Por Lucas Hermann Negri, UTFPR BR Brasil

Timelimit: 1
Estamos no ano 2241, e a colonização de outros planetas já é uma realidade. Você trabalha no centro de controle de recursos, no planeta URI-942, controlando principalmente os estoques de água. A água é armazenada em tanques subterrâneos, protegida das altas temperaturas da superfície.

Porém, seus colegas Márcio e Ana descobriram falhas nas paredes de alguns tanques, o que pode levar a contaminação do estoque de água. Seus colegas conseguiram identificar os pontos com falhas onde pode haver a infiltração de contaminantes. Sabendo que os agentes contaminantes se espalham por todo o tanque de água afetado, sua tarefa é estimar a contaminação da água de acordo com os mapas fornecidos por seus colegas.

Os mapas foram discretizados em células, sendo que as células podem corresponder a uma região com rocha, água (tanque) ou agente contaminante. Devido as rachaduras, uma célula com agente contaminante contamina as células adjacentes (esquerda, direita, acima e abaixo) contendo água, porém a contaminação é barrada por células de rocha.

Entrada
A entrada é composta por vários mapas, sendo que a descrição de cada mapa começa com uma linha contendo dois inteiros N e M, correspondente ao número de linhas e de colunas do mapa. As N linhas a seguir descrevem o mapa, cada linha contendo M caracteres, além do pulo de linha. Os caracteres possíveis são: A, que representa uma célula contendo água, X, que representa uma célula com rocha e T que representa uma célula com agente contaminante.

A entrada termina quando N = M = 0, caso que não deve ser processado. Em todos os mapas, N e M são menores ou iguais a 50.

Saída
Para cada mapa, imprima uma estimação da contaminação futura. Esta estimação deverá corresponder ao mapa original (como visto na entrada), porém trocando as células com água que foram contaminadas pelo caractere T. Deixe uma linha em branco após cada mapa (incluindo o último mapa).

Exemplo de Entrada	Exemplo de Saída
6 7
XXAAXXX
XXAAXAX
XXXXAXX
XAAAAAX
TAAXAAA
XXXXXXX
3 3
TTT
XXX
AAA
0 0

XXAAXXX
XXAAXAX
XXXXTXX
XTTTTTX
TTTXTTT
XXXXXXX

TTT
XXX
AAA

Aquecimento para a OBI 2014
 */