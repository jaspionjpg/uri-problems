package problems

import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    for (teste in 1..ler.nextInt()) {
        val numero = ler.next()
        val numeroSemVirgula = numero.replace(".", "")

        val numerosDepoisDaVirgula = numero.length - numero.indexOf('.') - 1

        val metadinha = numeroSemVirgula.length / 2
        val éPar = numeroSemVirgula.length % 2 == 0

        val inicio = numeroSemVirgula.substring(0, metadinha)
        val fim = numeroSemVirgula.substring(metadinha + if (éPar) 0 else 1)

        if (inicio == fim || inicio.reversed() == fim) {
            println(0)
            continue
        }

        if (true) {
            var diferenca = inicio.toInt() - fim.toInt()
            if (diferenca < 0)
                diferenca = fim.toInt() - inicio.toInt()

            val resultado = diferenca.toDouble().div(10.0.pow(numerosDepoisDaVirgula))

            val virgula = numero.toDouble() + resultado
            if ((virgula.toString().reversed() == virgula.toString())){
                println(resultado)
                continue
            }
        }

        if (true) {
            var diferenca = inicio.reversed().toInt() - fim.toInt()
            if (diferenca < 0)
                diferenca = fim.toInt() - inicio.toInt()

            val resultado = diferenca.toDouble().div(10.0.pow(numerosDepoisDaVirgula))

            val virgula = numero.toDouble() + resultado
            if (virgula.toString().reversed() == virgula.toString())
                println(resultado)
            continue
        }
    }
}

/*
beecrowd | 1872
Palíndromo Real
Por Ricardo Martins, IFSULDEMINAS BR Brazil

Timelimit: 1
Um palíndromo é uma palavra, frase ou qualquer outra sequência de unidades (como uma cadeia de ADN; Enzima de restrição) que tenha a propriedade de poder ser lida tanto da direita para a esquerda como da esquerda para a direita. Capicua ou número palíndromo é um número (ou conjunto de números) inteiros cujo reverso é ele próprio. Este problema quer que você analise um número real e verifique qual o menor valor que deve ser somado a este para que o mesmo se torne um palíndromo real, sem nome específico até o momento. Por exemplo, se o número for 101,099 , ao somar com 0,002, obteremos o palíndromo real 101,101. Outro exemplo seria o número 13,31 , que já é um palíndromo real, devendo somar 0 para que o mesmo continue assim. Um último exemplo é o número 100,9 , o qual deve somar 0,1 , para que a soma se torne 101.

Escreva um programa que, dado um número real, verifique qual o menor valor a ser somado para que o mesmo se torne um palíndromo real.

Entrada
Haverá diversos casos de teste. O primeiro número a ser lido será um inteiro C, representando a quantidade de casos de teste. Cada caso de teste tem um número real R (0 ≤ R ≤ 999.999,999999). Lembrando que a entrada terá, no máximo, 6 casas decimais, e que o separador decimal é o ponto ao invés da vírgula.

Saída
Para cada caso de teste, imprima o valor esperado, com a quantidade de casas necessária.

Exemplo de Entrada	Exemplo de Saída
3

101.099

13.31

100.9

0.002

0

0.1

V Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2015
 */