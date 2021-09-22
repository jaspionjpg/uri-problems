package problems

import java.text.NumberFormat
import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNextInt()) {
        var montante: String = ler.next()
        var centavos: String = ler.next()
        if (centavos.length == 1) {
            centavos = "0$centavos"
        }

        montante += ".$centavos"
        val valor = montante.toDouble()

        println(NumberFormat.getCurrencyInstance().format(valor))
    }
}

/*
URI Online Judge | 1309
Formatação Monetária
Por TopCoder*  EUA

Timelimit: 1
Frequentemente é necessário escrever valores monetários em um formato padrão. Decidimos a formatação de quantidades na seguinte forma:
   1. O montante deve começar com '$';
   2. A quantidade deve terminar com um ponto decimal e exatamente dois dígitos seguintes;
   3. Os dígitos à esquerda do ponto decimal devem ser separador em grupos de três por vírgulas.

Sua tarefa neste problema é criar um programa que, recebendo dois valores inteiros dólares e centavos retorne a String formatada corretamente.

Entrada
A entrada é composta por vários casos de teste. Cada caso de teste é composto por dois valores inteiros, dolares (0 ≤ dolares ≤ 2 * 109) e centavos (0 ≤ centavos ≤ 99), respectivamente.

Saída
Para cada caso de teste imprima a string formatada de acordo com os regras de formatação.

Exemplo de Entrada	Exemplo de Saída
123456
0
49734321
9
20502030
70

$123,456.00
$49,734,321.09
$20,502,030.70

* Este problema é de autoria do TopCoder (www.topcoder.com/tc) e foi adaptado por Mateus Lazarotto para utilização (autorizada) no URI OJ.
* A reprodução não autorizada deste problema sem o consentimento por escrito de TopCoder, Inc. é estritamente proibida.
 */