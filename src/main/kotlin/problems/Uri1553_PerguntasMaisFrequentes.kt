package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (ler.hasNextInt()) {
        val perguntas = ler.nextInt()
        val repeticoesParaSomar = ler.nextInt()
        if (perguntas + repeticoesParaSomar == 0)
            break

        val lista = mutableMapOf<Int, Int>()

        for (i in 1..perguntas) {
            val numero = ler.nextInt()
            lista[numero] = (lista[numero] ?: 0) + 1
        }
        var contador = 0
        for (pergunta in lista)
            if (pergunta.value >= repeticoesParaSomar)
                contador++
        println(contador)
    }
}

/*
URI Online Judge | 1553
Perguntas mais Frequentes
Por Cristhian Bonilha, UTFPR BR Brazil

Timelimit: 1
Muitos sites na internet adicionam uma sessão chamada “Perguntas mais Frequentes” que, como o nome já diz, contém as perguntas mais feitas pelos usuários que utilizam o site.

O portal do URI costuma receber muitas perguntas de seus usuários, então Neilor imaginou que seria uma boa ideia adicionar uma sessão de Perguntas mais Frequentes no site. Como o Neilor anda muito ocupado ultimamente, ele pediu a sua ajuda para adicionar essa sessão.

Dados os identificadores de perguntas feitas pelos usuários, diga o número de perguntas que serão adicionadas na nova sessão do site. Uma pergunta é classificada como “frequente” quando ela é feita ao menos K vezes.

Entrada
Haverá diversos casos de teste. Cada caso de teste inicia com dois inteiros N e K (1 ≤ N ≤ 1000, 1 ≤ K ≤ 100), indicando o número de perguntas realizadas, e o número de vezes que uma pergunta deve ser feita para ser considerada “frequente”, respectivamente.

Em seguida haverá N inteiros P (1 ≤ P ≤ 100), cada um indicando o número de uma determinada pergunta.

O último caso de teste é indicado quando N = K = 0, o qual não deverá ser processado.

Saída
Para cada caso de teste imprima uma linha, contendo um inteiro, indicando o número de perguntas que serão adicionadas na nova sessão do site.

Exemplo de Entrada	Exemplo de Saída
5 2
1 4 2 1 3
5 2
1 1 2 3 2
8 3
1 1 3 5 4 6 3 4
8 3
1 1 1 1 1 1 1 1
0 0
1
2
0
1
Aquecimento para a OBI 2014
 */