package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val testes = ler.nextLine().toInt()

    for (teste in 1..testes) {
        val palavras = ler.nextLine().trim().split(Regex("\\s+"))

        println(palavras.joinToString("") { palavra ->
            if (palavra.isNotEmpty()) palavra[0].toString()
            else ""
        })
    }
}

/*
URI Online Judge | 1272
Mensagem Oculta
Por TopCoder*  EUA

Timelimit: 1
Textos podem conter mensagens ocultas. Neste problema a mensagem oculta em um texto é composto pelas primeiras letras de cada palavra do texto, na ordem em que aparecem.

É dado um texto composto apenas por letras minúsculas ou espaços. Pode haver mais de um espaço entre as palavras. O texto pode iniciar ou terminar em espaços, ou mesmo conter somente espaços.

Entrada
A entrada contém vários casos de testes. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de uma única linha contendo de um a 50 caracteres, formado por letras minúsculas (‘a’-‘z’) ou espaços (‘ ’). Atenção para possíveis espaços no início ou no final do texto!

Nota: No exemplo de entrada os espaços foram substituídos por pequenos pontos (‘·’) para facilitar o entendimento dos exemplos.
Saída
Para cada caso de teste imprima a mensagem oculta no texto de entrada.

Exemplo de Entrada	Exemplo de Saída
4
compete·online·design·event·rating
··u····r·i··o····n·l··i····n··e···
·
round··elimination·during··onsite··contest

coder
urionline

redoc

* Este problema é de autoria do TopCoder (www.topcoder.com/tc) e foi adaptado por bitfreeze para utilização (autorizada) no URI OJ.
* A reprodução não autorizada deste problema sem o consentimento por escrito de TopCoder, Inc. é estritamente proibida.
 */