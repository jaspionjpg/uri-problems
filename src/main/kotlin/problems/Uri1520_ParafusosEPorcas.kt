package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (ler.hasNextInt()) {
        val quantidadeCaixas = ler.nextInt()

        val produtos = IntArray(101)
        for (caixa in 0 until quantidadeCaixas) {
            val inicio = ler.nextInt()
            val fim = ler.nextInt()

            for (produto in inicio..fim)
                produtos[produto]++
        }

        val produtoAPesquisar = ler.nextInt()

        var contadorEstante = 0
        for (indice in produtos.indices) {
            if (indice == produtoAPesquisar) {
                if (produtos[indice] == 0)
                    println("$indice not found")
                else
                    println("$indice found from $contadorEstante to ${contadorEstante + produtos[indice] - 1}")

                break
            }
            contadorEstante += produtos[indice]
        }
    }
}

/*
beecrowd | 1520
Parafusos e Porcas
Por Neilor Tonin, URI BR Brazil

Timelimit: 3


Pedro está trabalhando em um novo emprego em uma loja de parafusos e porcas. Toda semana ele irá receber novas encomendas de parafusos mistos em grandes caixas e precisa saber onde ele deve armazenar esses produtos.

Mango, que é supervisor de Pedro, pediu-lhe para organizar todos os parafusos e porcas em um rack enorme, de forma que seja fácil de responder onde é possível encontrar cada predeterminado lote de parafusos e quanto de cada um destes lotes a loja tem.

Pedro recebe todos os parafusos e porcas em caixas etiquetadas com o intervalo de tamanho dos produtos. Por exemplo, duas caixas com os respectivos intervalos (1, 2) e (4, 8) representam lotes de produtos com tamanho {1, 2, 4, 5, 6, 7, 8}. Um número de parafuso e porca pode estar presente em mais de uma caixa, e ele aparece na lista uma vez para cada intervalo. Por exemplo, três caixas com os respectivos intervalos (1, 3), (2, 4) e (3,5) representam lotes de parafusos e porcas com tamanho {1, 2, 2, 3, 3, 3, 4, 4, 5}.

Entrada
A entrada contém vários casos de teste e termina com EOF. Cada caso de teste é composto por várias linhas. A primeira linha contém um inteiro positivo N (N < 100) que indica a quantidade de caixas de parafusos. Seguem N linhas, cada uma delas com dois valores X e Y (1 ≤ X < Y ≤ 100) que representam os tamanhos dos lotes de parafusos e porcas presentes naquela caixa. A próxima linha de entrada conterá um único inteiro positivo Num (1 ≤ Num ≤ 100), que indica o número que Mango deseja pesquisar após todos os produtos serem organizados na estante ou rack.

Obs. A estante ou rack possui prateleiras enumeradas de 0 a P, sendo que este P não deve ser superior a 10000.

Saída
Cada caso de entrada deverá produzir uma única linha de saída, indicando as posições da prateleira nas quais o parafuso de tamanho Num se encontra ou indicando que não foi possível encontrar o parafuso, conforme o exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
3
1 3
2 4
3 5
4
4
1 3
2 4
1 5
3 6
3
2
1 3
3 5
7

4 found from 6 to 7
3 found from 5 to 8
7 not found

Contest Delta 2014
 */