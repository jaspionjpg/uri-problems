package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val linha1 = IntArray(5) { ler.nextInt() }
    val linha2 = IntArray(5) { ler.nextInt() }

    if (linha1[0] == linha2[0] ||
        linha1[1] == linha2[1] ||
        linha1[2] == linha2[2] ||
        linha1[3] == linha2[3] ||
        linha1[4] == linha2[4]
    )
        println("N")
    else
        println("Y")
}

/*
URI Online Judge | 1743
Máquina de Verificação Automatizada
Por Ricardo Anido, UNICAMP BR Brasil

Timelimit: 1
A Internet Computer Parts Company (ICPC) é uma loja on-line que vende peças de computador. Pares de conectores elétricos em linha estão entre as peças mais populares que ICPC vende. No entanto, elas também são uma das peças que são devolvidos com mais freqüência por clientes insatisfeitos, porque devido a erros na embalagem os conectores enviados para os clientes podem não ser compatíveis..

Um conector em-linha é constituído por cinco pontos de ligação, marcadas de 1 a 5. Cada ponto de ligação de um conector pode ser ou um plugue ou uma tomada. Dizemos dois conectores são compatíveis se, para cada rótulo, um ponto de conexão é um plugue e outro ponto de ligação é uma tomada (em outras palavras, dois conectores são compatíveis se, para cada ponto de conexão com o mesmo rótulo, um plugue e uma tomada se encontram quando os dois conectores estão conectados).

A figura abaixo mostra exemplos de dois conectores que são compatíveis e dois conectores que não são compatíveis.



ICPC está introduzindo uma Máquina de Verificação Automártica (ACM) de última geração, com um verificador óptico, que vai verificar se os dois conectores embalados para um cliente são realmente compatíveis. O complexo e caro hardware do ACM está pronto, mas eles precisam de sua ajuda para terminar o software.

Dadas as descrições de um par de conectores em linha, sua tarefa é determinar se os conectores são compatíveis.

Entrada
A primeira linha contém cinco números inteiros Xi (0 ≤ Xi≤ 1 para i = 1, 2,..., 5), que representa os pontos de conexão do primeiro conector do par. A segunda linha contém cinco números inteiros Yi (0 ≤ Yi ≤ 1 para i = 1, 2,..., 5), que representa os pontos de conexão do segundo conector. Na entrada, um 0 representa uma tomada e um 1 representa um plugue.

Saída
Apresente uma linha com um caractere que representa se os conectores são compatíveis ou não. Se eles são compatíveis escrever a letra maiúscula "Y"; caso contrário, escrever a letra maiúscula "N".

Exemplos de Entrada	Exemplos de Saída
1 1 0 1 0
0 0 1 0 1

Y

1 0 0 1 0
1 0 1 1 0

N

ACM/ICPC Latin America Contest 2014.
 */