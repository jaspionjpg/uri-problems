package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()

    for (teste in 1..testes) {
        val quantidadePessoas = ler.nextInt()
        val puloACadaMorte = ler.nextInt() - 1

        val pessoas = ArrayList<Int>()
        for (indiceInicialPessoa in 1..quantidadePessoas) {
            pessoas.add(indiceInicialPessoa)
        }

        var contador = puloACadaMorte
        while (pessoas.size != 1) {
            while (contador >= pessoas.size) {
                contador -= pessoas.size
            }
            pessoas.removeAt(contador)
            contador += puloACadaMorte
        }
        println("Case $teste: ${pessoas[0]}")
    }
}

/*
RI Online Judge | 1030
A Lenda de Flavious Josephus
Por Neilor Tonin, URI  Brasil

Timelimit: 1
O problema de Josephus é assim conhecido por causa da lenda de Flavius Josephus, um historiador judeu que viveu no século 1. Segundo o relato de Josephus do cerco de Yodfat, ele e seus companheiros (40 soldados) foram presos em uma caverna, cuja saída foi bloqueada pelos romanos. Eles preferiram suicidar-se a serem capturados, e decidiram que iriam formar um círculo e começar a matar-se pulando de três em três. Josephus afirma que, por sorte ou talvez pela mão de Deus, ele permaneceu por último e preferiu entregar-se aos romanos a suicidar-se.

Entrada
Haverá NC (1 ≤ NC ≤ 30 ) casos de teste. Em cada caso de teste de entrada haverá um par de números inteiros positivos n (1 ≤ n ≤ 10000 ) e k (1 ≤ k ≤ 1000). O  número n representa a quantidade de pessoas no círculo, numeradas de 1 até n. O número k representa o tamanho do salto de um homem até o próximo homem que será morto.

Segue um exemplo com 5 homens e um salto = 2.




Neste exemplo o elemento que restará após as eliminações é 3.
Saída
Para cada caso de teste de entrada será apresentada uma linha de saída no seguinte formato: Case n: m tendo sempre um espaço antes do n e do m.

Exemplo de Entrada	Exemplo de Saída
3
5 2
6 3
1234 233

Case 1: 3
Case 2: 1
Case 3: 25
 */