package problems

import java.util.Scanner

/*
Time limit exceeded TMN
 */
fun maissn(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val numPalavrasPortugues = ler.nextInt()
        val numPalavrasEspanhol = ler.nextInt()

        if (numPalavrasEspanhol == 0 && numPalavrasPortugues == 0)
            break

        var lista = ArrayList<String>()

        var listaPrefixos = ArrayList<String>()

        for (i in 1..numPalavrasPortugues) {
            val palavraPortugues = ler.next()

            for (iPalavra in 1..palavraPortugues.length) {
                val prefixo = palavraPortugues.substring(0, iPalavra)
                listaPrefixos.add(prefixo)
            }
        }
        for (i in 1..numPalavrasEspanhol) {
            val palavraEspanhol = ler.next()

            for (j in palavraEspanhol.length - 1 downTo 0) {
                val sufixo = palavraEspanhol.substring(j, palavraEspanhol.length)

                for (k in 0 until listaPrefixos.size)
                    lista.add(listaPrefixos[k] + sufixo)
            }
        }
//
//        lista.forEach {
//            println(it)
//        }

        println(lista.distinct().size)
    }
}

/*
TIME LIMIT
// */
//fun main(args: Array<String>) {
//    val ler = Scanner(System.`in`)
//
//    while (true) {
//        val numPalavrasPortugues = ler.nextInt()
//        val numPalavrasEspanhol = ler.nextInt()
//
//        if (numPalavrasEspanhol == 0 && numPalavrasPortugues == 0)
//            break
//
//        val tree = ArrayList<Node>()
//        for (i in 1..numPalavrasPortugues) {
//            val palavraPortugues = ler.next()
//            criarNodes(palavraPortugues, tree)
//        }
//        for (i in 1..numPalavrasEspanhol) {
//            val palavraEspanhol = ler.next()
//            for (indicePalavra in palavraEspanhol.length - 1 downTo 0)
//                incrementarNodes(palavraEspanhol.substring(indicePalavra, palavraEspanhol.length), tree)
//        }
//        println(contar(tree))
//    }
//}
//
///*
//
//ac
//abc
//abcc
//abc
//abbc
//abcbc
//aabc
//ababc
//abcabc
//
// */
//
//fun contar(nodes: ArrayList<Node>): Int {
//    var numeroEspanhois = 0
//    for (i in 0 until nodes.size) {
////        numeroEspanhois += nodes[i].filhos.filter { node -> node.espanhol }.size
//        if (nodes[i].final)
//            numeroEspanhois++
//        numeroEspanhois += contar(nodes[i].filhos)
//    }
//    return numeroEspanhois
//}
//
//fun incrementarNodes(stringue: String, nodes: ArrayList<Node>) {
//    val nodesExistente = nodes.filter { node -> node.portugues }
//    if (nodesExistente.isNotEmpty()) {
//        for (i in 0 until nodesExistente.size) {
//            incrementarNodes(stringue, nodesExistente[i].filhos)
//            criarNodes(stringue, nodesExistente[i].filhos, true)
//        }
//    }
//}
//
//fun criarNodes(stringue: String, nodes: ArrayList<Node>, espanhol: Boolean = false) {
//    if (stringue.isEmpty())
//        return
//
//    val stringueInicial = stringue[0]
//    val nodeExistente = nodes.firstOrNull { node -> node.char == stringueInicial }
//
//    val final = espanhol && stringue.length == 1
//
//    if (nodeExistente != null) {
//        if (!nodeExistente.final)
//            nodeExistente.final = final
//        criarNodes(stringue.substring(1), nodeExistente.filhos, espanhol)
//    } else {
//        val novoNode = Node(
//            stringueInicial,
//            portugues = !espanhol,
//            final = final
//        )
//        nodes.add(novoNode)
//        criarNodes(stringue.substring(1), novoNode.filhos, espanhol)
//    }
//}
//
//data class Node(
//    val char: Char,
//    val filhos: ArrayList<Node> = ArrayList<Node>(),
//    val portugues: Boolean = true,
//    var final: Boolean = false
//) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Node
//
//        if (char != other.char) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        return char.hashCode()
//    }
//}
//

