package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val peso1 = ler.nextInt()
    val comprimento1 = ler.nextInt()
    val peso2 = ler.nextInt()
    val comprimento2 = ler.nextInt()

    val equilibrio = (peso1 * comprimento1) - (peso2 * comprimento2)

    if (equilibrio == 0) println(0)
    else if (equilibrio > 0) println(-1)
    else println(1)
}

/*
URI Online Judge | 2455
Gangorra
Por OBI - Olimpíada Brasileira de Informática 2014 BR Brazil

Timelimit: 1
Joãozinho acaba de mudar de escola e a primeira coisa que percebeu na nova escola é que a gangorra do parquinho não é simétrica, uma das extremidades é mais longa que a outra. Após brincar algumas vezes com um amigo de mesmo peso, ele percebeu que quando está em uma extremidade, a gangorra se desequilibra para o lado dele (ou seja, ele fica na parte de baixo, e o amigo na parte de cima), mas quando eles trocam de lado, a gangorra se desequilibra para o lado do amigo. Sem entender a situação, Joãozinho pediu ajuda a outro amigo de outra série, que explicou que o comprimento do lado interfere no equilíbrio da gangorra, pois a gangorra estará equilibrada quando

P1 ∗ C1 = P2 ∗ C2

onde P1 e P2 são os pesos da criança no lado esquerdo e direito, respectivamente, e C1 e C2 são os comprimentos da gangorra do lado esquerdo e direito, respectivamente.

Entrada
A primeira e única linha da entrada contém 4 inteiros, P1, C1, P2 e C2, (10 ≤ P1, C1, P2 e C2 ≤ 100) nesta ordem.

Saída
Se a gangorra estiver equilibrada, imprima ‘0’. Se ela estiver desequilibrada de modo que a criança esquerda esteja na parte de baixo, imprima ‘-1’, senão, imprima ‘1’.

Exemplos de Entrada	Exemplos de Saída
30 100 60 50

0

40 40 38 60

1

35 80 35 75

-1

OBI - Olimpíada Brasileira de Informática 2014 Fase 1 Nível Júnior
 */
