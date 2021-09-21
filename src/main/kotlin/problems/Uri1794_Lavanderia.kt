package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var pecasDeRoupa = ler.nextInt()
    var minimoLavadora = ler.nextInt()
    var maximoLavadora = ler.nextInt()
    var minimoSecadora = ler.nextInt()
    var maximoSecadora = ler.nextInt()

    if (pecasDeRoupa >= minimoSecadora && pecasDeRoupa >= minimoLavadora
        && pecasDeRoupa <= maximoSecadora && pecasDeRoupa <= maximoLavadora
    )
        println("possivel")
    else
        println("impossivel")
}

/*
URI Online Judge | 1794 | [PJ]
Lavanderia
Por Cristhian Bonilha, UTFPR BR Brazil

Timelimit: 1
Cansada de lavar suas roupas sujas, sua mãe decidiu que a partir de agora quem lava suas roupas é você.

Na lavanderia da sua casa existe uma lavadora e uma secadora de roupas, cada uma com um limite mínimo e máximo de peças a serem lavadas e secadas por vez. Assim sendo, a lavadora só deve ser usada se forem colocadas no mínimo LA e no máximo LB peças dentro dela, e semelhantemente a secadora só deve ser usada se forem colocadas no mínimo SA e no máximo SB peças dentro dela.

Você tem atualmente N peças de roupa a serem lavadas e secadas, e quer descobrir se é possível usar a lavadora e secadora para lavar e secar todas as suas peças, seguindo as regras acima.

Entrada
Na primeira linha da entrada haverá um inteiro N (1 ≤ N ≤ 100).

Na segunda linha da entrada haverá dois inteiros LA e LB (1 ≤ LA < LB ≤ 100).

Na terceira linha da entrada haverá dois inteiros SA e SB (1 ≤ SA < SB ≤ 100).

Saída
Imprima a palavra "possivel" caso seja possível lavar e secar suas peças de roupa seguindo as regras descritas no enunciado, ou "impossivel" caso contrário.

Exemplos de Entrada	Exemplos de Saída
10
8 12
10 14

possivel

12
10 11
12 16

impossivel

20
10 20
20 30

possivel

Contest Oficial de Aquecimento da Olimpíada Brasileira de Informática 2015
 */