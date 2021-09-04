package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val a = ler.nextInt()
    val b = ler.nextInt()
    val c = ler.nextInt()
    val x = ler.nextInt()
    val y = ler.nextInt()
    val z = ler.nextInt()

    println((x / a) * (y / b) * (z / c))
}
/*
URI Online Judge | 2395
Transporte de Contêineres
Por OBI - Olimpíada Brasileira de Informática 2011 BR Brazil

Timelimit: 1
A Betalândia é um país que apenas recentemente se abriu para o comércio exterior e está preparando agora sua primeira grande exportação. A Sociedade Betalandesa de Comércio (SBC) ficou encarregada de conduzir a exportação e determinou que, seguindo os padrões internacionais, a carga será transportada em contêineres, que são, por sua vez, colocados em grandes navios para o transporte internacional.

Todos os contêineres betalandeses são idênticos, medindo A metros de largura, B metros de comprimento e C metros de altura. Um navio porta-contêineres pode ser visto como um retângulo horizontal de X metros de largura e Y metros de comprimento, sobre o qual os contêineres são colocados. Nenhuma parte de contêiner pode ficar para fora do navio. Além disso, para possibilitar a travessia de pontes, a altura máxima da carga no navio não pode ultrapassar Z metros.



Devido a limitações do guindaste utilizado, os contêineres só podem ser carregados alinhados com o navio. Ou seja, os contêineres só podem ser colocados sobre o navio de tal forma que a largura e o comprimento do contêiner estejam paralelos à largura e ao comprimento do navio, respectivamente.

A SBC está com problemas para saber qual a quantidade máxima de contêineres que podem ser colocados no navio e pede sua ajuda. Sua tarefa, neste problema, é determinar quantos contêineres podem ser carregados no navio respeitando as restrições acima.

Entrada
A entrada consiste de duas linhas. A primeira linha contém três inteiros A, B e C que representam as dimensões dos contêineres, enquanto a segunda linha contém outros três inteiros X, Y e Z (1 ≤ A, B, C, X, Y, Z ≤ 106) que representam as dimensões do navio.

Saída
Seu programa deve imprimir apenas uma linha contendo um inteiro que indica a quantidade máxima de contêineres que o navio consegue transportar.

Exemplos de Entrada	Exemplos de Saída
1 1 1

1 1 1

1

1 2 5

9 6 11

54

1 2 12

6 9 10

0

OBI - Olimpíada Brasileira de Informática 2011 Fase 1 Nível Júnior
 */