package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var valor = ler.nextDouble()

    val notas100 = valor.toInt() / 100
    valor -= 100 * notas100
    val notas50 = valor.toInt() / 50
    valor -= 50 * notas50
    val notas20 = valor.toInt() / 20
    valor -= 20 * notas20
    val notas10 = valor.toInt() / 10
    valor -= 10 * notas10
    val notas5 = valor.toInt() / 5
    valor -= 5 * notas5
    val notas2 = valor.toInt() / 2
    valor -= 2 * notas2

    println("NOTAS:")
    println("$notas100 nota(s) de R\$ 100.00")
    println("$notas50 nota(s) de R\$ 50.00")
    println("$notas20 nota(s) de R\$ 20.00")
    println("$notas10 nota(s) de R\$ 10.00")
    println("$notas5 nota(s) de R\$ 5.00")
    println("$notas2 nota(s) de R\$ 2.00")

    val moedas100 = (valor / 1).toInt()
    valor -= 1 * moedas100
    val moedas50 = (valor / 0.5).toInt()
    valor -= 0.5 * moedas50
    val moedas25 = (valor / 0.25).toInt()
    valor -= 0.25 * moedas25
    val moedas10 = (valor / 0.10).toInt()
    valor -= 0.10 * moedas10
    val moedas5 = (valor / 0.05).toInt()
    valor -= 0.05 * moedas5
    val moedas1 = valor / 0.01

    println("MOEDAS:")
    println("$moedas100 moeda(s) de R\$ 1.00")
    println("$moedas50 moeda(s) de R\$ 0.50")
    println("$moedas25 moeda(s) de R\$ 0.25")
    println("$moedas10 moeda(s) de R\$ 0.10")
    println("$moedas5 moeda(s) de R\$ 0.05")
    println("%.0f moeda(s) de R\$ 0.01".format(moedas1))
}

/*

URI Online Judge | 1021
Notas e Moedas
Por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.

Exemplo de Entrada	Exemplo de Saída
576.73

NOTAS:
5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
1 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
3 moeda(s) de R$ 0.01

4.00

NOTAS:
0 nota(s) de R$ 100.00
0 nota(s) de R$ 50.00
0 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
0 nota(s) de R$ 5.00
2 nota(s) de R$ 2.00
MOEDAS:
0 moeda(s) de R$ 1.00
0 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
0 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
0 moeda(s) de R$ 0.01

91.01

NOTAS:
0 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
2 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
0 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
0 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
0 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
1 moeda(s) de R$ 0.01

 */