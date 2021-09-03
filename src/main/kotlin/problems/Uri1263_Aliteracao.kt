package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (ler.hasNextLine()) {
        val palavras = ler.nextLine().toLowerCase().split(" ")

        var numeroDeAlietacoes = 0

        var letraAlietada = '´'
        var jafoi = false
        for (palavra in palavras) {
            if (palavra[0] == letraAlietada) {
                if (!jafoi) {
                    numeroDeAlietacoes++
                    jafoi = true
                }
            } else {
                letraAlietada = palavra[0]
                jafoi = false
            }
        }

        println(numeroDeAlietacoes)
    }
}

/*
URI Online Judge | 1263
Aliteração
Por TopCoder*  EUA

Timelimit: 1
Uma aliteração ocorre quando duas ou mais palavras consecutivas de um texto possuem a mesma letra inicial (ignorando maiúsculas e minúsculas). Sua tarefa é desenvolver um programa que identifique, a partir de uma sequência de palavras, o número de aliterações que essa sequência possui.

Entrada
A entrada contém diversos casos de testes. Cada caso é expresso como um texto em uma única linha, contendo de 1 a 100 palavras separadas por um único espaço, cada palavra tendo de 1 a 50 letras minúsculas ou maiúsculas ('A'-'Z','a'-'z'). A entrada termina em EOF.

Saída
Para cada caso de teste imprima o número de aliterações existentes no texto informado, conforme exemplos abaixo.

Exemplo de Entrada	Exemplo de Saída
He has four fanatic fantastic fans
There may be no alliteration in a sequence
Round the rugged rock the ragged rascal ran
area artic Soul Silly subway ant artic none

2
0
2
3

* Este problema é de autoria do TopCoder (www.topcoder.com/tc) e foi adaptado por bitfreeze para utilização (autorizada) no URI OJ.
* A reprodução não autorizada deste problema sem o consentimento por escrito de TopCoder, Inc. é estritamente proibida.
 */