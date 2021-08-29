package problems

import java.util.Scanner
import java.util.stream.Collectors

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val alfabeto = listOf(
        'a', 'b', 'c', 'd', 'e',
        'f', 'g', 'h', 'i', 'j',
        'k', 'l', 'm', 'n', 'o',
        'p', 'r', 's', 't', 'u',
        'v', 'w', 'x', 'y', 'z'
    )

    val cifra = ler.nextLine().toLowerCase().replace(" ", "").replace("q", "")
    val listaCaracteresCifra = cifra.chars().distinct().boxed().map { caractereCifra -> caractereCifra.toChar() }
        .collect(Collectors.toList())

    alfabeto.forEach {
        if (!listaCaracteresCifra.contains(it))
            listaCaracteresCifra.add(it)
    }

    val mapCifras = mutableMapOf<Char, Pair<Int, Int>>()
    var posicaoCifra = 0
    for (i in 0 until 5) {
        for (j in 0 until 5) {
            mapCifras[listaCaracteresCifra[posicaoCifra]] = i to j
            posicaoCifra++
        }
    }
    var texto = ler.nextLine().replace(" ", "")

    while (texto.isNotEmpty()) {
        if (texto.length > 1) {
            val char1 = texto.elementAt(0)
            val char2 = texto.elementAt(1)
            if (char1 == char2) {
                texto = char1 + "x" + texto.substring(1)
            }
        }

        var parParaCriptografar: String
        texto = if (texto.length == 1) {
            parParaCriptografar = texto + "x"
            ""
        } else {
            parParaCriptografar = texto.substring(0, 2)
            texto.substring(2)
        }

        val char1 = parParaCriptografar.elementAt(0)
        val char2 = parParaCriptografar.elementAt(1)
        val posicaoCifra1 = mapCifras[char1]!!
        val posicaoCifra2 = mapCifras[char2]!!
        val criptografada = when {
            posicaoCifra1.second == posicaoCifra2.second -> {
                "" + pegarABaixo(posicaoCifra1, listaCaracteresCifra) + pegarABaixo(
                    posicaoCifra2,
                    listaCaracteresCifra
                )
            }
            posicaoCifra1.first == posicaoCifra2.first -> {
                "" + pegarADireita(posicaoCifra1, listaCaracteresCifra) + pegarADireita(
                    posicaoCifra2,
                    listaCaracteresCifra
                )
            }
            else -> {
                val y1 = posicaoCifra1.first
                val x1 = posicaoCifra2.second

                val y2 = posicaoCifra2.first
                val x2 = posicaoCifra1.second
                "" + listaCaracteresCifra[y1 * 5 + x1] + listaCaracteresCifra[y2 * 5 + x2]
            }
        }
        print(criptografada.toUpperCase())
    }
    println()
}

fun pegarADireita(local: Pair<Int, Int>, alfabeto: List<Char>): Char {
    val y = local.first
    val x = if (local.second == 4) 0
    else local.second + 1

    return alfabeto[y * 5 + x]
}

fun pegarABaixo(local: Pair<Int, Int>, alfabeto: List<Char>): Char {
    val y = if (local.first == 4) 0
    else local.first + 1
    val x = local.second

    return alfabeto[y * 5 + x]
}
/*
URI Online Judge | 3222
Cifra Playfair
Por Jimmy Mårdell FI Finland

Timelimit: 1
A cifra Playfair é uma técnica de criptografia simétrica manual e foi a primeira cifra de substituição do dígrafo. O esquema foi inventado em 1854 por Charles Wheatstone, mas leva o nome de Lord Playfair, que promoveu o uso da cifra.

A cifra Playfair usa uma tabela de 5 por 5 contendo cada letra do alfabeto inglês exatamente uma vez (exceto 'Q' que está faltando). A tabela constitui a chave de criptografia. Para lembrar mais facilmente a tabela, ela é normalmente gerada a partir de uma frase-chave. Primeiro preencha os espaços em uma tabela vazia com as letras da frase-chave (eliminando espaços e letras duplicadas) e, em seguida, preencha os espaços restantes com o resto das letras do alfabeto em ordem. A frase-chave é escrita nas primeiras linhas da tabela, da esquerda para a direita. Por exemplo, se a frase-chave é "playfair example", a chave de criptografia torna-se

Playfair Cipher
Para criptografar uma mensagem, deve-se remover todos os espaços e então dividir a mensagem em dígrafos (grupos de 2 letras) de forma que, por exemplo, “Hello World” se torne “HE LL OW OR LD”. Em seguida, mapeie-os na tabela-chave e aplique a regra abaixo que corresponda à combinação de letras:

Se as duas letras forem iguais (ou apenas uma letra sobrar), adicione um 'X' após a primeira letra. Criptografe o novo par e continue (observe que isso altera todos os dígrafos restantes).
Se as letras aparecerem na mesma linha de sua tabela, substitua-as pelas letras imediatamente à direita, respectivamente (envolvendo do lado esquerdo da linha se uma letra do par original estiver no lado direito da linha). Com a tabela acima, o dígrafo 'CH' seria criptografado 'DB'.
Se as letras aparecerem na mesma coluna de sua tabela, substitua-as pelas letras imediatamente abaixo, respectivamente (envolvendo a parte superior da coluna se uma letra do par original estiver na parte inferior da coluna). Com a tabela acima, o dígrafo 'VA' seria criptografado 'AE'.
Se as letras não estiverem na mesma linha ou coluna, substitua-as pelas letras da mesma linha, respectivamente, mas no outro par de cantos do retângulo definido pelo par original. O regra é importante - a primeira letra do par criptografado é aquela que está na mesma linha da primeira letra do par de texto simples. Com a tabela acima, o dígrafo 'KM' seria criptografado 'SR'.
Escreva um programa que leia uma frase-chave e um texto simples para criptografar e gere o texto criptografado.

O texto a criptografar não conterá dois 'x's seguidos, ou um 'x' como o último caractere, pois isso pode fazer com que a primeira regra acima se repita indefinidamente.

Entrada
A entrada contém duas linhas. A primeira linha contém a frase-chave. A segunda linha contém o texto a criptografar. Cada linha conterá entre 1 e 1000 caracteres, inclusive estes. Cada caractere será uma letra minúscula em inglês, 'a' - 'z' (exceto 'q') ou um caractere de espaço. Nenhuma das linhas começará ou terminará com um espaço.

Saída
A saída deve conter uma única linha com o texto criptografado, em letras maiúsculas. Não deve haver espaços na saída.

Exemplos de Entrada	Exemplos de Saída
playfair example
hide the gold in the tree stump

BMNDZBXDKYBEJVDMUIXMMNUVIF

the magic key
i love programming competition

YDVHCWSPKNTAHKUBIPERMHGHDVRU

Nordic Collegiate Programming Contest 2009
 */