/*
URI Online Judge | 1313
Dicion??rio Portu??ol
Por Pablo Ariel Heiber, UBA

Argentina
Timelimit: 1
Portu??ol ?? um idioma especial que foi naturalmente desenvolvido na Am??rica Latina. Como quase metade da Am??rica Latina fala Portugu??s e quase metade fala Espanhol (Espa??ol), a mistura de ambos os idiomas ?? natural.

Cada palavra em Portu??ol ?? constru??da tomando um prefixo n??o-vazio de um palavra em Portugu??s e um sufixo n??o-vazio de uma palavra em Espanhol, e concatenando-os. Um prefixo de uma palavra ?? qualquer palavra que possa ser obtida apagando zero ou mais caracteres da sua extremidade direita. Um sufixo de uma palavra ?? qualquer palavra que possa ser obtida apagando zero ou mais caracteres da sua extremidade esquerda. O nome do pr??rpio idioma tem origem tomando um prefixo da palavra "Portugu??s" (Portu) e um sufixo da palavra "Espa??ol" (??ol), e concatenando-os.

?? claro, que nem toda maneira poss??vel de combinar duas palavras resultar?? em algo que faz sentido, ou nem mesmo pronunci??vel, mas isso n??o ?? importante. N??s queremos que voc?? escreva um programa para contar o n??mero de diferentes palavras em Portu??ol.

Ser?? dado a voc?? dois conjuntos n??o-vazios de palavras para testar o seu programa. O primeiro conjunto representar?? as palavras em Portugu??s e o segundo conjunto representar?? as palavras em Espanhol. Voc?? precisa calcular o n??mero de palavras diferentes em Portu??ol que podem ser constru??das usando as regras de prefixo e sufixo descritas acima. Note que a mesma palavra pode ser constru??da de v??rias maneiras, mas ela precisa ser contada apenas como uma. Tamb??m note que os conjuntos de entrada s??o apenas para testar o seu programa, ent??o eles n??o precisam necessariamente ser feitos de palavras atuais do Portugu??s ou do Espanhol.

Entrada
Cada caso de teste ?? descrito usando v??rias linhas. A primeira linha cont??m dois inteiros P e S representando respectivamente o n??mero de palavras em Portugu??s e o n??mero de palavras em Espanhol. (1 ??? P, S ??? 1000). Cada uma das pr??ximas P linhas cont??m uma palavra em Portugu??s, e cada uma das pr??ximas S linhas cont??m uma palavra em Espanhol. Cada palavra ?? uma cadeia n??o-vazia de no m??ximo 1000 caracteres. Cada caracteres ?? uma das 26 letras min??sculas (de 'a' at?? 'z'). Voc?? pode assumir que dentro de cada caso de teste duas palavras em Portugu??s n??o s??o iguais, e que a soma dos comprimentos de todas as palavras em Portugu??s ?? no m??ximo 105. O mesmo se aplica ??s palavras em Espanhol.

O ??ltimo caso de teste ?? seguido por uma linha contendo dois zeros.

Sa??da
Para cada caso de teste imprima uma linha contendo um inteiro representando o n??mero de diferentes palavras que podem ser constru??das concatenando-se um prefixo n??o-vazio de uma palavra no primeiro conjunto (palavras em Portugu??s) e um sufixo n??o-vazio de uma palavra no segundo conjunto (palavras em Espanhol).

Exemplo de Entrada	Exemplo de Sa??da
3 3
mais
grande
mundo
mas
grande
mundo
1 5
a
aaaaa
aaaaaa
aaaaaaa
a
aaaaaaaaa
1 1
abc
abc
0 0

182
9
8

ACM/ICPC South America Contest 2011.
 */