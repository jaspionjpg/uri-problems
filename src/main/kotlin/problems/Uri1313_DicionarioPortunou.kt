package problems

import java.util.Scanner
/*
Time limit exceeded TMN
 */
fun main(args: Array<String>) {
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

        println(lista.distinct().size)
    }
}

/*
IMCOMPLETOOO
NAO TERMINADO
 */
fun mainDEPRECADOTENTARTERMINAR(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val numPalavrasPortugues = ler.nextInt()
        val numPalavrasEspanhol = ler.nextInt()

        if (numPalavrasEspanhol == 0 && numPalavrasPortugues == 0)
            break

        val tree = ArrayList<Node>()
        for (i in 1..numPalavrasPortugues) {
            val palavraPortugues = ler.next()
            createNodes(palavraPortugues, tree)
        }
        for (i in 1..numPalavrasEspanhol) {
            val palavraEspanhol = ler.next().reversed()

            for (indiceNode in 0 until tree.size) {
                createNodes(palavraEspanhol, tree[indiceNode].filhos)
            }
        }
        var totalPalavras = 0
        for (indiceNode in 0 until tree.size) {
            tree[indiceNode].filhos
        }

        println()
    }
}

fun incrementNodes(stringue: String, nodes: ArrayList<Node>) {
    if (nodes.isEmpty())
        return

    val stringueInicial = stringue[0]
    val nodeExistente = nodes.firstOrNull { node -> node.char == stringueInicial && node.portugues }

    if (nodeExistente != null) {
        incrementNodes(stringue, nodeExistente.filhos)
    } else {
        val novoNode = Node(stringueInicial, portugues = false)
        nodes.add(novoNode)
        createNodes(stringue, novoNode.filhos)
    }
}

fun createNodes(stringue: String, nodes: ArrayList<Node>) {
    if (stringue.isEmpty())
        return

    val stringueInicial = stringue[0]
    val nodeExistente = nodes.firstOrNull { node -> node.char == stringueInicial }

    if (nodeExistente != null) {
        createNodes(stringue.substring(1), nodeExistente.filhos)
    } else {
        val novoNode = Node(stringueInicial)
        nodes.add(novoNode)
        createNodes(stringue.substring(1), novoNode.filhos)
    }
}

data class Node(
    val char: Char,
    val filhos: ArrayList<Node> = ArrayList<Node>(),
    val portugues: Boolean = true
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Node

        if (char != other.char) return false

        return true
    }

    override fun hashCode(): Int {
        return char.hashCode()
    }
}


/*
URI Online Judge | 1313
Dicionário Portuñol
Por Pablo Ariel Heiber, UBA

Argentina
Timelimit: 1
Portuñol é um idioma especial que foi naturalmente desenvolvido na América Latina. Como quase metade da América Latina fala Português e quase metade fala Espanhol (Español), a mistura de ambos os idiomas é natural.

Cada palavra em Portuñol é construída tomando um prefixo não-vazio de um palavra em Português e um sufixo não-vazio de uma palavra em Espanhol, e concatenando-os. Um prefixo de uma palavra é qualquer palavra que possa ser obtida apagando zero ou mais caracteres da sua extremidade direita. Um sufixo de uma palavra é qualquer palavra que possa ser obtida apagando zero ou mais caracteres da sua extremidade esquerda. O nome do prórpio idioma tem origem tomando um prefixo da palavra "Português" (Portu) e um sufixo da palavra "Español" (ñol), e concatenando-os.

É claro, que nem toda maneira possível de combinar duas palavras resultará em algo que faz sentido, ou nem mesmo pronunciável, mas isso não é importante. Nós queremos que você escreva um programa para contar o número de diferentes palavras em Portuñol.

Será dado a você dois conjuntos não-vazios de palavras para testar o seu programa. O primeiro conjunto representará as palavras em Português e o segundo conjunto representará as palavras em Espanhol. Você precisa calcular o número de palavras diferentes em Portuñol que podem ser construídas usando as regras de prefixo e sufixo descritas acima. Note que a mesma palavra pode ser construída de várias maneiras, mas ela precisa ser contada apenas como uma. Também note que os conjuntos de entrada são apenas para testar o seu programa, então eles não precisam necessariamente ser feitos de palavras atuais do Português ou do Espanhol.

Entrada
Cada caso de teste é descrito usando várias linhas. A primeira linha contém dois inteiros P e S representando respectivamente o número de palavras em Português e o número de palavras em Espanhol. (1 ≤ P, S ≤ 1000). Cada uma das próximas P linhas contém uma palavra em Português, e cada uma das próximas S linhas contém uma palavra em Espanhol. Cada palavra é uma cadeia não-vazia de no máximo 1000 caracteres. Cada caracteres é uma das 26 letras minúsculas (de 'a' até 'z'). Você pode assumir que dentro de cada caso de teste duas palavras em Português não são iguais, e que a soma dos comprimentos de todas as palavras em Português é no máximo 105. O mesmo se aplica às palavras em Espanhol.

O último caso de teste é seguido por uma linha contendo dois zeros.

Saída
Para cada caso de teste imprima uma linha contendo um inteiro representando o número de diferentes palavras que podem ser construídas concatenando-se um prefixo não-vazio de uma palavra no primeiro conjunto (palavras em Português) e um sufixo não-vazio de uma palavra no segundo conjunto (palavras em Espanhol).

Exemplo de Entrada	Exemplo de Saída
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