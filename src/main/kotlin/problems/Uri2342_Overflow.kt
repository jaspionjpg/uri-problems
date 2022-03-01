package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val resultado = ler.nextInt()

    val valor1 = ler.nextInt()
    val acao = ler.next()
    val valor2 = ler.nextInt()

    val éOk = if (acao == "*") valor2 * valor1 <= resultado else valor2 + valor1 <= resultado

    if(éOk) println("OK")
    else println("OVERFLOW")
}

/*
beecrowd | 2342
Overflow
Por OBI - Olimpíada Brasileira de Informática 2009 BR Brazil

Timelimit: 1
Os computadores foram inventados para realizar cálculos muito rapidamente, e atendem a esse requisito de maneira extraordinária. Porém, nem toda conta pode ser feita num computador, pois ele não consegue representar todos os números dentro de sua memória. Em um computador pessoal atual, por exemplo, o maior inteiro que é possível representar em sua memória é 4.294.967.295. Caso alguma conta executada pelo computador dê um resultado acima desse número, ocorrerá o que chamamos de overflow, que é quando o computador faz uma conta e o resultado não pode ser representado, por ser maior do que o valor máximo permitido (em inglês overflow significa trasbordar).

Por exemplo, se um computador só pode representar números menores do que 1023 e mandamos ele executar a conta 1022 + 5, vai ocorrer overflow.

Dados o maior número que um computador consegue representar e uma expressão de soma ou multiplicação entre dois inteiros, determine se ocorrerá overflow.

Entrada
A entrada contém um único conjunto de testes, que deve ser lido do dispositivo de entrada padrão (normalmente o teclado).

A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 500.000) representando o maior número que o computador consegue representar. A segunda linha contém um inteiro P (0 ≤ P ≤ 1000), seguido de um espaço em branco, seguido de um caractere C (que pode ser ‘+’ ou ‘*’, representando os operadores de adição e multiplicação, respectivamente), seguido de um espaço em branco, seguido de um outro inteiro Q (0 ≤ Q ≤ 1000). Essa linha representa a expressão P + Q, se o caractere C for ‘+’, ou P × Q, se o caractere C for ‘*’.

Saída
Seu programa deve imprimir, na saída padrão, a palavra ‘OVERFLOW’ se o resultado da expressão causar um overflow, ou a palavra ‘OK’ caso contrário. Ambas as palavras devem ser escritas com letras maiúsculas.

Exemplos de Entrada	Exemplos de Saída
10

5 + 5

OK

44

23 * 2

OVERFLOW

323500

42 * 35

OK

OBI - Olimpíada Brasileira de Informática 2009 Fase 1 Nível 1
 */