package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val produtosComprados: Int = ler.nextInt()
    var total = 0.0

    for (i in 0 until produtosComprados) {
        val codigo: Int = ler.nextInt()
        val quantidade: Int = ler.nextInt()
        total += when (codigo) {
            1001 -> quantidade * 1.50
            1002 -> quantidade * 2.50
            1003 -> quantidade * 3.50
            1004 -> quantidade * 4.50
            1005 -> quantidade * 5.50
            else -> 0.0
        }
    }

    println("%.2f".format(total))
}

/*
URI Online Judge | 1985
MacPRONALTS
Por Victor Jatobá, UNIME BR Brazil

Timelimit: 1
O MacPRONALTS está com uma super promoção, exclusivo para os competidores da primeira Seletiva do MaratonaTEC. Só que teve um problema, todos os maratonistas foram tentar comprar ao mesmo tempo, com isso gerou uma fila muito grande. O pior é que a moça do caixa estava sem calculadora ou um programa para ajudá-la a calcular com maior agilidade, eis que surge você para fazer um programa para ajudar a coitada e aumentar a renda do MacPRONALTS. Segue o cardápio do dia contendo o número do produto e seu respectivo valor.

1001 | R$ 1.50
1002 | R$ 2.50
1003 | R$ 3.50
1004 | R$ 4.50
1005 | R$ 5.50

Entrada
A primeira entrada informada é a quantidade de produtos comprados (1 <= p <= 5). Para cada produto segue a quantidade (1 <= q <= 500) que o consumidor comprou.

Obs.: não poderão ser informados números de produtos repetidos.

Saída
Você deve imprimir o valor da compra com duas casas decimais.

Input Sample	Output Sample
2
1001 2
1005 3

19.50

1
1003 500
1750.00

5

1001 500
1005 300
1003 23
1002 52
1004 44
2808.50

I Seletiva MaratonaTEC - Maratona de Programação PRONATEC - UNIME
 */