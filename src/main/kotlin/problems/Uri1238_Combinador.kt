package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()
    for (i in 0 until testes) {
        val stringue1: String = ler.next()
        val stringue2: String = ler.next()

        val maiorTamanho = Math.max(stringue1.length, stringue2.length)

        var stringueFinal = ""
        for (indiceCaractere in 0 until maiorTamanho) {
            if (stringue1.length > indiceCaractere)
                stringueFinal += stringue1[indiceCaractere]

            if (stringue2.length > indiceCaractere)
                stringueFinal += stringue2[indiceCaractere]
        }
        println(stringueFinal)
    }
}

/*
URI Online Judge | 1238
Combinador
Por TopCoder*  EUA

Timelimit: 1
Implemente um programa denominado combinador, que recebe duas strings e deve combiná-las, alternando as letras de cada string, começando com a primeira letra da primeira string, seguido pela primeira letra da segunda string, em seguida pela segunda letra da primeira string, e assim sucessivamente. As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.

Entrada
A entrada contém vários casos de teste. A primeira linha contém um inteiro N que indica a quantidade de casos de teste que vem a seguir. Cada caso de teste é composto por uma linha que contém duas cadeias de caracteres, cada cadeia de caracteres contém entre 1 e 50 caracteres inclusive.

Saída
Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo e exiba a cadeia resultante.

Exemplo de Entrada	Exemplo de Saída
2
Tpo oCder
aa bb

TopCoder
abab

* Este problema é de autoria do TopCoder (www.topcoder.com/tc) e foi adaptado por Jeferson T. para utilização (autorizada) no URI OJ.
* A reprodução não autorizada deste problema sem o consentimento por escrito de TopCoder, Inc. é estritamente proibida.
 */