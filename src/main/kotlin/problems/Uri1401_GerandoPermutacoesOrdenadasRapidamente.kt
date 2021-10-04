package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()
    for (teste in 1..testes) {
        val palavra = ler.next()

        val permutacoes = mutableSetOf<String>()
        setarPermutacoes("", palavra, permutacoes)

        for (permuta in permutacoes.sorted())
            println(permuta)
        println()
    }
}

private fun setarPermutacoes(prefixo: String, palavra: String, lista: MutableSet<String>) {
    val tamanhoPalavra: Int = palavra.length
    if (tamanhoPalavra == 0) {
        lista.add(prefixo)
    } else {
        for (i in 0 until tamanhoPalavra) {
            setarPermutacoes(
                prefixo + palavra[i],
                palavra.substring(0, i) + palavra.substring(i + 1, tamanhoPalavra),
                lista
            )
        }
    }
}

/*
URI Online Judge | 1401
Gerando Permutações Ordenadas Rapidamente
Por Shahriar Manzoor, SEU  Bangladesh
Timelimit: 2
Gerar permutações sempre foi um problema importante na ciência da computação. Neste problema, você terá de gerar todas as permutações de uma dada string, em ordem lexicográfica crescente. Lembre-se que seu algoritmo deve ser eficiente.

Entrada
A primeira linha da entrada contém um inteiro n, indicando o número de strings que seguem. As próximas n linhas contém uma string cada. Cada string conterá apenas caracteres alfanuméricos, e nunca conterá espaços. O tamanho máximo de uma string é 10.

Saída
Para cada string da entrada, imprima todas as permutações possíveis da string, em ordem lexicográfica crescente. Note que as strings devem ser tratas como Case Sensitive (isto é, letras maiúsculas são diferentes das minúsculas). Além disso, nenhuma permutação deve ser impressa mais de uma vez. Uma linha em branco deve ser impressa após cada lista de permutações.

Exemplo de Entrada	Exemplo de Saída
3
ab
abc
bca

ab
ba

abc
acb
bac
bca
cab
cba

abc
acb
bac
bca
cab
cba

 */