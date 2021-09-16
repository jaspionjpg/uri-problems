package problems

import java.util.Scanner

//
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
//        val treePortugues = ArrayList<Node>()
//        val treeEspanhol = ArrayList<Node>()
//        for (i in 1..numPalavrasPortugues) {
//            val palavraPortugues = ler.next()
//            criarNodes(palavraPortugues, treePortugues)
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

