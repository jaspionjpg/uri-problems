package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (ler.hasNextLine()) {
        val frase = ler.nextLine().toLowerCase()

        var fraseFinal = ""
        var proximaUpercase = true
        for (caractere in frase) {
            if (caractere in 'a'..'z') {
                fraseFinal += if (proximaUpercase) caractere.toUpperCase()
                else caractere.toLowerCase()
                proximaUpercase = !proximaUpercase
            } else
                fraseFinal += caractere
        }
        println(fraseFinal)
    }
}

/*
URI Online Judge | 1234
Sentença Dançante
Por TopCoder*  EUA

Timelimit: 1
Uma sentença é chamada de dançante se sua primeira letra for maiúscula e cada letra subsequente for o oposto da letra anterior. Espaços devem ser ignorados ao determinar o case (minúsculo/maiúsculo) de uma letra. Por exemplo, "A b Cd" é uma sentença dançante porque a primeira letra ('A') é maiúscula, a próxima letra ('b') é minúscula, a próxima letra ('C') é maiúscula, e a próxima letra ('d') é minúscula.

Entrada
A entrada contém vários casos de teste. Cada caso de teste é composto por uma linha que contém uma sentença, que é uma string que contém entre 1 e 50 caracteres ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').

Saída
Transforme a sentença de entrada em uma sentença dançante (conforme o exemplo abaixo) trocando as letras para minúscula ou maiúscula onde for necessário. Todos os espaços da sentença original deverão ser preservados, ou seja, " sentence " deverá ser convertido para " SeNtEnCe ".

Exemplo de Entrada	Exemplo de Saída
This is a dancing sentence
  This   is         a  dancing   sentence
aaaaaaaaaaa
z

ThIs Is A dAnCiNg SeNtEnCe
  ThIs   Is         A  dAnCiNg   SeNtEnCe
AaAaAaAaAaA
Z

* Este problema é de autoria do TopCoder (www.topcoder.com/tc) e foi adaptado por Neilor para utilização (autorizada) no URI OJ.
* A reprodução não autorizada deste problema sem o consentimento por escrito de TopCoder, Inc. é estritamente proibida.
 */