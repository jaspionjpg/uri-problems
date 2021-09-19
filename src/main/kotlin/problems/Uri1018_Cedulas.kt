package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val valortotal = ler.nextInt()
    var valor = valortotal

    val notas100 = valor / 100
    valor -= 100 * notas100
    val notas50 = valor / 50
    valor -= 50 * notas50
    val notas20 = valor / 20
    valor -= 20 * notas20
    val notas10 = valor / 10
    valor -= 10 * notas10
    val notas5 = valor / 5
    valor -= 5 * notas5
    val notas2 = valor / 2
    valor -= 2 * notas2
    val notas1 = valor / 1

    println(valortotal)
    println("$notas100 nota(s) de R\$ 100,00")
    println("$notas50 nota(s) de R\$ 50,00")
    println("$notas20 nota(s) de R\$ 20,00")
    println("$notas10 nota(s) de R\$ 10,00")
    println("$notas5 nota(s) de R\$ 5,00")
    println("$notas2 nota(s) de R\$ 2,00")
    println("$notas1 nota(s) de R\$ 1,00")
}

/*

URI Online Judge | 1018
Cédulas
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

Exemplo de Entrada	Exemplo de Saída
576

576
5 nota(s) de R$ 100,00
1 nota(s) de R$ 50,00
1 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
1 nota(s) de R$ 5,00
0 nota(s) de R$ 2,00
1 nota(s) de R$ 1,00

11257

11257
112 nota(s) de R$ 100,00
1 nota(s) de R$ 50,00
0 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
1 nota(s) de R$ 5,00
1 nota(s) de R$ 2,00
0 nota(s) de R$ 1,00

503

503
5 nota(s) de R$ 100,00
0 nota(s) de R$ 50,00
0 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
0 nota(s) de R$ 5,00
1 nota(s) de R$ 2,00
1 nota(s) de R$ 1,00
 */