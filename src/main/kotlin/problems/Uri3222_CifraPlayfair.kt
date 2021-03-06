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
Por Jimmy M??rdell FI Finland

Timelimit: 1
A cifra Playfair ?? uma t??cnica de criptografia sim??trica manual e foi a primeira cifra de substitui????o do d??grafo. O esquema foi inventado em 1854 por Charles Wheatstone, mas leva o nome de Lord Playfair, que promoveu o uso da cifra.

A cifra Playfair usa uma tabela de 5 por 5 contendo cada letra do alfabeto ingl??s exatamente uma vez (exceto 'Q' que est?? faltando). A tabela constitui a chave de criptografia. Para lembrar mais facilmente a tabela, ela ?? normalmente gerada a partir de uma frase-chave. Primeiro preencha os espa??os em uma tabela vazia com as letras da frase-chave (eliminando espa??os e letras duplicadas) e, em seguida, preencha os espa??os restantes com o resto das letras do alfabeto em ordem. A frase-chave ?? escrita nas primeiras linhas da tabela, da esquerda para a direita. Por exemplo, se a frase-chave ?? "playfair example", a chave de criptografia torna-se

Playfair Cipher
Para criptografar uma mensagem, deve-se remover todos os espa??os e ent??o dividir a mensagem em d??grafos (grupos de 2 letras) de forma que, por exemplo, ???Hello World??? se torne ???HE LL OW OR LD???. Em seguida, mapeie-os na tabela-chave e aplique a regra abaixo que corresponda ?? combina????o de letras:

Se as duas letras forem iguais (ou apenas uma letra sobrar), adicione um 'X' ap??s a primeira letra. Criptografe o novo par e continue (observe que isso altera todos os d??grafos restantes).
Se as letras aparecerem na mesma linha de sua tabela, substitua-as pelas letras imediatamente ?? direita, respectivamente (envolvendo do lado esquerdo da linha se uma letra do par original estiver no lado direito da linha). Com a tabela acima, o d??grafo 'CH' seria criptografado 'DB'.
Se as letras aparecerem na mesma coluna de sua tabela, substitua-as pelas letras imediatamente abaixo, respectivamente (envolvendo a parte superior da coluna se uma letra do par original estiver na parte inferior da coluna). Com a tabela acima, o d??grafo 'VA' seria criptografado 'AE'.
Se as letras n??o estiverem na mesma linha ou coluna, substitua-as pelas letras da mesma linha, respectivamente, mas no outro par de cantos do ret??ngulo definido pelo par original. O regra ?? importante - a primeira letra do par criptografado ?? aquela que est?? na mesma linha da primeira letra do par de texto simples. Com a tabela acima, o d??grafo 'KM' seria criptografado 'SR'.
Escreva um programa que leia uma frase-chave e um texto simples para criptografar e gere o texto criptografado.

O texto a criptografar n??o conter?? dois 'x's seguidos, ou um 'x' como o ??ltimo caractere, pois isso pode fazer com que a primeira regra acima se repita indefinidamente.

Entrada
A entrada cont??m duas linhas. A primeira linha cont??m a frase-chave. A segunda linha cont??m o texto a criptografar. Cada linha conter?? entre 1 e 1000 caracteres, inclusive estes. Cada caractere ser?? uma letra min??scula em ingl??s, 'a' - 'z' (exceto 'q') ou um caractere de espa??o. Nenhuma das linhas come??ar?? ou terminar?? com um espa??o.

Sa??da
A sa??da deve conter uma ??nica linha com o texto criptografado, em letras mai??sculas. N??o deve haver espa??os na sa??da.

Exemplos de Entrada	Exemplos de Sa??da
playfair example
hide the gold in the tree stump

BMNDZBXDKYBEJVDMUIXMMNUVIF

the magic key
i love programming competition

YDVHCWSPKNTAHKUBIPERMHGHDVRU

Nordic Collegiate Programming Contest 2009
 */

