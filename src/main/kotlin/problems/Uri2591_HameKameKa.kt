package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    var testes = ler.nextInt()

    for (i in 1..testes) {

        val kamehame = ler.next()

        val numeroPrimeirosA = kamehame.indexOf("m") - 1
        val numeroSegundosA = kamehame.reversed().indexOf("k") - 2

        print("k")
        for (i in 1..numeroPrimeirosA * numeroSegundosA)
            print("a")
        println()
    }
}
/*
URI Online Judge | 2591
HameKameKa
Por Ricardo Martins, IFSULDEMINAS BR Brazil

Timelimit: 1
O Hamekameka foi inventado por Mestre Hame praticado por cinquenta anos antes de conhecer Kogu. Chamando sua energia latente nas palmas de suas mãos, Hame consegue lançar um raio explosivo de energia. Kogu aprende após ver Mestre Hame usando-o para apagar as chamas na casa de um Rei. Para a surpresa de Hame, Kogu consegue performar a técnica de primeira, embora seja apenas forte o suficiente para destruir o carro que Chamya deu para Mulba. Kogu descobriu que há um padrão na pronúncia correta deste ataque, de modo que, se não for pronunciado corretamente, o mesmo não acontece.

Escreva um programa que, dada a parte inicial de um Hamekameka, faça a finalização ideal para que o ataque seja realizado com sucesso.

Entrada
A entrada começa com um valor C, indicando a quantidade de casos de teste. Em seguida, temos C linhas, cada uma com o início de um ataque, com, no máximo, 200 letras.

Saída
Para cada caso de teste, imprima a finalização adequada, para que o ataque se concretize.

Exemplo de Entrada	Exemplo de Saída
4
hamekame
haamekaame
haaamekaame
haaaamekaaame

ka
kaaaa
kaaaaaa
kaaaaaaaaaaaa

VII Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2017
 */