package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextLine().toInt()

    for (teste in 1..testes) {
        val numinstrucoes = ler.nextLine().toInt()

        val instrucoes = IntArray(numinstrucoes)
        for (indice in 0 until numinstrucoes) {
            val instrucao = ler.nextLine()
            instrucoes[indice] = when (instrucao) {
                "LEFT" -> -1
                "RIGHT" -> 1
                else -> instrucoes[instrucao.split(" ").last().toInt() - 1]
            }
        }

        var posicao = 0

        for (instrucao in instrucoes)
            posicao += instrucao

        println(posicao)
    }
}

/*
URI Online Judge | 1574
Instruções do Robô
Por Rujia Liu, Tsinghua University CN China

Timelimit: 1
Você possui um robô na origem do eixo x. O robô receberá algumas instruções. Sua tarefa é predizer sua posição depois de executar todas as instruções.

LEFT: move uma unidade para a esquerda (diminui p em 1, onde p é a posição do robô antes de mover)
RIGHT: move uma unidade para a direita (incrementa p em 1)
SAME AS i: executa a mesma ação que na i-ésima instrução. É garantido que i é um inteiro positivo não maior que o número de instruções já executadas.
Entrada
A primeira linha contém o número de casos de testes T (T <= 100). Cada caso de teste inicia com um inteiro n ( 1 <= n <= 100), o número de instruções. Cada uma das n linhas seguintes contém uma instrução.

Saída
Para cada caso de teste, imprima a posição final do robô. Note que após processar cada caso de teste, o robô deve ter sua posição inicial resetada para a origem.

Exemplo de Entrada	Exemplo de Saída
2
3
LEFT
RIGHT
SAME AS 2
5
LEFT
SAME AS 1
SAME AS 2
SAME AS 1
SAME AS 4

1
-5

Agradecimentos: Feng Chen, Md. Mahbubul Hasan
 */