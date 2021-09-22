package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()
    for (teste in 0 until testes) {
        val comprasFeiras = mutableMapOf<String, Double>()
        val produtosAVenda = ler.nextInt()
        for (i in 0 until produtosAVenda) {
            val nome: String = ler.next()
            val preco = ler.nextDouble()

            comprasFeiras[nome] = preco
        }

        var total = 0.0

        val produtosComprados = ler.nextInt()
        for (i in 0 until produtosComprados) {
            val nome: String = ler.next()
            val numeroComprados: Int = ler.nextInt()

            total += numeroComprados * comprasFeiras[nome]!!
        }

        println("R$ %.2f".format(total))
    }
}

/*
URI Online Judge | 1281
Ida à Feira
Por Neilor Tonin, URI  Brasil

Timelimit: 1
Dona Parcinova costuma ir regularmente à feira para comprar frutas e legumes. Ela pediu então à sua filha, Mangojata, que a ajudasse com as contas e que fizesse um programa que calculasse o valor que precisa levar para poder comprar tudo que está em sua lista de compras, considerando a quantidade de cada tipo de fruta ou legume e os preços destes itens.

Entrada
A primeira linha de entrada contém um inteiro N que indica a quantidade de idas à feira de dona Parcinova (que nada mais é do que o número de casos de teste que vem a seguir). Cada caso de teste inicia com um inteiro M que indica a quantidade de produtos que estão disponíveis para venda na feira. Seguem os M produtos com seus preços respectivos por unidade ou Kg. A próxima linha de entrada contém um inteiro P (1 ≤ P ≤ M) que indica a quantidade de diferentes produtos que dona Parcinova deseja comprar. Seguem P linhas contendo cada uma delas um texto (com até 50 caracteres) e um valor inteiro, que indicam respectivamente o nome de cada produto e a quantidade deste produto.

Saída
Para cada caso de teste, imprima o valor que será gasto por dona Parcinova no seguinte formato: R$ seguido de um espaço e seguido do valor, com 2 casas decimais, conforme o exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
2
4
mamao 2.19
cebola 3.10
tomate 2.80
uva 2.73
3
mamao 2
tomate 1
uva 3
5
morango 6.70
repolho 1.12
brocolis 1.71
tomate 2.80
cebola 2.81
4
brocolis 2
tomate 1
cebola 1
morango 1

R$ 15.37
R$ 15.73
 */