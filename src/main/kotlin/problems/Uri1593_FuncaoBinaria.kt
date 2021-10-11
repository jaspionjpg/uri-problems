package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()
    for (teste in 1..testes) {
        val soma1ns = ler.nextBigInteger().toString(2).count { it == '1' }
        println(soma1ns)
    }
}

/*
URI Online Judge | 1593
Função Binária
Por Bruno Adami, Universidade de São Paulo - São Carlos BR Brazil

Timelimit: 1
Definimos a paridade de um inteiro como a soma dos seus bits em sua representação binária computada módulo dois. Como exemplo, o número 2110 = 101012 possui três 1’s na sua representação binária e portanto ele teria paridade ímpar.

Neste problema, você deverá calcular o número de bits 1 em um inteiro I dado, ou seja, calcular a quantidade de 1’s na representação binária dele.
Entrada
Na primeira linha terá um inteiro T (T <= 100) indicando o número de casos de teste.

Para cada caso, haverá apenas uma linha com o número I (1 ≤ I < 1018* ou 1 ≤ I < 101000**).O número da entrada não começará com um ou mais zeros.
*ocorrerá em 90% dos casos;
**ocorrerá nos casos restantes.

Saída
Imprima o número de 1’s na representação binária para cada caso em uma única linha.

Exemplo de Entrada	Exemplo de Saída
3
21
3
123456789123456789123456789

3
2
50

O número da entrada não cabe em um inteiro! Leia-o como string.
Contest Seletiva USP São Carlos 2014
 */