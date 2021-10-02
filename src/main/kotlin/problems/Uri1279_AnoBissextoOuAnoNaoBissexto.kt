package problems

import java.math.BigInteger
import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val _4 = BigInteger.valueOf(4)
    val _100 = BigInteger.valueOf(100)
    val _400 = BigInteger.valueOf(400)
    val _55 = BigInteger.valueOf(55)
    val _15 = BigInteger.valueOf(15)

    var testes = 0
    while (ler.hasNextBigInteger()) {
        if (testes != 0)
            println()

        val ano = ler.nextBigInteger()

        val bissexto =
            (ano.mod(_4).equals(BigInteger.ZERO) && !ano.mod(_100).equals(BigInteger.ZERO)) ||
                    (ano.mod(_100).equals(BigInteger.ZERO) && ano.mod(_400).equals(BigInteger.ZERO))
        val bulukulu = bissexto && ano.mod(_55).equals(BigInteger.ZERO)
        val huluculu = ano.mod(_15).equals(BigInteger.ZERO)

        if (bissexto)
            println("This is leap year.")
        if (huluculu)
            println("This is huluculu festival year.")
        if (bulukulu)
            println("This is bulukulu festival year.")

        if (!bissexto && !bulukulu && !huluculu)
            println("This is an ordinary year.")

        testes++
    }
}
/*
URI Online Judge | 1279
Ano Bissexto ou Ano não Bissexto
Por Shahriar Manzoor  Bangladesh

Timelimit: 2
A antiga raça de Gulamatu é muito avançada no seu esquema de cálculo dos anos. Eles entendem o que é ano bissexto (ano que é divisível por 4 e não é divisível por 100, com a ressalva de que ano que são divisíveis por 400 são também anos bissextos.), E têm também alguns anos que ocorrem alguns festivais. Um deles é o festival Huluculu (acontece em anos divisíveis por 15) e o festival Bulukulu (acontece em anos divisíveis por 55 desde que também seja um ano bissexto). Dado um ano você terá de indicar quais propriedades este ano tem. Se o ano não é ano bissexto e nem ano de festival imprima a linha 'This is an ordinary year.', ou seja, que é um ano comum. A ordem de impressão das propriedades dos anos (se presente) é leap year -> huluculu -> bulukulu.

Entrada
A entrada conterá vários casos de teste. Cada caso de teste consiste de uma linha contendo um ano que nunca será menor do que 2000 (para evitar regras anteriores diferentes para anos bissextos), mas pode ter mais do que 1.000 dígitos. O final da entrada é determinado por fim de arquivo (EOF).

Saída
Para cada entrada, imprima as diferentes propriedades dos anos em diferentes linhas de acordo com a descrição anterior e os exemplos fornecidos abaixo.  Uma linha em branco deve separar cada caso de teste de saída. Note que existem quatro diferentes propriedades. Obviamente não deverá ter uma linha em branco após o último caso de teste.

Exemplo de Entrada	Exemplo de Saída
2000
3600
4515
2001

This is leap year.

This is leap year.
This is huluculu festival year.

This is huluculu festival year.

This is an ordinary year.

Adaptado por Neilor.
 */

