package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val testes = ler.nextInt()

    for (teste in 1..testes) {
        val numeroprojeteis = ler.nextInt()

        val lista = ArrayList<Pair<Int, Int>>()
        for (i in 1..numeroprojeteis) {
            val poderProjetel = ler.nextInt()
            val pesoProjetel = ler.nextInt()
            lista.add(poderProjetel to pesoProjetel)
        }

        val capacidadeCanhao = ler.nextInt()
        val defesaCastelo = ler.nextInt()


        val valor = pegarSoma(0, 0, 0, lista, capacidadeCanhao, defesaCastelo)

        if (valor >= defesaCastelo)
            println("Missao completada com sucesso")
        else println("Falha na missao")
    }
}

private fun pegarSoma(
    indice: Int,
    valorInicial: Int,
    pesoInicial: Int,
    lista: ArrayList<Pair<Int, Int>>,
    limitePeso: Int,
    poderAAtingir: Int
): Int {

    for (i in indice until lista.size) {
        var (soma, peso) = lista[i]

        soma += valorInicial
        peso += pesoInicial

        if (soma >= poderAAtingir && peso <= limitePeso)
            return soma

        if (peso == limitePeso)
            continue

        if (peso < limitePeso) {
            val outroValor = pegarSoma(i + 1, soma, peso, lista, limitePeso, poderAAtingir)

            if (outroValor >= poderAAtingir)
                return outroValor
        }
    }

    return 0
}

/*
URI Online Judge | 1288
Canhão de Destruição
Por Rafael A., Lucas D. e Marlon T., URI  Brasil

Timelimit: 1
O jogo canhão de destruição é um jogo muito simples de ser entendido. Você recebeu como missão destruir um determinado castelo, sendo que o mesmo possui como característica um número inteiro R que é a sua resistência. Para tentar completar sua missão, você recebeu um canhão que é carregado com projéteis de chumbo, sendo que este canhão pode ser carregado com quantos projéteis forem possíveis desde que a soma do peso deles em quilos não exceda a capacidade de carga do canhão. Podem existir projéteis com pesos iguais e poder de destruição diferentes devido ao seu formato, embora isso não seja tão importante. Ao atingir o castelo, um projétil faz com que o seu valor de destruição seja diminuído da resistência do castelo.

Levando em consideração que o canhão pode ser carregado uma única vez, respeitando o seu limite de quilos, a sua tarefa é carregar o canhão com projéteis que não ultrapassem o seu limite de carga mas que façam o maior estrago possível, para saber se a missão foi completada ou não.

Entrada
A primeira linha de entrada contém o número de casos de teste. Cada caso de teste inicia com uma linha contendo um número inteiro N (1 ≤ N ≤ 50), que representa o número de projéteis de chumbo disponíveis. Seguem N linhas contendo dois inteiros X e Y, representando respectivamente o poder de destruição do projétil e o peso do projétil. A próxima linha contém um inteiro K (1 ≤ K ≤ 100) que representa a capacidade de carga do canhão e a última linha do caso de teste contém um inteiro R que indica a resistência total do castelo.

Saída
Se o dano total das cargas carregadas for maior ou igual à resistência do castelo então deverá ser impressa a mensagem “Missao completada com sucesso”, caso contrário, deverá ser impressa a mensagem “Falha na missao”.

Exemplo de Entrada	Exemplo de Saída
3
3
500 5
300 4
30 2
10
680
5
500 5
300 4
100 1
120 1
200 3
12
1120
5
500 5
300 4
100 1
120 1
200 3
12
1020

Missao completada com sucesso
Falha na missao
Missao completada com sucesso

Adaptado por Neilor.
 */