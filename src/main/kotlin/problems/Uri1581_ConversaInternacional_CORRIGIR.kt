package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes: Int = ler.nextInt()
    for (i in 0 until testes) {

        val linguas: Int = ler.nextInt()

        var primeiraLingua: String? = null
        var éingles = false

        for (j in 0 until linguas) {
            val lingua = ler.next()

            if (!éingles)
                if (primeiraLingua != null) {
                    if (primeiraLingua != lingua) {
                        éingles = true
                    }
                } else primeiraLingua = lingua
        }

        if (éingles)
            println("ingles")
        else
            println(primeiraLingua)
    }
}

/*
URI Online Judge | 1581
Conversa Internacional
Por Cristhian Bonilha, UTFPR BR Brasil

Timelimit: 1
Rafael recentemente recebeu uma bolsa de estudos e está fazendo intercâmbio fora do Brasil, onde conheceu várias pessoas de várias nacionalidades diferentes. O idioma nativo desse país é o Inglês, e todas as pessoas que Rafael conheceu falam inglês como primeira ou segunda língua.

Como aprender um segundo idioma é uma tarefa difícil e cansativa, as pessoas preferem falar seu idioma nativo sempre que possível. Uma exceção à essa regra é quando há duas pessoas no grupo que não tem o mesmo idioma nativo. Nesse tipo de situação, o idioma utilizado é o inglês.

Por exemplo, se em um grupo há só brasileiros, o idioma falado será o português, mas caso haja um espanhol entre os brasileiros, o idioma falado será o inglês.

Rafael as vezes fica confuso sobre qual idioma deveria ser falado em cada grupo de pessoas, e para isso pediu sua ajuda.

Entrada
A primeira linha contém um inteiro N, indicando o número de casos de testes a seguir.

Cada caso de teste inicia com um inteiro K (2 ≤ K ≤ 100), representando o número de pessoas no grupo. Em seguida haverá K linhas, contendo uma string S cada, representando o idioma nativo de cada uma dessas K pessoas.

Cada string conterá no mínimo 1 e no máximo 20 caracteres, entre eles apenas letras minúsculas (a-z).

Saída
Imprima uma linha, contendo uma string S, representando o idioma mais apropriado para a conversa.

Exemplo de Entrada	Exemplo de Saída
2
3
portugues
chines
portugues
2
espanhol
espanhol

ingles
espanhol

Aquecimento para a OBI 2014
 */