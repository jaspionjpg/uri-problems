package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val quantidadeVagoes = ler.nextInt()
        if (quantidadeVagoes == 0)
            break

        while (true) {
            val destinoOrdem = ArrayList<Int>()
            val primeiroVagao = ler.nextInt()
            if (primeiroVagao == 0)
                break
            destinoOrdem.add(primeiroVagao)
            for (numeroVagao in 1 until quantidadeVagoes) {
                val numeroVagao = ler.nextInt()
                destinoOrdem.add(numeroVagao)
            }

            var atual = 0
            var tremDestinoAtual = destinoOrdem[atual]

            var filaDeVagoesEmEspera = ArrayList<Int>()
            listaVagoes@ for (numeroVagaoAIr in 1..quantidadeVagoes) {
                filaDeVagoesEmEspera.add(numeroVagaoAIr)

                while (filaDeVagoesEmEspera.isNotEmpty() && tremDestinoAtual == filaDeVagoesEmEspera.lastOrNull()) {
                    atual++
                    filaDeVagoesEmEspera.removeAt(filaDeVagoesEmEspera.size - 1)
                    if (atual == quantidadeVagoes)
                        break@listaVagoes
                    tremDestinoAtual = destinoOrdem[atual]
                }
            }

            if (filaDeVagoesEmEspera.isEmpty())
                println("Yes")
            else println("No")
        }

        println()
    }
}

/*
fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var qtTestes = 0
    while (true) {
        val quantidadeVagoes = ler.nextInt()
        if (quantidadeVagoes == 0)
            break

        if (qtTestes > 0)
            println()

        while (true) {
            val trens = IntArray(quantidadeVagoes) { i -> i + 1 }

            val destinoOrdem = ArrayList<Int>()
            val primeiroVagao = ler.nextInt()
            if (primeiroVagao == 0)
                break

            destinoOrdem.add(primeiroVagao)
            for (indiceVagao in 1 until quantidadeVagoes) {
                val numeroVagao = ler.nextInt()
                destinoOrdem.add(numeroVagao)
            }

            var filaDeVagoesEmEspera = ArrayList<Int>()

            var vagoesArrumados = 0
            for (indiceVagao in destinoOrdem.indices) {
                if (trens[indiceVagao] == destinoOrdem[vagoesArrumados]) {
                    vagoesArrumados++
                } else if (destinoOrdem[vagoesArrumados] == filaDeVagoesEmEspera.lastOrNull()) {
                    vagoesArrumados++
                    filaDeVagoesEmEspera.removeLast()
                    filaDeVagoesEmEspera.add(trens[indiceVagao])
                } else {
                    filaDeVagoesEmEspera.add(trens[indiceVagao])
                }
            }

            for (vagaoNaFilaDestino in vagoesArrumados until quantidadeVagoes) {
                if (destinoOrdem[vagaoNaFilaDestino] == filaDeVagoesEmEspera.lastOrNull()) {
                    vagoesArrumados++
                    filaDeVagoesEmEspera.removeLast()
                } else break
            }

            if (vagoesArrumados == quantidadeVagoes)
                println("Yes")
            else println("No")
            qtTestes++
        }
    }
}

/*
URI Online Judge | 1062
Trilhos
Autor Desconhecido

Timelimit: 1
H?? uma famosa esta????o de trem na cidade PopPush. Esta cidade fica em um pa??s incrivelmente acidentado e a esta????o foi criada no ??ltimo s??culo. Infelizmente os fundos eram extremamente limitados naquela ??poca. Foi poss??vel construir somente uma pista. Al??m disso, devido a problemas de espa??o, foi feita uma pista apenas at?? a esta????o (veja figura abaixo).




A tradi????o local ?? que todos os comboios que chegam vindo da dire????o A continuam na dire????o B com os vag??es  reorganizados, de alguma forma. Suponha que o trem que est?? chegando da dire????o A tem N <= 1000 vag??es numerados sempre em ordem crescente 1,2, ..., N. O primeiro que chega ?? o 1 e o ??ltimo que chega ?? o N. Existe um chefe de reorganiza????es de trens que quer saber se ?? poss??vel reorganizar os vag??es para que os mesmos saiam na dire????o B na ordem a1, a2, an..

O  chefe pode utilizar qualquer estrat??gia para obter a sa??da desejada. No caso do desenho ilustrado acima, por exemplo, basta o chefe deixar todos os vag??es entrarem na esta????o (do 1 ao 5) e depois retirar um a um: retira o 5, retira o 4, retira o 3, retira o 2 e por ??ltimo retira o 1.  Desta forma, se o chefe quer saber se a sa??da 5,4,3,2,1 ?? poss??vel em B, a resposta seria Yes. Vag??o que entra na esta????o s?? pode sair para a dire????o B e ?? poss??vel incluir quantos forem necess??rios para retirar o primeiro vag??o desejado.

Entrada
O arquivo de entrada consiste de um bloco de linhas, cada bloco, com exce????o do ??ltimo, descreve um trem e possivelmente mais do que uma requisi????o de reorganiza????o. Na primeira linha de cada bloco h?? um inteiro N que ?? a quantidade de vag??es. Em cada uma das pr??ximas linhas de entrada haver?? uma permuta????o dos valores 1,2, ???, N. A ??ltima linha de cada bloco cont??m apenas 0. Um bloco iniciando com zero (0) indica o final da entrada.

Sa??da
O arquivo de sa??da cont??m a quantidade de linhas correspondente ??s linhas com permuta????es no arquivo de entrada. Cada linha de sa??da deve ser Yes se for poss??vel organizar os vag??es da forma solicitada e No, caso contr??rio. H?? tamb??m uma linha em branco ap??s cada bloco de entrada. No exemplo abaixo,  O primeiro caso de teste tem 3 permuta????es para 5 vag??es. O ultimo zero dos testes de entrada n??o devem ser processados.

Exemplo de Entrada	Exemplo de Sa??da
5
5 4 3 2 1
1 2 3 4 5
5 4 1 2 3
0
6
1 3 2 5 4 6
0
0

Yes
Yes
No

Yes

Tradu????o & Dataset por Neilor
 */